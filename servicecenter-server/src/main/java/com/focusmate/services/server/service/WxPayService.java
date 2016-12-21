/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focusmate.services.common.config.enums.WxPayStatusEnum;
import com.focusmate.services.datasource.entities.Product;
import com.focusmate.services.datasource.entities.WXTransaction;
import com.focusmate.services.datasource.repository.ProductRepository;
import com.focusmate.services.datasource.repository.TimeDiscountRepository;
import com.focusmate.services.datasource.repository.WxTransactionRepository;
import com.focusmate.services.server.conf.LogNames;
import com.focusmate.services.server.utils.PriceGenerator;
import com.focusmate.services.wxpay.WxPayApi;
import com.focusmate.services.wxpay.dto.WXPayData;
import com.focusmate.services.wxpay.utils.RandomStringGenerator;

/**
 *
 * @author tianyuwei
 * @version id: WxPayService, v 0.1 16/12/18 下午3:11 tianyuwei Exp $$
 */
@Service
public class WxPayService {
    private final Logger            LOGGER    = LoggerFactory.getLogger(LogNames.SERVER_LOGGER);

    SimpleDateFormat                formatter = new SimpleDateFormat("yyyyMMddHHmmss");

    @Autowired
    private WxTransactionRepository wxTransactionRepository;

    @Autowired
    private ProductRepository       productRepository;

    @Autowired
    private TimeDiscountRepository  timeDiscountRepository;

    /**
     * 微信统一下单
     * @param openId
     * @param productId
     * @param is_subscribe
     * @return
     */
    public WXPayData UnifiedOrder(String openId, String productId, String is_subscribe) {
        try {
            /** 检查productId是否存在 */
            Product product = productRepository.selectByPrimaryKey(Integer.parseInt(productId));
            if (null == product) {
                throw new RuntimeException("产品不存在id=" + productId);
            }

            /** 创建微信订单Object, 配置参数 */
            WXPayData req = new WXPayData();
            req.SetValue("body", product.getTitle());
            req.SetValue("attach", product.getAttach());
            req.SetValue("product_id", product.getId());
            req.SetValue("openid", openId);
            req.SetValue("goods_tag", "focusmate");
            req.SetValue("trade_type", "NATIVE");
            Date date = new Date();
            req.SetValue("time_start", formatter.format(date).toString());
            req.SetValue("time_expire", formatter.format(date.getTime() + 1000 * 60 * 30).toString());// 设置半个小时后失效

            String trade_no = RandomStringGenerator.generateOutTradeNo();
            req.SetValue("out_trade_no", trade_no);

            int fee = 0;
            // 通过判断是否关注公众帐号来获取费用
            if (is_subscribe.equals("Y")) {
                fee = product.getSale();
            } else {
                fee = product.getPrice();
            }
            try {
                // 查询数据库,根据时间算费用
                req.SetValue("total_fee",
                    PriceGenerator.getSale(timeDiscountRepository.findByProductId(Integer.parseInt(productId)), fee));
            } catch (Exception e) {
                req.SetValue("total_fee", fee);//出错则采用原价
            }

            /** 在微信服务器上下单 : 若下单失败，则立即抛出异常,返回结果给微信支付后台 */
            WXPayData result = WxPayApi.UnifiedOrder(req);
            if (!result.IsSet("appid") || !result.IsSet("mch_id") || !result.IsSet("prepay_id")) {
                throw new RuntimeException("统一下单失败");
            }
            /** 内部下单 */
            orderTransaction(trade_no, openId, product.getStationId(), fee);

            return result;
        } catch (Exception e) {
            LOGGER.error("微信统一下单失败", e);
        }
        return null;
    }

    /**
     * 内部服务下单微信订单
     * @param transactionId
     * @param customId
     * @param stationId
     * @param fee
     */
    @Transactional
    public void orderTransaction(String transactionId, String customId, Integer stationId, Integer fee) {
        try {
            LOGGER.debug("服务内部统一下单");

            /** 创建微信订单 */
            WXTransaction transcation = new WXTransaction();
            transcation.setTranscationId(transactionId);
            transcation.setCustomId(customId);
            transcation.setStationId(stationId);
            transcation.setStatus(WxPayStatusEnum.ORDER.getValue());
            transcation.setFee(fee);
            Date date = new Date();
            transcation.setCreateTime(date);
            transcation.setLastModifyTime(date);

            wxTransactionRepository.insertSelective(transcation);
        } catch (Exception e) {
            LOGGER.error("创建微信订单状态出错, transactionId={}", transactionId, e);
            throw new RuntimeException(e);
        }
    }

    /**
     * 更新微信订单状态
     * @param transactionId
     * @param status
     * @return
     */
    @Transactional
    public int updateTransactionStatus(String transactionId, Integer status) {
        try {
            WXTransaction transaction = wxTransactionRepository.selectByPrimaryKey(transactionId);
            if (null == transaction) {
                LOGGER.error("设置微信订单状态失败,订单号不存在, transcation id {}", transactionId);
                return 0;
            }

            /* 防止微信服务器结果通知，重复设置订单状态 */
            if (status == WxPayStatusEnum.PAY.getValue() && transaction.getStatus() != WxPayStatusEnum.ORDER.getValue()) {
                return 0;
            } else {
                transaction.setFinishTime(new Date());//设置结束时间
                transaction.setStatus(status);//修改订单状态
            }

            return wxTransactionRepository.updateByPrimaryKeySelective(transaction);
        } catch (Exception e) {
            LOGGER.error("更新微信订单状态出错, transactionId={}", transactionId, e);
            throw new RuntimeException(e);
        }
    }
}
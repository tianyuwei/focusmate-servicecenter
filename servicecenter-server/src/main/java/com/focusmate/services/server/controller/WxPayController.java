/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.controller;

import static com.focusmate.services.server.conf.ServerConstacts.WX_TRANSACTION_SERVICE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.focusmate.services.common.config.enums.WxPayStatusEnum;
import com.focusmate.services.common.utils.JsonUtils;
import com.focusmate.services.server.conf.LogNames;
import com.focusmate.services.server.conf.ServerConstacts;
import com.focusmate.services.server.mq.dto.TransactionDTO;
import com.focusmate.services.server.service.MessageSubscriberService;
import com.focusmate.services.server.service.WxPayService;
import com.focusmate.services.wxpay.WxPayApi;
import com.focusmate.services.wxpay.dto.WXPayData;
import com.focusmate.services.wxpay.utils.RandomStringGenerator;
import com.focusmate.services.wxpay.utils.WxPayConfigure;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 微信支付接口类
 * @author tianyuwei
 * @version id: WxPayController, v 0.1 16/12/20 下午3:44 tianyuwei Exp $$
 */
@RestController
@RequestMapping(value = ServerConstacts.BASE_PATH + "/wxpay")
@Api(value = "微信支付外部调用Api")
public class WxPayController {
    private final Logger             LOGGER = LoggerFactory.getLogger(LogNames.SERVER_LOGGER);

    @Autowired
    private WxPayService             wxPayService;

    @Autowired
    private MessageSubscriberService messageSubscriberService;

    @ApiOperation(value = "微信支付通知接口", notes = "扫码支付模式一回调处理类. 接收微信支付后台发送的扫码结果，调用统一下单接口并将下单结果返回给微信支付后台")
    @RequestMapping(value = "/notify", method = RequestMethod.POST)
    public String WXPayNotice(@ApiParam("请求数据") @RequestBody String requestData) {

        /** 将请求的XML数据转换成object */
        WXPayData notifyData = new WXPayData();
        try {
            notifyData.FromXML(requestData);
        } catch (Exception e) {
            // 若签名错误，则立即返回结果给微信支付后台
            WXPayData res = new WXPayData();
            res.SetValue("return_code", "FAIL");
            res.SetValue("return_msg", e.getMessage());
            LOGGER.error("签名错误 : {}", res.ToXml());
            return res.ToXml();
        }

        /** 检查openid和product_id是否返回 */
        if (!notifyData.IsSet("openid") || !notifyData.IsSet("product_id")) {
            WXPayData res = new WXPayData();
            res.SetValue("return_code", "FAIL");
            res.SetValue("return_msg", "回调数据异常");
            LOGGER.error("支付结果错误 : {}", res.ToXml());
            return res.ToXml();
        }

        /** 调统一下单接口，获得下单结果 */
        String openid = notifyData.GetValue("openid").toString();
        String product_id = notifyData.GetValue("product_id").toString();
        String is_subscribe = notifyData.GetValue("is_subscribe").toString();

        WXPayData unifiedOrderResult = wxPayService.UnifiedOrder(openid, product_id, is_subscribe);
        if (unifiedOrderResult == null) {
            WXPayData res = new WXPayData();
            res.SetValue("return_code", "FAIL");
            res.SetValue("return_msg", "统一下单失败");
            LOGGER.error("UnifiedOrder failure : " + res.ToXml());
            return res.ToXml();
        }

        /** 统一下单成功,则返回成功结果给微信支付后台*/
        WXPayData data = new WXPayData();
        data.SetValue("return_code", "SUCCESS");
        data.SetValue("return_msg", "OK");
        data.SetValue("appid", WxPayConfigure.getAppid());
        data.SetValue("mch_id", WxPayConfigure.getMchid());
        data.SetValue("nonce_str", RandomStringGenerator.getRandomStringByLength(32));
        data.SetValue("prepay_id", unifiedOrderResult.GetValue("prepay_id"));
        data.SetValue("result_code", "SUCCESS");
        data.SetValue("err_code_des", "OK");
        data.SetValue("sign", data.makeSign());
        return data.ToXml();
    }

    @ApiOperation(value = "微信支付结果通知接口", notes = "支付结果通知回调处理类, 负责接收微信支付后台发送的支付结果并对订单有效性进行验证， 将验证结果反馈给微信支付后台")
    @RequestMapping(value = "/result-notify", method = RequestMethod.POST)
    public String ResultNotify(@ApiParam("请求数据") @RequestBody String requestData) {
        /** 将请求的XML数据转换成object */
        WXPayData notifyData = new WXPayData();
        try {
            notifyData.FromXML(requestData);
        } catch (Exception e) {
            e.printStackTrace();
            // 若签名错误，则立即返回结果给微信支付后台
            WXPayData res = new WXPayData();
            res.SetValue("return_code", "FAIL");
            res.SetValue("return_msg", e.getMessage());
            LOGGER.error("签名错误 : {}", res.ToXml());
            return res.ToXml();
        }

        /** 检查支付结果中transaction_id是否存在*/
        if (!notifyData.IsSet("transaction_id")) {
            // 若transaction_id不存在，则立即返回结果给微信支付后台
            WXPayData res = new WXPayData();
            res.SetValue("return_code", "FAIL");
            res.SetValue("return_msg", "支付结果中微信订单号不存在");
            LOGGER.error("支付结果错误 : {}", res.ToXml());
            return res.ToXml();
        }

        String transaction_id = notifyData.GetValue("transaction_id").toString();
        String trad_no = notifyData.GetValue("out_trade_no").toString();
        /**查询订单，判断订单真实性*/
        try {
            if (QueryOrder(transaction_id)) {
                //更新微信订单交易状态
                wxPayService.updateTransactionStatus(trad_no, WxPayStatusEnum.PAY.getValue());
                //发送订单到对应的队列
                TransactionDTO dto = new TransactionDTO(trad_no, WxPayStatusEnum.PAY.getValue(),
                    System.currentTimeMillis());
                messageSubscriberService.sendMessageByTransactionId(trad_no, WX_TRANSACTION_SERVICE,
                    JsonUtils.jsonFromObject(dto));

                WXPayData res = new WXPayData();
                res.SetValue("return_code", "SUCCESS");
                res.SetValue("return_msg", "OK");
                LOGGER.info("微信订单真实性校验成功 : ", res.ToXml());
                return res.ToXml();
            }
        } catch (Exception e) {// 若在调订单查询接口时抛异常，立即返回结果给微信支付后台
            LOGGER.error("微信订单真实性校验、状态更新或者发送订单出错", e);
        }
        WXPayData res = new WXPayData();
        res.SetValue("return_code", "FAIL");
        res.SetValue("return_msg", "订单查询失败");
        return res.ToXml();
    }

    /**
     * 查询订单
     * @param transaction_id
     * @return
     * @throws Exception
     */
    private boolean QueryOrder(String transaction_id) throws Exception {
        WXPayData req = new WXPayData();
        req.SetValue("transaction_id", transaction_id);
        WXPayData res = WxPayApi.OrderQuery(req);
        if (res.IsSet("return_code") && res.GetValue("return_code").toString().equals("SUCCESS")
            && res.IsSet("result_code") && res.GetValue("result_code").toString().equals("SUCCESS")) {
            return true;
        } else {
            return false;
        }
    }
}

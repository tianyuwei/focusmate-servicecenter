/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.controller;

import static com.focusmate.services.server.conf.ServerConstacts.STATION_STATUS_FIELD;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.focusmate.services.common.config.BaseConstants;
import com.focusmate.services.common.config.enums.StationStatusEnum;
import com.focusmate.services.datasource.entities.Workshop;
import com.focusmate.services.datasource.repository.WorkshopRepository;
import com.focusmate.services.server.conf.LogNames;
import com.focusmate.services.server.conf.ServerConstacts;
import com.focusmate.services.server.controller.dto.ResultDTO;
import com.focusmate.services.server.service.WxPayService;

import io.swagger.annotations.*;

/**
 * 洗车站点接口
 * @author tianyuwei
 * @version id: StationController, v 0.1 16/11/19 下午2:43 tianyuwei Exp $$
 */
@RestController
@RequestMapping(value = ServerConstacts.BASE_PATH + "/station")
@Api(value = "洗车站点相关Api")
public class StationController {
    private final Logger       LOGGER = LoggerFactory.getLogger(LogNames.SERVER_LOGGER);

    @Autowired
    private WorkshopRepository workshopRepository;

    @Autowired
    private WxPayService       wxPayService;

    @ApiImplicitParams({ @ApiImplicitParam(paramType = "header", name = BaseConstants.OAUTH_TOKEN_HEADER, required = true, value = "service token", dataType = "String") })
    @ApiOperation(value = "站点状态报告接口", notes = "站点上报当前状态")
    @RequestMapping(value = "/report/{stationId}/{status}", method = RequestMethod.GET)
    public ResultDTO reportStationStatus(@ApiParam("站点Id") @PathVariable("stationId") Integer stationId,
                                         @ApiParam("状态") @PathVariable("status") String status,
                                         HttpServletRequest request) {
        ResultDTO dto = new ResultDTO();
        StationStatusEnum statusItem = StationStatusEnum.fromValue(status);
        if (statusItem != null) {
            request.getSession().setAttribute(STATION_STATUS_FIELD, statusItem.getValue());
            dto.setCode(HttpStatus.OK.value());
            dto.setSuccess(true);
        } else {
            dto.setCode(HttpStatus.PRECONDITION_FAILED.value());
            dto.setMessage("status参数错误");
            dto.setSuccess(false);
        }
        return dto;
    }

    @ApiImplicitParams({ @ApiImplicitParam(paramType = "header", name = BaseConstants.OAUTH_TOKEN_HEADER, required = true, value = "service token", dataType = "String") })
    @ApiOperation(value = "PLC状态报告接口", notes = "PLC上报当前状态")
    @RequestMapping(value = "/plc/report/{stationId}/{status}", method = RequestMethod.GET)
    public ResultDTO reportWorkshopStatus(@ApiParam("站点Id") @PathVariable("stationId") Integer stationId,
                                          @ApiParam("PLC状态") @PathVariable("status") String status) {
        ResultDTO dto = new ResultDTO();
        try {
            if (StringUtils.isBlank(status)) {
                throw new IllegalArgumentException("status参数错误");
            }

            Workshop workshop = new Workshop();
            workshop.setStationId(stationId);
            workshop.setStatus(status);
            workshop.setCreateTime(new Date());
            workshop.setLastModifyTime(new Date());
            workshopRepository.insertSelective(workshop);

            dto.setSuccess(true);
            dto.setCode(HttpStatus.OK.value());
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                dto.setCode(HttpStatus.PRECONDITION_FAILED.value());
            } else {
                LOGGER.error("存储PLC状态到数据库失败, stationId={},status={}", stationId, status, e);
                dto.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            }
            dto.setMessage(e.getMessage());
            dto.setSuccess(false);
        }
        return dto;
    }

    @ApiImplicitParams({ @ApiImplicitParam(paramType = "header", name = BaseConstants.OAUTH_TOKEN_HEADER, required = true, value = "service token", dataType = "String") })
    @ApiOperation(value = "微信支付订单核销接口", notes = "上传微信订单号以及对应的状态进行对账核销")
    @RequestMapping(value = "/wxpay/verification", method = RequestMethod.GET)
    public ResultDTO verifyWxPayTransaction(@ApiParam("微信订单号") @RequestParam(value = "transactionId") String transactionId,
                                            @ApiParam("核销状态") @RequestParam(value = "status") Integer status) {
        ResultDTO dto = new ResultDTO();
        try {
            if (StringUtils.isBlank(transactionId)) {
                throw new IllegalArgumentException("订单号参数错误");
            }
            int result = wxPayService.updateTransactionStatus(transactionId, status);
            if (result > 0) {
                dto.setSuccess(true);
            } else {
                dto.setSuccess(false);
                dto.setMessage("订单号不存在");
            }
            dto.setCode(HttpStatus.OK.value());
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                dto.setCode(HttpStatus.PRECONDITION_FAILED.value());
            } else {
                LOGGER.error("更新微信订单状态到数据库失败, transactionId={},status={}", transactionId, status, e);
                dto.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            }
            dto.setMessage(e.getMessage());
            dto.setSuccess(false);
        }
        return dto;
    }
}

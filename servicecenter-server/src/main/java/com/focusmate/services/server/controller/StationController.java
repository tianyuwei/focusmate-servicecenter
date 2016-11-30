/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.focusmate.services.common.config.BaseConstants;
import com.focusmate.services.server.conf.ServerContacts;

import io.swagger.annotations.*;

/**
 * 洗车站点接口
 * @author tianyuwei
 * @version id: StationController, v 0.1 16/11/19 下午2:43 tianyuwei Exp $$
 */
@RestController
@RequestMapping(value = ServerContacts.BASE_PATH + "/station")
@Api(value = "洗车站点相关Api")
public class StationController {

    @ApiImplicitParams({ @ApiImplicitParam(paramType = "header", name = BaseConstants.OAUTH_TOKEN_HEADER, required = true, value = "service token", dataType = "String") })
    @ApiOperation(value = "站点状态报告接口", notes = "站点上报当前状态")
    @RequestMapping(value = "/report/{id}/{status}", method = RequestMethod.GET)
    public String reportStationStatus(@ApiParam("站点Id") @PathVariable("id") String id,
                                      @ApiParam("状态") @PathVariable("status") String status) {
        return "success";
    }
}

/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.focusmate.services.common.config.BaseConstants;
import com.focusmate.services.common.config.BaseErrorKeyConstants;
import com.focusmate.services.common.exception.CustomException;

/**
 * Token校验器
 * @author tianyuwei
 * @version id: TokenValidation, v 0.1 16/11/30 下午3:05 tianyuwei Exp $$
 */
@Component
public class TokenValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(TokenValidator.class);

    public void validate(HttpServletRequest req, HttpServletResponse res) {

        String token = req.getHeader(BaseConstants.OAUTH_TOKEN_HEADER);
        if (StringUtils.isBlank(token)) {
            LOGGER.error("无法识别token'{}'的类型.", token);
            throw new CustomException(BaseErrorKeyConstants.OAUTH_UNAUTHORIZED);
        }
        boolean isAuthorized = false;
        if (BaseConstants.DEFAULT_SERVICE_TOKEN.equals(token)) {
            isAuthorized = true;
        }

        if (!isAuthorized) {
            LOGGER.error("token '{}' is not valid.", token);
            throw new CustomException(BaseErrorKeyConstants.OAUTH_UNAUTHORIZED);
        }
    }
}

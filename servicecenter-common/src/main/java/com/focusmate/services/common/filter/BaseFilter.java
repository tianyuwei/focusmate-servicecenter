/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.focusmate.services.common.config.BaseErrorKeyConstants;
import com.focusmate.services.common.exception.CustomException;
import com.focusmate.services.common.exception.api.dto.CustomApiExceptionResponse;
import com.focusmate.services.common.utils.CustomExceptionUtils;
import com.focusmate.services.common.utils.JsonConverter;

/**
 * 基础请求过滤器
 * @author tianyuwei
 * @version id: BaseFilter, v 0.1 16/11/30 下午2:34 tianyuwei Exp $$
 */
public abstract class BaseFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseFilter.class);

    @Autowired
    private TokenValidator      tokenValidator;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
                                                                                                                 throws IOException,
                                                                                                                 ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        if (!req.getMethod().equalsIgnoreCase("OPTIONS") && toBeFiltered(req)) {
            servletResponse.setContentType(MediaType.APPLICATION_JSON.toString());
            CustomApiExceptionResponse apiException = null;
            try {
                //验证请求中的Token
                tokenValidator.validate(req, res);
                filterChain.doFilter(servletRequest, servletResponse);
            } catch (CustomException e) {
                LOGGER.error(ExceptionUtils.getStackTrace(e));
                if (e.getErrorKey() != null) {
                    apiException = CustomExceptionUtils.getApiExceptionByErrorKey(e.getErrorKey(), e.getArgs());
                    apiException.getErrors().addAll(e.getErrorStack());
                } else {
                    apiException = e.getExceptionResponse();
                }
            } catch (Throwable e) {
                LOGGER.error(ExceptionUtils.getStackTrace(e));
                apiException = CustomExceptionUtils.getApiExceptionByErrorKey(e.getClass().getName());
                if (apiException == null) {
                    apiException = CustomExceptionUtils.getApiExceptionByErrorKey(BaseErrorKeyConstants.UNKNOWN_ERROR);
                }
            }

            if (apiException != null) {
                LOGGER.error(JsonConverter.toJsonString(apiException));
                res.setStatus(apiException.getHttpCode());
                JsonConverter.getInstance().getObjectWriter()
                    .writeValue(servletResponse.getOutputStream(), apiException);
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    protected abstract boolean toBeFiltered(HttpServletRequest req);

    @Override
    public void destroy() {

    }
}

/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.filter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.focusmate.services.common.config.BaseErrorKeyConstants;
import com.focusmate.services.common.exception.CustomException;
import com.focusmate.services.common.exception.api.dto.CustomApiExceptionResponse;
import com.focusmate.services.common.utils.CustomExceptionUtils;

/**
 * 全局异常处理器
 * @author tianyuwei
 * @version id: GlobalExceptionHandler, v 0.1 16/11/25 下午1:48 tianyuwei Exp $$
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 自定义异常捕获
     * @param e
     * @param response
     * @return
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public CustomApiExceptionResponse handleException(CustomException e, HttpServletResponse response) {

        if (e.getErrorKey() != null) {
            CustomApiExceptionResponse result = CustomExceptionUtils.getApiExceptionByErrorKey(e.getErrorKey(),
                e.getArgs());
            if (result != null) {
                if (result.getHttpCode() >= 400 && result.getHttpCode() < 500) {
                    LOGGER.debug("handle enniu api meet exception : [{}]", e.getErrorKey(), e);
                } else {
                    LOGGER.error("handle enniu api exception [{}]", e.getErrorKey(), e);
                }
                response.setStatus(result.getHttpCode());
                result.getErrors().addAll(e.getErrorStack());
                return result;
            } else {
                LOGGER.error("can't find EnniuApiExceptionResponse by errorKey : [{}]", e.getErrorKey(), e);
                CustomApiExceptionResponse exceptionResponse = new CustomApiExceptionResponse();
                response.setStatus(500);
                exceptionResponse.addError(500, "未知异常");
                return exceptionResponse;
            }
        }
        response.setStatus(e.getExceptionResponse().getHttpCode());
        return e.getExceptionResponse();

    }

    /**
     * 未知异常捕获
     * @param e
     * @param response
     * @return
     */
    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public CustomApiExceptionResponse unknownException(Exception e, HttpServletResponse response) {
        LOGGER.error(ExceptionUtils.getStackTrace(e));
        CustomApiExceptionResponse result = CustomExceptionUtils
            .getApiExceptionByErrorKey(BaseErrorKeyConstants.UNKNOWN_ERROR);
        response.setStatus(result.getHttpCode());
        return result;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    public CustomApiExceptionResponse handleException(MissingServletRequestParameterException e,
                                                      HttpServletResponse response) {
        LOGGER.error(ExceptionUtils.getStackTrace(e));
        CustomApiExceptionResponse result = CustomExceptionUtils.getApiExceptionByErrorKey(
            BaseErrorKeyConstants.PARAM_REQUIRED, e.getParameterName());
        response.setStatus(result.getHttpCode());
        return result;
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public CustomApiExceptionResponse handleException(HttpMessageNotReadableException e, HttpServletResponse response) {
        LOGGER.error(ExceptionUtils.getStackTrace(e));
        CustomApiExceptionResponse result = CustomExceptionUtils
            .getApiExceptionByErrorKey(BaseErrorKeyConstants.BAD_REQUEST);
        response.setStatus(result.getHttpCode());
        return result;
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    @ResponseBody
    public CustomApiExceptionResponse handleException(HttpMediaTypeNotSupportedException e, HttpServletResponse response) {
        LOGGER.error(ExceptionUtils.getStackTrace(e));
        CustomApiExceptionResponse result = CustomExceptionUtils
            .getApiExceptionByErrorKey(BaseErrorKeyConstants.MEDIA_TYPE_UNSUPPORTED);
        response.setStatus(result.getHttpCode());
        return result;
    }

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    @ResponseBody
    public CustomApiExceptionResponse handleException(HttpMediaTypeNotAcceptableException e,
                                                      HttpServletResponse response) {
        LOGGER.error(ExceptionUtils.getStackTrace(e));
        CustomApiExceptionResponse result = CustomExceptionUtils
            .getApiExceptionByErrorKey(BaseErrorKeyConstants.MEDIA_TYPE_NOTACCEPTABLE);
        response.setStatus(result.getHttpCode());
        return result;
    }

    @ExceptionHandler(TypeMismatchException.class)
    @ResponseBody
    public CustomApiExceptionResponse handleException(TypeMismatchException e, HttpServletResponse response) {
        LOGGER.error(ExceptionUtils.getStackTrace(e));
        CustomApiExceptionResponse result = CustomExceptionUtils
            .getApiExceptionByErrorKey(BaseErrorKeyConstants.TYPE_MISMATCH);
        response.setStatus(result.getHttpCode());
        return result;
    }
}

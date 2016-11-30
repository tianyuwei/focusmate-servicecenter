/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.exception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.focusmate.services.common.exception.api.dto.CustomApiError;
import com.focusmate.services.common.exception.api.dto.CustomApiExceptionResponse;
import com.focusmate.services.common.utils.CustomExceptionUtils;

/**
 *
 * @author tianyuwei
 * @version id: CustomException, v 0.1 16/11/25 下午5:05 tianyuwei Exp $$
 */
public class CustomException extends RuntimeException {
    private static final Logger        LOGGER     = LoggerFactory.getLogger(CustomException.class);

    private String                     errorKey;

    private List<String>               args       = new ArrayList<String>();

    private List<CustomApiError>       errorStack = new ArrayList<CustomApiError>();

    private CustomApiExceptionResponse exceptionResponse;

    public CustomException(String errorKey, String... args) {
        this.errorKey = errorKey;
        if (args != null) {
            this.args.addAll(Arrays.asList(args));
        }
    }

    public CustomException(CustomApiExceptionResponse exceptionResponse) {
        this.exceptionResponse = exceptionResponse;
    }

    public String getErrorKey() {
        return this.errorKey;
    }

    public List<String> getArgs() {
        return Collections.unmodifiableList(args);
    }

    public List<CustomApiError> getErrorStack() {
        return Collections.unmodifiableList(errorStack);
    }

    public CustomApiExceptionResponse getExceptionResponse() {
        return exceptionResponse;
    }

    public CustomException addApiException(CustomApiExceptionResponse apiException) {
        errorStack.addAll(apiException.getErrors());
        return this;
    }

    @Override
    public String getMessage() {
        CustomApiExceptionResponse response = null;
        if (this.getErrorKey() != null) {
            response = CustomExceptionUtils.getApiExceptionByErrorKey(this.getErrorKey(), this.getArgs());
            if (response != null) {
                response.getErrors().addAll(this.getErrorStack());
            } else {
                LOGGER.error("errorkey [{}] can't find EnniuApiExceptionResponse", this.getErrorKey());
            }
        } else {
            response = this.getExceptionResponse();
        }

        if (response != null) {
            return response.toString();
        } else {
            return "";
        }
    }
}

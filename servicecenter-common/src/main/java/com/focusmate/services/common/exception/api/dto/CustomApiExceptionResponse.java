/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.exception.api.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.focusmate.services.common.utils.JsonConverter;

/**
 * 异常输出信息结构
 * @author tianyuwei
 * @version id: CustomApiExceptionResponse, v 0.1 16/11/25 下午1:53 tianyuwei Exp $$
 */
public class CustomApiExceptionResponse {
    @JsonIgnore
    private int                  httpCode;

    private List<CustomApiError> errors = new ArrayList<>();

    public void addError(int code, String error) {
        errors.add(new CustomApiError(code, error));
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public List<CustomApiError> getErrors() {
        return errors;
    }

    public void setErrors(List<CustomApiError> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        try {
            return JsonConverter.getInstance().getObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return super.toString();
        }
    }
}

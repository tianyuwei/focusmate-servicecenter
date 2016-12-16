/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.controller.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author tianyuwei
 * @version id: BaseDTO, v 0.1 16/12/15 下午8:20 tianyuwei Exp $$
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultDTO<T> implements Serializable {

    public static final String SUCCESS_MSG = "success";

    public static final String FAILED__MSG = "failed";

    private boolean            success;

    private T                  data;

    private int                code;

    private String             message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

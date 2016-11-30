/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.exception.api.dto;

/**
 * 错误输出
 * @author tianyuwei
 * @version id: CustomApiError, v 0.1 16/11/25 下午1:52 tianyuwei Exp $$
 */
public class CustomApiError {
    private int    code;

    private String message;

    public CustomApiError(int code, String message) {
        this.code = code;
        this.message = message;
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

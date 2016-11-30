/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.utils;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.focusmate.services.common.exception.api.dto.CustomApiExceptionResponse;

/**
 * 异常信息处理工具
 * @author tianyuwei
 * @version id: ExceptionUtils, v 0.1 16/11/25 下午3:47 tianyuwei Exp $$
 */
public class CustomExceptionUtils {

    public static CustomApiExceptionResponse getApiExceptionByErrorKey(String errMsg, String... args) {
        return getErrors(errMsg, args);
    }

    public static CustomApiExceptionResponse getApiExceptionByErrorKey(String errMsg, List<String> args) {
        return getErrors(errMsg, args.toArray(new String[] {}));
    }

    /**
     * 解析错误信息
     * @param fullMsg
     * @param args
     * @return
     */
    private static CustomApiExceptionResponse getErrors(String fullMsg, String... args) {
        if (!StringUtils.isBlank(fullMsg)) {
            String[] msgs = fullMsg.trim().split(";");

            String reason = "";
            int httpCode = 500;
            int code = 500;
            if (msgs.length == 2) {
                code = Integer.parseInt(msgs[0]);
                httpCode = code;
                reason = msgs[1];
            }

            for (String arg : args) {
                if (arg != null) {
                    reason = StringUtils.replaceOnce(reason, "{}", arg);
                }
            }

            CustomApiExceptionResponse response = new CustomApiExceptionResponse();
            response.setHttpCode(httpCode);
            response.addError(code, reason);
            return response;
        } else {
            return null;
        }
    }
}

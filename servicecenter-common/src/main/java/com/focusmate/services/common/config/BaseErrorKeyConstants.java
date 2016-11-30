/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.config;

/**
 *
 * @author tianyuwei
 * @version id: BaseErrorKeyConstants, v 0.1 16/11/25 下午4:25 tianyuwei Exp $$
 */
public class BaseErrorKeyConstants {
    public static final String BAD_REQUEST                = "400;请求不正确.";
    public static final String PARAM_NULL                 = "400;参数'{}'不能为空.";
    public static final String PARAM_REQUIRED             = "400;参数'{}'是必须的.";
    public static final String PARAM_INVALID              = "400;参数'{}'不正确.";
    public static final String OAUTH_UNAUTHORIZED         = "401;请求未经过认证.";
    public static final String RESOURCE_FORBIDDEN         = "403;无权访问所请求资源.";
    public static final String RESOURCE_VERSION_INCORRECT = "400;'{}'资源版本已过期.";
    public static final String RESOURCE_VERSION_INVALID   = "400;资源版本'{}'无效";
    public static final String API_NOT_FOUND              = "404;请求资源不存在.";
    public static final String MEDIA_TYPE_UNSUPPORTED     = "415;不支持的媒体类型.";
    public static final String MEDIA_TYPE_NOTACCEPTABLE   = "406;请求所需返回的媒体类型与服务端不匹配.";
    public static final String TYPE_MISMATCH              = "400;参数类型不匹配.";
    public static final String USER_ID_INVALID            = "400;用户id'{}'无效.";

    public static final String CONFIG_NOT_EXIST           = "400;配置项'{}'不存在.";
    public static final String CONFIG_NOT_INTEGER         = "400;配置项'{}'必须为整数.";
    public static final String CONFIG_NOT_FLOAT           = "400;配置项'{}'必须为浮点数.";

    public static final String UNKNOWN_ERROR              = "500;服务器发生未知错误.";
}

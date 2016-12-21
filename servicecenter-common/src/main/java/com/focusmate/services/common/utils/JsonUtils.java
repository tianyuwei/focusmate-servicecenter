/**
 * u51.com Inc.
 * Copyright (c) 2004-2015 All Rights Reserved.
 */
package com.focusmate.services.common.utils;

import java.io.StringWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author tianyuwei
 * @version $Id: JsonUtils.java, v 0.1 2015年7月17日 上午11:19:30 byshome Exp $
 */
public class JsonUtils {
    public static final  Logger       LOGGER = LoggerFactory.getLogger(JsonUtils.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    /**
     * 对象转json
     * 
     * @param object
     * @return
     */
    public static String jsonFromObject(Object object) {
        StringWriter writer = new StringWriter();
        try {
            mapper.writeValue(writer, object);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            LOGGER.error("Unable to serialize to json: " + object, e);
            return null;
        }
        return writer.toString();
    }

    /**
     * json转对象
     *
     * @param json
     * @param klass
     * @return
     */
    public static <T> T objectFromJson(String json, TypeReference<T> klass) {
        T object = null;
        try {
            //设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            object = mapper.readValue(json, klass);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return object;
    }

    /**
     * json转对象,根据对象类型
     * @param json
     * @param valueType
     * @param <T>
     * @return
     */
    public static <T> T objectFromJson(String json, Class<T> valueType) {
        T object = null;
        try {
            //设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            object = mapper.readValue(json, valueType);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return object;
    }
}
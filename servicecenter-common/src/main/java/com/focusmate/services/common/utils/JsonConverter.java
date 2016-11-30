/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.common.utils;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 *
 * @author tianyuwei
 * @version id: JsonConverter, v 0.1 16/11/25 下午4:46 tianyuwei Exp $$
 */
public class JsonConverter {
    private final ObjectWriter objectWriter;
    private final ObjectReader objectReader;
    private final ObjectMapper objectMapper;

    private static class JsonConverterHolder {
        private static final JsonConverter INSTANCE = new JsonConverter();
    }

    private JsonConverter() {
        objectMapper = new ObjectMapper();
        SimpleDateFormat myDateFormat = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX"));
        objectMapper.setDateFormat(myDateFormat);
        objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectWriter = objectMapper.writer();
        objectReader = objectMapper.reader();
    }

    public static JsonConverter getInstance() {
        return JsonConverterHolder.INSTANCE;
    }

    public static String toJsonString(Object obj) {
        try {
            return getInstance().getObjectMapper().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return obj.toString();
        }
    }

    public ObjectWriter getObjectWriter() {
        return objectWriter;
    }

    public ObjectReader getObjectReader() {
        return objectReader;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}

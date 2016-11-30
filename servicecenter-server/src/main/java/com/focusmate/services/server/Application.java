/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.base.Charsets;
import com.google.common.collect.Lists;

/**
 * Application启动类
 * @author tianyuwei
 * @version id: Application, v 0.1 16/11/10 上午11:37 tianyuwei Exp $$
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = { "com.focusmate.services.datasource", "com.focusmate.services.server",
                        "com.focusmate.services.common" })
public class Application extends WebMvcConfigurerAdapter {
    /**
     * 程序入口
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * Response消息内容转换配置
     * @return
     */
    @Bean
    public StringHttpMessageConverter messageConverter() {
        StringHttpMessageConverter converter = new StringHttpMessageConverter(Charsets.UTF_8);
        converter.setSupportedMediaTypes(Lists.newArrayList(MediaType.APPLICATION_JSON_UTF8));
        return converter;
    }
}

/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.conf;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置
 * @author tianyuwei
 * @version id: SwaggerConfig, v 0.1 16/11/10 上午11:58 tianyuwei Exp $$
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.ui.enable}")
    private boolean environmentSpecificBooleanFlag;

    @Bean
    public Docket docketFactory() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
            .paths(regex("/(server/).*")).build()
            .apiInfo(new ApiInfo("FocusMate Service API", "分美技术有限公司-服务中心API", "1.0", "WEB端中心服务", "TianyuWei", "", ""))
            .enable(environmentSpecificBooleanFlag);
    }
}

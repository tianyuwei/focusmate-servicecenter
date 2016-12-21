/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 * ActiveMQ 配置
 * @author tianyuwei
 * @version id: ActiveMQConfiguration, v 0.1 16/12/16 下午4:06 tianyuwei Exp $$
 */
@EnableJms
@Configuration
public class ActiveMQConfiguration {

    //    @Bean
    //    public Queue queue() {
    //        return new ActiveMQQueue("station_1_transaction");
    //    }
}

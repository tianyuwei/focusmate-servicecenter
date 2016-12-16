/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.conf;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 *
 * @author tianyuwei
 * @version id: ActiveMQConfiguration, v 0.1 16/12/16 下午4:06 tianyuwei Exp $$
 */
@EnableJms
@Configuration
public class ActiveMQConfiguration {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("wx_transcation_queue");
    }
}

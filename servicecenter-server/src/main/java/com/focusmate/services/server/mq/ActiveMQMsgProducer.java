/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * ActiveMQ 消息生产者
 * @author tianyuwei
 * @version id: Producer, v 0.1 16/12/16 下午4:12 tianyuwei Exp $$
 */
@Component
public class ActiveMQMsgProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendByDestination(String destination, String msg) {
        this.jmsMessagingTemplate.convertAndSend(destination, msg);
    }
}

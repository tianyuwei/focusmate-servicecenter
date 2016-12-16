/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.mq;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * ActiveMQ 消息生产者
 * @author tianyuwei
 * @version id: Producer, v 0.1 16/12/16 下午4:12 tianyuwei Exp $$
 */
@Component
public class ActiveMQMsgProducer implements CommandLineRunner {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue                queue;

    public void send(String msg) {
        this.jmsMessagingTemplate.convertAndSend("wx_transcation_queue", msg);
        //        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }

    @Override
    public void run(String... strings) throws Exception {
        send("Sample message");
        System.out.println("Message was sent to the Queue");
    }
}

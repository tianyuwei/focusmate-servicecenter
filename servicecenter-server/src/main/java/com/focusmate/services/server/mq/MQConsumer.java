/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.mq;

import org.springframework.jms.annotation.JmsListener;

/**
 * ActiveMQ 消息处理类
 * @author tianyuwei
 * @version id: Consumer, v 0.1 16/12/16 下午4:15 tianyuwei Exp $$
 */
//@Component
public class MQConsumer {

    @JmsListener(destination = "station_1_transaction")
    public void receiveQueue(String text) {
        System.out.println("consumer get:" + text);
    }
}

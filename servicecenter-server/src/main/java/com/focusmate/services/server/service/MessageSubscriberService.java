/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.server.service;

import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.focusmate.services.common.utils.JsonUtils;
import com.focusmate.services.datasource.entities.MessageSubscriber;
import com.focusmate.services.datasource.repository.MessageSubscriberRepository;
import com.focusmate.services.server.mq.ActiveMQMsgProducer;
import com.focusmate.services.server.mq.dto.MessageDTO;
import com.google.common.base.Preconditions;

/**
 * 消息订阅者服务
 * @author tianyuwei
 * @version id: MessageSubscriberService, v 0.1 16/12/20 下午6:30 tianyuwei Exp $$
 */
@Service
public class MessageSubscriberService {
    @Autowired
    private MessageSubscriberRepository messageSubscriberRepository;

    @Autowired
    private ActiveMQMsgProducer         activeMQMsgProducer;

    public void sendMessageByTransactionId(String transactionId, String serviceName, String msg) {
        Preconditions.checkNotNull(StringUtils.isNotBlank(msg), "transactionId不能为空");
        Preconditions.checkArgument(StringUtils.isNotBlank(msg), "消息内容不能为空");

        MessageSubscriber subscriber = messageSubscriberRepository.selectByTransactionId(transactionId);
        if (subscriber != null && StringUtils.isNotBlank(subscriber.getQueue())) {
            MessageDTO dto = new MessageDTO();
            dto.setUuid(UUID.randomUUID().toString());
            dto.setTime(System.currentTimeMillis());
            dto.setService(serviceName);
            dto.setContent(msg);
            activeMQMsgProducer.sendByDestination(subscriber.getQueue(), JsonUtils.jsonFromObject(dto));
        } else {
            throw new RuntimeException("无法获取消息订阅者信息");
        }
    }
}

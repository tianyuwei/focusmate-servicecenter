/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.focusmate.services.datasource.entities.MessageSubscriber;
import com.focusmate.services.datasource.mapper.MessageSubscriberMapper;
import com.focusmate.services.datasource.repository.MessageSubscriberRepository;

/**
 *
 * @author tianyuwei
 * @version id: MessageSubscriberRepositoryImpl, v 0.1 16/12/20 下午6:28 tianyuwei Exp $$
 */
@Repository
public class MessageSubscriberRepositoryImpl implements MessageSubscriberRepository {

    @Autowired
    private MessageSubscriberMapper mapper;

    @Override
    public MessageSubscriber selectByPrimaryKey(Integer stationId) {
        return mapper.selectByPrimaryKey(stationId);
    }

    @Override
    public MessageSubscriber selectByTransactionId(String transactionId) {
        return mapper.selectByTransactionId(transactionId);
    }
}

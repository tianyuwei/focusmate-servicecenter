/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository;

import com.focusmate.services.datasource.entities.MessageSubscriber;

/**
 *
 * @author tianyuwei
 * @version id: MessageSubscriberRepository, v 0.1 16/12/20 下午6:26 tianyuwei Exp $$
 */
public interface MessageSubscriberRepository {
    MessageSubscriber selectByPrimaryKey(Integer stationId);

    MessageSubscriber selectByTransactionId(String transactionId);
}

/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.focusmate.services.datasource.entities.WXTransaction;
import com.focusmate.services.datasource.mapper.WXTransactionMapper;
import com.focusmate.services.datasource.repository.WxTransactionRepository;

/**
 *
 * @author tianyuwei
 * @version id: WxPayRepositoryImpl, v 0.1 16/12/18 下午3:15 tianyuwei Exp $$
 */
@Repository
public class WxTransactionRepositoryImpl implements WxTransactionRepository {

    @Autowired
    private WXTransactionMapper mapper;

    @Override
    public WXTransaction selectByPrimaryKey(String transactionId) {
        return mapper.selectByPrimaryKey(transactionId);
    }

    @Override
    public int insertSelective(WXTransaction transaction) {
        return mapper.insertSelective(transaction);
    }

    @Override
    public int updateByPrimaryKeySelective(WXTransaction transaction) {
        return mapper.updateByPrimaryKeySelective(transaction);
    }
}

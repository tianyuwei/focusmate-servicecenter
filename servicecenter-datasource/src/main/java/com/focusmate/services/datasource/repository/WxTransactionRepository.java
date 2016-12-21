/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository;

import com.focusmate.services.datasource.entities.WXTransaction;

/**
 * 微信订单
 * @author tianyuwei
 * @version id: WxPayRepository, v 0.1 16/12/18 下午3:15 tianyuwei Exp $$
 */
public interface WxTransactionRepository {

    WXTransaction selectByPrimaryKey(String transactionId);

    int insertSelective(WXTransaction transaction);

    int updateByPrimaryKeySelective(WXTransaction transaction);
}

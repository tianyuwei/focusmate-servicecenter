/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.conf;

import org.springframework.transaction.TransactionException;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 在手写事务执行初修改数据源为master
 * @author tianyuwei
 * @version id: DataSourceTransactionTemplate, v 0.1 16/11/6 下午3:13 tianyuwei Exp $$
 */
public class DataSourceTransactionTemplate extends TransactionTemplate {
    /**  */
    private static final long serialVersionUID = 7978292239094603798L;

    /**
     * 执行事务初设置数据源
     * @see TransactionTemplate#execute(TransactionCallback)
     */
    @Override
    public <T> T execute(TransactionCallback<T> action) throws TransactionException {
        DataSourceSwitcher.setMasterWithDontChangeSetMode();//设置为主数据库
        return super.execute(action);
    }
}

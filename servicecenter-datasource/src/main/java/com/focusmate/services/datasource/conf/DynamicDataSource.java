/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.conf;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 * @author tianyuwei
 * @version id: DynamicDataSource, v 0.1 16/11/6 下午3:31 tianyuwei Exp $$
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    /**
     * @see AbstractRoutingDataSource#determineCurrentLookupKey()
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceSwitcher.getDataSource();
    }

}
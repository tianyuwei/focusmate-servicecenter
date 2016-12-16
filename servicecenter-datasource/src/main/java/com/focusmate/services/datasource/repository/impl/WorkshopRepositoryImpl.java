/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.focusmate.services.datasource.entities.Workshop;
import com.focusmate.services.datasource.mapper.WorkshopMapper;
import com.focusmate.services.datasource.repository.WorkshopRepository;

/**
 *
 * @author tianyuwei
 * @version id: WorkshopRepositoryImpl, v 0.1 16/12/15 下午9:20 tianyuwei Exp $$
 */
@Repository
public class WorkshopRepositoryImpl implements WorkshopRepository {

    @Autowired
    private WorkshopMapper workshopMapper;

    @Override
    public int insertSelective(Workshop record) {
        return workshopMapper.insertSelective(record);
    }
}

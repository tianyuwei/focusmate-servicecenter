/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.focusmate.services.datasource.entities.TimeDiscount;
import com.focusmate.services.datasource.entities.TimeDiscountExample;
import com.focusmate.services.datasource.mapper.TimeDiscountMapper;
import com.focusmate.services.datasource.repository.TimeDiscountRepository;

/**
 *
 * @author tianyuwei
 * @version id: TimeDiscountRepositoryImpl, v 0.1 16/12/20 下午4:25 tianyuwei Exp $$
 */
@Repository
public class TimeDiscountRepositoryImpl implements TimeDiscountRepository {

    @Autowired
    private TimeDiscountMapper mapper;

    @Override
    public List<TimeDiscount> findByProductId(Integer productId) {
        TimeDiscountExample example = new TimeDiscountExample();
        example.createCriteria().andProductIdEqualTo(productId);

        return mapper.selectByExample(example);
    }
}

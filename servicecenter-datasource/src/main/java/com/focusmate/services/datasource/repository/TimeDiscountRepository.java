/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository;

import com.focusmate.services.datasource.entities.TimeDiscount;

import java.util.List;

/**
 *
 * @author tianyuwei
 * @version id: TimeDiscountRepository, v 0.1 16/12/20 下午4:24 tianyuwei Exp $$
 */
public interface TimeDiscountRepository {

    List<TimeDiscount> findByProductId(Integer productId);
}

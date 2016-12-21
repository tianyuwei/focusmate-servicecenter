/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository;

import com.focusmate.services.datasource.entities.Product;

/**
 *
 * @author tianyuwei
 * @version id: ProductRepository, v 0.1 16/12/20 下午4:17 tianyuwei Exp $$
 */
public interface ProductRepository {

    Product selectByPrimaryKey(Integer id);
}

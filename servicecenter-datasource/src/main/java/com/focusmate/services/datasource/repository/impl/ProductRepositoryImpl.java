/**
 * focusmate.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.focusmate.services.datasource.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.focusmate.services.datasource.entities.Product;
import com.focusmate.services.datasource.mapper.ProductMapper;
import com.focusmate.services.datasource.repository.ProductRepository;

/**
 *
 * @author tianyuwei
 * @version id: ProductRepositoryImpl, v 0.1 16/12/20 下午4:18 tianyuwei Exp $$
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Product selectByPrimaryKey(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }
}

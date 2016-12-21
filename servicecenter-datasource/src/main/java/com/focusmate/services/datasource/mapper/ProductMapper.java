package com.focusmate.services.datasource.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.focusmate.services.datasource.annotations.MasterDataSource;
import com.focusmate.services.datasource.entities.Product;
import com.focusmate.services.datasource.entities.ProductExample;

/**
 * 产品表
 * Product
 */
public interface ProductMapper {
    /**
     * 获取符合条件的记录数
     * Product
     */
    int countByExample(ProductExample example);

    /**
     * 删除符合条件的记录
     * Product
     */
    @MasterDataSource
    int deleteByExample(ProductExample example);

    /**
     * 删除指定主键的记录
     * Product
     */
    @MasterDataSource
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增记录
     * Product
     */
    @MasterDataSource
    int insert(Product record);

    /**
     * 选择性字段新增记录
     * Product
     */
    @MasterDataSource
    int insertSelective(Product record);

    /**
     * 获取指定条件的记录
     * Product
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * 获取指定主键的记录
     * Product
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * 选择性字段更新指定条件的记录
     * Product
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * 更新指定条件的记录
     * Product
     */
    @MasterDataSource
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * 选择性字段更新指定主键的记录
     * Product
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(Product record);

    /**
     * 更新指定主键的记录
     * Product
     */
    @MasterDataSource
    int updateByPrimaryKey(Product record);
}
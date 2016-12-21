package com.focusmate.services.datasource.mapper;

import java.util.List;

import com.focusmate.services.datasource.annotations.MasterDataSource;
import org.apache.ibatis.annotations.Param;

import com.focusmate.services.datasource.entities.TimeDiscount;
import com.focusmate.services.datasource.entities.TimeDiscountExample;

/**
 * 时间折扣表
 * TimeDiscount
 */
public interface TimeDiscountMapper {
    /**
     * 获取符合条件的记录数
     * TimeDiscount
     */
    int countByExample(TimeDiscountExample example);

    /**
     * 删除符合条件的记录
     * TimeDiscount
     */
    @MasterDataSource
    int deleteByExample(TimeDiscountExample example);

    /**
     * 删除指定主键的记录
     * TimeDiscount
     */
    @MasterDataSource
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增记录
     * TimeDiscount
     */
    @MasterDataSource
    int insert(TimeDiscount record);

    /**
     * 选择性字段新增记录
     * TimeDiscount
     */
    @MasterDataSource
    int insertSelective(TimeDiscount record);

    /**
     * 获取指定条件的记录
     * TimeDiscount
     */
    List<TimeDiscount> selectByExample(TimeDiscountExample example);

    /**
     * 获取指定主键的记录
     * TimeDiscount
     */
    TimeDiscount selectByPrimaryKey(Integer id);

    /**
     * 选择性字段更新指定条件的记录
     * TimeDiscount
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") TimeDiscount record, @Param("example") TimeDiscountExample example);

    /**
     * 更新指定条件的记录
     * TimeDiscount
     */
    @MasterDataSource
    int updateByExample(@Param("record") TimeDiscount record, @Param("example") TimeDiscountExample example);

    /**
     * 选择性字段更新指定主键的记录
     * TimeDiscount
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(TimeDiscount record);

    /**
     * 更新指定主键的记录
     * TimeDiscount
     */
    @MasterDataSource
    int updateByPrimaryKey(TimeDiscount record);
}
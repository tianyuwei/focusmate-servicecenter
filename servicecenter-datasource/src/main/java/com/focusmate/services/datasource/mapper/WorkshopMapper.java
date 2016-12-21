package com.focusmate.services.datasource.mapper;

import java.util.List;

import com.focusmate.services.datasource.annotations.MasterDataSource;
import org.apache.ibatis.annotations.Param;

import com.focusmate.services.datasource.entities.Workshop;
import com.focusmate.services.datasource.entities.WorkshopExample;

/**
 * 工作间表
 * Workshop
 */
public interface WorkshopMapper {
    /**
     * 获取符合条件的记录数
     * Workshop
     */
    int countByExample(WorkshopExample example);

    /**
     * 删除符合条件的记录
     * Workshop
     */
    @MasterDataSource
    int deleteByExample(WorkshopExample example);

    /**
     * 删除指定主键的记录
     * Workshop
     */
    @MasterDataSource
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增记录
     * Workshop
     */
    @MasterDataSource
    int insert(Workshop record);

    /**
     * 选择性字段新增记录
     * Workshop
     */
    @MasterDataSource
    int insertSelective(Workshop record);

    /**
     * 获取指定条件的记录
     * Workshop
     */
    List<Workshop> selectByExample(WorkshopExample example);

    /**
     * 获取指定主键的记录
     * Workshop
     */
    Workshop selectByPrimaryKey(Integer id);

    /**
     * 选择性字段更新指定条件的记录
     * Workshop
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") Workshop record, @Param("example") WorkshopExample example);

    /**
     * 更新指定条件的记录
     * Workshop
     */
    @MasterDataSource
    int updateByExample(@Param("record") Workshop record, @Param("example") WorkshopExample example);

    /**
     * 选择性字段更新指定主键的记录
     * Workshop
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(Workshop record);

    /**
     * 更新指定主键的记录
     * Workshop
     */
    @MasterDataSource
    int updateByPrimaryKey(Workshop record);
}
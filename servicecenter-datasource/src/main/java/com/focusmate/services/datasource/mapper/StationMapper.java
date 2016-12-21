package com.focusmate.services.datasource.mapper;

import java.util.List;

import com.focusmate.services.datasource.annotations.MasterDataSource;
import org.apache.ibatis.annotations.Param;

import com.focusmate.services.datasource.entities.Station;
import com.focusmate.services.datasource.entities.StationExample;

/**
 * 洗车站点表
 * Station
 */
public interface StationMapper {
    /**
     * 获取符合条件的记录数
     * Station
     */
    int countByExample(StationExample example);

    /**
     * 删除符合条件的记录
     * Station
     */
    @MasterDataSource
    int deleteByExample(StationExample example);

    /**
     * 删除指定主键的记录
     * Station
     */
    @MasterDataSource
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增记录
     * Station
     */
    @MasterDataSource
    int insert(Station record);

    /**
     * 选择性字段新增记录
     * Station
     */
    @MasterDataSource
    int insertSelective(Station record);

    /**
     * 获取指定条件的记录
     * Station
     */
    List<Station> selectByExample(StationExample example);

    /**
     * 获取指定主键的记录
     * Station
     */
    Station selectByPrimaryKey(Integer id);

    /**
     * 选择性字段更新指定条件的记录
     * Station
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * 更新指定条件的记录
     * Station
     */
    @MasterDataSource
    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * 选择性字段更新指定主键的记录
     * Station
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(Station record);

    /**
     * 更新指定主键的记录
     * Station
     */
    @MasterDataSource
    int updateByPrimaryKey(Station record);
}
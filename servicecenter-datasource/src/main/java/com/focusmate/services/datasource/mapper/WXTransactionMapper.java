package com.focusmate.services.datasource.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.focusmate.services.datasource.annotations.MasterDataSource;
import com.focusmate.services.datasource.entities.WXTransaction;
import com.focusmate.services.datasource.entities.WXTransactionExample;

/**
 * 微信订单表
 * WxTransaction
 */
public interface WXTransactionMapper {
    /**
     * 获取符合条件的记录数
     * WxTransaction
     */
    int countByExample(WXTransactionExample example);

    /**
     * 删除符合条件的记录
     * WxTransaction
     */
    @MasterDataSource
    int deleteByExample(WXTransactionExample example);

    /**
     * 删除指定主键的记录
     * WxTransaction
     */
    @MasterDataSource
    int deleteByPrimaryKey(String transcationId);

    /**
     * 新增记录
     * WxTransaction
     */
    @MasterDataSource
    int insert(WXTransaction record);

    /**
     * 选择性字段新增记录
     * WxTransaction
     */
    @MasterDataSource
    int insertSelective(WXTransaction record);

    /**
     * 获取指定条件的记录
     * WxTransaction
     */
    List<WXTransaction> selectByExample(WXTransactionExample example);

    /**
     * 获取指定主键的记录
     * WxTransaction
     */
    WXTransaction selectByPrimaryKey(String transcationId);

    /**
     * 选择性字段更新指定条件的记录
     * WxTransaction
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") WXTransaction record, @Param("example") WXTransactionExample example);

    /**
     * 更新指定条件的记录
     * WxTransaction
     */
    @MasterDataSource
    int updateByExample(@Param("record") WXTransaction record, @Param("example") WXTransactionExample example);

    /**
     * 选择性字段更新指定主键的记录
     * WxTransaction
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(WXTransaction record);

    /**
     * 更新指定主键的记录
     * WxTransaction
     */
    @MasterDataSource
    int updateByPrimaryKey(WXTransaction record);
}
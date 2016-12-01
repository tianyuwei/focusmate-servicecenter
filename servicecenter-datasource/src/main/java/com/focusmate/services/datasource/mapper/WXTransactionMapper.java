package com.focusmate.services.datasource.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.focusmate.services.datasource.annotations.MasterDataSource;
import com.focusmate.services.datasource.entities.WXTransaction;
import com.focusmate.services.datasource.entities.WXTransactionExample;

/**
 * wx_transaction
 */
public interface WXTransactionMapper {
    /**
     * 获取符合条件的记录数
     * wx_transaction
     */
    int countByExample(WXTransactionExample example);

    /**
     * 删除符合条件的记录
     * wx_transaction
     */
    @MasterDataSource
    int deleteByExample(WXTransactionExample example);

    /**
     * 删除指定主键的记录
     * wx_transaction
     */
    @MasterDataSource
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增记录
     * wx_transaction
     */
    @MasterDataSource
    int insert(WXTransaction record);

    /**
     * 选择性字段新增记录
     * wx_transaction
     */
    @MasterDataSource
    int insertSelective(WXTransaction record);

    /**
     * 获取指定条件的记录
     * wx_transaction
     */
    List<WXTransaction> selectByExample(WXTransactionExample example);

    /**
     * 获取指定主键的记录
     * wx_transaction
     */
    WXTransaction selectByPrimaryKey(Integer id);

    /**
     * 选择性字段更新指定条件的记录
     * wx_transaction
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") WXTransaction record, @Param("example") WXTransactionExample example);

    /**
     * 更新指定条件的记录
     * wx_transaction
     */
    @MasterDataSource
    int updateByExample(@Param("record") WXTransaction record, @Param("example") WXTransactionExample example);

    /**
     * 选择性字段更新指定主键的记录
     * wx_transaction
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(WXTransaction record);

    /**
     * 更新指定主键的记录
     * wx_transaction
     */
    @MasterDataSource
    int updateByPrimaryKey(WXTransaction record);
}
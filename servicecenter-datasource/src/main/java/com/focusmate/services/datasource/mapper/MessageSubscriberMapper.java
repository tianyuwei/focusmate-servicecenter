package com.focusmate.services.datasource.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.focusmate.services.datasource.annotations.MasterDataSource;
import com.focusmate.services.datasource.entities.MessageSubscriber;
import com.focusmate.services.datasource.entities.MessageSubscriberExample;

/**
 * 消息订阅者
 * MessageSubscriber
 */
public interface MessageSubscriberMapper {
    /**
     * 获取符合条件的记录数
     * MessageSubscriber
     */
    int countByExample(MessageSubscriberExample example);

    /**
     * 删除符合条件的记录
     * MessageSubscriber
     */
    @MasterDataSource
    int deleteByExample(MessageSubscriberExample example);

    /**
     * 删除指定主键的记录
     * MessageSubscriber
     */
    @MasterDataSource
    int deleteByPrimaryKey(Integer stationId);

    /**
     * 新增记录
     * MessageSubscriber
     */
    @MasterDataSource
    int insert(MessageSubscriber record);

    /**
     * 选择性字段新增记录
     * MessageSubscriber
     */
    @MasterDataSource
    int insertSelective(MessageSubscriber record);

    /**
     * 获取指定条件的记录
     * MessageSubscriber
     */
    List<MessageSubscriber> selectByExample(MessageSubscriberExample example);

    /**
     * 获取指定主键的记录
     * MessageSubscriber
     */
    MessageSubscriber selectByPrimaryKey(Integer stationId);

    MessageSubscriber selectByTransactionId(String transactionId);

    /**
     * 选择性字段更新指定条件的记录
     * MessageSubscriber
     */
    @MasterDataSource
    int updateByExampleSelective(@Param("record") MessageSubscriber record,
                                 @Param("example") MessageSubscriberExample example);

    /**
     * 更新指定条件的记录
     * MessageSubscriber
     */
    @MasterDataSource
    int updateByExample(@Param("record") MessageSubscriber record, @Param("example") MessageSubscriberExample example);

    /**
     * 选择性字段更新指定主键的记录
     * MessageSubscriber
     */
    @MasterDataSource
    int updateByPrimaryKeySelective(MessageSubscriber record);

    /**
     * 更新指定主键的记录
     * MessageSubscriber
     */
    @MasterDataSource
    int updateByPrimaryKey(MessageSubscriber record);
}
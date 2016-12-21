package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * 消息订阅者
 * MessageSubscriber
 */
public class MessageSubscriber {
    /**
     * 主键, 洗车站点ID号
     * MessageSubscriber.StationId
     */
    private Integer stationId;

    /**
     * 订阅者名称
     * MessageSubscriber.Name
     */
    private String name;

    /**
     * 消息队列名
     * MessageSubscriber.Queue
     */
    private String queue;

    /**
     * 消息主题名
     * MessageSubscriber.Topic
     */
    private String topic;

    /**
     * 0-正常，1删除
     * MessageSubscriber.Status
     */
    private Integer status;

    /**
     * 创建时间
     * MessageSubscriber.CreateTime
     */
    private Date createTime;

    /**
     * 修改时间
     * MessageSubscriber.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 主键, 洗车站点ID号
     * MessageSubscriber.StationId
     *
     * @return the value of MessageSubscriber.StationId
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 主键, 洗车站点ID号
     * MessageSubscriber.StationId
     *
     * @param stationId the value for MessageSubscriber.StationId
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * 订阅者名称
     * MessageSubscriber.Name
     *
     * @return the value of MessageSubscriber.Name
     */
    public String getName() {
        return name;
    }

    /**
     * 订阅者名称
     * MessageSubscriber.Name
     *
     * @param name the value for MessageSubscriber.Name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 消息队列名
     * MessageSubscriber.Queue
     *
     * @return the value of MessageSubscriber.Queue
     */
    public String getQueue() {
        return queue;
    }

    /**
     * 消息队列名
     * MessageSubscriber.Queue
     *
     * @param queue the value for MessageSubscriber.Queue
     */
    public void setQueue(String queue) {
        this.queue = queue == null ? null : queue.trim();
    }

    /**
     * 消息主题名
     * MessageSubscriber.Topic
     *
     * @return the value of MessageSubscriber.Topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * 消息主题名
     * MessageSubscriber.Topic
     *
     * @param topic the value for MessageSubscriber.Topic
     */
    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    /**
     * 0-正常，1删除
     * MessageSubscriber.Status
     *
     * @return the value of MessageSubscriber.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0-正常，1删除
     * MessageSubscriber.Status
     *
     * @param status the value for MessageSubscriber.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * MessageSubscriber.CreateTime
     *
     * @return the value of MessageSubscriber.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * MessageSubscriber.CreateTime
     *
     * @param createTime the value for MessageSubscriber.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * MessageSubscriber.LastModifyTime
     *
     * @return the value of MessageSubscriber.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 修改时间
     * MessageSubscriber.LastModifyTime
     *
     * @param lastModifyTime the value for MessageSubscriber.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
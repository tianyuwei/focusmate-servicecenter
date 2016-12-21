package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * 工作间表
 * Workshop
 */
public class Workshop {
    /**
     * Workshop.Id
     */
    private Integer id;

    /**
     * 洗车站点ID号
     * Workshop.StationId
     */
    private Integer stationId;

    /**
     * 工作间状态信息
     * Workshop.Status
     */
    private String status;

    /**
     * 创建时间
     * Workshop.CreateTime
     */
    private Date createTime;

    /**
     * 修改时间
     * Workshop.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * Workshop.Id
     *
     * @return the value of Workshop.Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Workshop.Id
     *
     * @param id the value for Workshop.Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 洗车站点ID号
     * Workshop.StationId
     *
     * @return the value of Workshop.StationId
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 洗车站点ID号
     * Workshop.StationId
     *
     * @param stationId the value for Workshop.StationId
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * 工作间状态信息
     * Workshop.Status
     *
     * @return the value of Workshop.Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 工作间状态信息
     * Workshop.Status
     *
     * @param status the value for Workshop.Status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 创建时间
     * Workshop.CreateTime
     *
     * @return the value of Workshop.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * Workshop.CreateTime
     *
     * @param createTime the value for Workshop.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * Workshop.LastModifyTime
     *
     * @return the value of Workshop.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 修改时间
     * Workshop.LastModifyTime
     *
     * @param lastModifyTime the value for Workshop.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
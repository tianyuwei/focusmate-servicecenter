package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * 微信订单表
 * WxTransaction
 */
public class WXTransaction {
    /**
     * 主键，订单号
     * WxTransaction.TranscationId
     */
    private String transcationId;

    /**
     * 微信用户ID号
     * WxTransaction.CustomId
     */
    private String customId;

    /**
     * 支付费用
     * WxTransaction.Fee
     */
    private Integer fee;

    /**
     * 洗车站点ID号
     * WxTransaction.StationId
     */
    private Integer stationId;

    /**
     * 订单状态
     * WxTransaction.Status
     */
    private Integer status;

    /**
     * WxTransaction.FinishTime
     */
    private Date finishTime;

    /**
     * 创建时间
     * WxTransaction.CreateTime
     */
    private Date createTime;

    /**
     * 修改时间
     * WxTransaction.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 主键，订单号
     * WxTransaction.TranscationId
     *
     * @return the value of WxTransaction.TranscationId
     */
    public String getTranscationId() {
        return transcationId;
    }

    /**
     * 主键，订单号
     * WxTransaction.TranscationId
     *
     * @param transcationId the value for WxTransaction.TranscationId
     */
    public void setTranscationId(String transcationId) {
        this.transcationId = transcationId == null ? null : transcationId.trim();
    }

    /**
     * 微信用户ID号
     * WxTransaction.CustomId
     *
     * @return the value of WxTransaction.CustomId
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * 微信用户ID号
     * WxTransaction.CustomId
     *
     * @param customId the value for WxTransaction.CustomId
     */
    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    /**
     * 支付费用
     * WxTransaction.Fee
     *
     * @return the value of WxTransaction.Fee
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * 支付费用
     * WxTransaction.Fee
     *
     * @param fee the value for WxTransaction.Fee
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /**
     * 洗车站点ID号
     * WxTransaction.StationId
     *
     * @return the value of WxTransaction.StationId
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 洗车站点ID号
     * WxTransaction.StationId
     *
     * @param stationId the value for WxTransaction.StationId
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * 订单状态
     * WxTransaction.Status
     *
     * @return the value of WxTransaction.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 订单状态
     * WxTransaction.Status
     *
     * @param status the value for WxTransaction.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * WxTransaction.FinishTime
     *
     * @return the value of WxTransaction.FinishTime
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * WxTransaction.FinishTime
     *
     * @param finishTime the value for WxTransaction.FinishTime
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 创建时间
     * WxTransaction.CreateTime
     *
     * @return the value of WxTransaction.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * WxTransaction.CreateTime
     *
     * @param createTime the value for WxTransaction.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * WxTransaction.LastModifyTime
     *
     * @return the value of WxTransaction.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 修改时间
     * WxTransaction.LastModifyTime
     *
     * @param lastModifyTime the value for WxTransaction.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
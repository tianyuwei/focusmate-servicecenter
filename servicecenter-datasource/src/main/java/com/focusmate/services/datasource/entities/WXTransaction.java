package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * wx_transaction
 */
public class WXTransaction {
    /**
     * wx_transaction.id
     */
    private Integer id;

    /**
     * wx_transaction.custom_id
     */
    private String customId;

    /**
     * wx_transaction.fee
     */
    private Integer fee;

    /**
     * wx_transaction.finish_time
     */
    private Date finishTime;

    /**
     * wx_transaction.order_time
     */
    private Date orderTime;

    /**
     * wx_transaction.station_id
     */
    private Integer stationId;

    /**
     * wx_transaction.status
     */
    private Integer status;

    /**
     * wx_transaction.transcation_id
     */
    private String transcationId;

    /**
     * wx_transaction.id
     *
     * @return the value of wx_transaction.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * wx_transaction.id
     *
     * @param id the value for wx_transaction.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * wx_transaction.custom_id
     *
     * @return the value of wx_transaction.custom_id
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * wx_transaction.custom_id
     *
     * @param customId the value for wx_transaction.custom_id
     */
    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    /**
     * wx_transaction.fee
     *
     * @return the value of wx_transaction.fee
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * wx_transaction.fee
     *
     * @param fee the value for wx_transaction.fee
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /**
     * wx_transaction.finish_time
     *
     * @return the value of wx_transaction.finish_time
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * wx_transaction.finish_time
     *
     * @param finishTime the value for wx_transaction.finish_time
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * wx_transaction.order_time
     *
     * @return the value of wx_transaction.order_time
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * wx_transaction.order_time
     *
     * @param orderTime the value for wx_transaction.order_time
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * wx_transaction.station_id
     *
     * @return the value of wx_transaction.station_id
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * wx_transaction.station_id
     *
     * @param stationId the value for wx_transaction.station_id
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * wx_transaction.status
     *
     * @return the value of wx_transaction.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * wx_transaction.status
     *
     * @param status the value for wx_transaction.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * wx_transaction.transcation_id
     *
     * @return the value of wx_transaction.transcation_id
     */
    public String getTranscationId() {
        return transcationId;
    }

    /**
     * wx_transaction.transcation_id
     *
     * @param transcationId the value for wx_transaction.transcation_id
     */
    public void setTranscationId(String transcationId) {
        this.transcationId = transcationId == null ? null : transcationId.trim();
    }
}
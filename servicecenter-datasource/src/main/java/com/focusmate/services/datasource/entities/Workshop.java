package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * workshop
 */
public class Workshop {
    /**
     * workshop.id
     */
    private Integer id;

    /**
     * workshop.station_id
     */
    private Integer stationId;

    /**
     * workshop.status
     */
    private String status;

    /**
     * workshop.record_time
     */
    private Date recordTime;

    /**
     * workshop.id
     *
     * @return the value of workshop.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * workshop.id
     *
     * @param id the value for workshop.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * workshop.station_id
     *
     * @return the value of workshop.station_id
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * workshop.station_id
     *
     * @param stationId the value for workshop.station_id
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * workshop.status
     *
     * @return the value of workshop.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * workshop.status
     *
     * @param status the value for workshop.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * workshop.record_time
     *
     * @return the value of workshop.record_time
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * workshop.record_time
     *
     * @param recordTime the value for workshop.record_time
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}
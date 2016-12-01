package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * station
 */
public class Station {
    /**
     * station.id
     */
    private Integer id;

    /**
     * station.address
     */
    private String address;

    /**
     * station.create_date
     */
    private Date createDate;

    /**
     * station.latitude
     */
    private Float latitude;

    /**
     * station.longitude
     */
    private Float longitude;

    /**
     * station.password
     */
    private String password;

    /**
     * station.price
     */
    private Integer price;

    /**
     * station.short_name
     */
    private String shortName;

    /**
     * station.status
     */
    private Integer status;

    /**
     * station.user_name
     */
    private String userName;

    /**
     * station.command_type
     */
    private Integer commandType;

    /**
     * station.visit_date
     */
    private Date visitDate;

    /**
     * station.id
     *
     * @return the value of station.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * station.id
     *
     * @param id the value for station.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * station.address
     *
     * @return the value of station.address
     */
    public String getAddress() {
        return address;
    }

    /**
     * station.address
     *
     * @param address the value for station.address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * station.create_date
     *
     * @return the value of station.create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * station.create_date
     *
     * @param createDate the value for station.create_date
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * station.latitude
     *
     * @return the value of station.latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * station.latitude
     *
     * @param latitude the value for station.latitude
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * station.longitude
     *
     * @return the value of station.longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * station.longitude
     *
     * @param longitude the value for station.longitude
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * station.password
     *
     * @return the value of station.password
     */
    public String getPassword() {
        return password;
    }

    /**
     * station.password
     *
     * @param password the value for station.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * station.price
     *
     * @return the value of station.price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * station.price
     *
     * @param price the value for station.price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * station.short_name
     *
     * @return the value of station.short_name
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * station.short_name
     *
     * @param shortName the value for station.short_name
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * station.status
     *
     * @return the value of station.status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * station.status
     *
     * @param status the value for station.status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * station.user_name
     *
     * @return the value of station.user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * station.user_name
     *
     * @param userName the value for station.user_name
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * station.command_type
     *
     * @return the value of station.command_type
     */
    public Integer getCommandType() {
        return commandType;
    }

    /**
     * station.command_type
     *
     * @param commandType the value for station.command_type
     */
    public void setCommandType(Integer commandType) {
        this.commandType = commandType;
    }

    /**
     * station.visit_date
     *
     * @return the value of station.visit_date
     */
    public Date getVisitDate() {
        return visitDate;
    }

    /**
     * station.visit_date
     *
     * @param visitDate the value for station.visit_date
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * 洗车站点表
 * Station
 */
public class Station {
    /**
     * 主键
     * Station.Id
     */
    private Integer id;

    /**
     * 地址
     * Station.Address
     */
    private String address;

    /**
     * 纬度
     * Station.Latitude
     */
    private Float latitude;

    /**
     * 经度
     * Station.Longitude
     */
    private Float longitude;

    /**
     * 洗车价格
     * Station.Price
     */
    private Integer price;

    /**
     * 站点名称
     * Station.name
     */
    private String name;

    /**
     * 站点缩写
     * Station.ShortName
     */
    private String shortName;

    /**
     * 站点状态
     * Station.Status
     */
    private Integer status;

    /**
     * Station.CommandType
     */
    private Integer commandType;

    /**
     * 创建时间
     * Station.CreateTime
     */
    private Date createTime;

    /**
     * 修改时间
     * Station.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 主键
     * Station.Id
     *
     * @return the value of Station.Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * Station.Id
     *
     * @param id the value for Station.Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 地址
     * Station.Address
     *
     * @return the value of Station.Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * Station.Address
     *
     * @param address the value for Station.Address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 纬度
     * Station.Latitude
     *
     * @return the value of Station.Latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * 纬度
     * Station.Latitude
     *
     * @param latitude the value for Station.Latitude
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * 经度
     * Station.Longitude
     *
     * @return the value of Station.Longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * 经度
     * Station.Longitude
     *
     * @param longitude the value for Station.Longitude
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * 洗车价格
     * Station.Price
     *
     * @return the value of Station.Price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 洗车价格
     * Station.Price
     *
     * @param price the value for Station.Price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 站点名称
     * Station.name
     *
     * @return the value of Station.name
     */
    public String getName() {
        return name;
    }

    /**
     * 站点名称
     * Station.name
     *
     * @param name the value for Station.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 站点缩写
     * Station.ShortName
     *
     * @return the value of Station.ShortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 站点缩写
     * Station.ShortName
     *
     * @param shortName the value for Station.ShortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * 站点状态
     * Station.Status
     *
     * @return the value of Station.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 站点状态
     * Station.Status
     *
     * @param status the value for Station.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Station.CommandType
     *
     * @return the value of Station.CommandType
     */
    public Integer getCommandType() {
        return commandType;
    }

    /**
     * Station.CommandType
     *
     * @param commandType the value for Station.CommandType
     */
    public void setCommandType(Integer commandType) {
        this.commandType = commandType;
    }

    /**
     * 创建时间
     * Station.CreateTime
     *
     * @return the value of Station.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * Station.CreateTime
     *
     * @param createTime the value for Station.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * Station.LastModifyTime
     *
     * @return the value of Station.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 修改时间
     * Station.LastModifyTime
     *
     * @param lastModifyTime the value for Station.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
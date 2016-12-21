package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * 产品表
 * Product
 */
public class Product {
    /**
     * 主键
     * Product.Id
     */
    private Integer id;

    /**
     * 洗车站点ID号
     * Product.StationId
     */
    private Integer stationId;

    /**
     * 洗车价格
     * Product.Price
     */
    private Integer price;

    /**
     * 普通折扣
     * Product.Sale
     */
    private Integer sale;

    /**
     * VIP折扣
     * Product.VipSale
     */
    private Integer vipSale;

    /**
     * 标题
     * Product.Title
     */
    private String title;

    /**
     * 备注
     * Product.Attach
     */
    private String attach;

    /**
     * 0-正常，1删除
     * Product.Status
     */
    private Integer status;

    /**
     * 创建时间
     * Product.CreateTime
     */
    private Date createTime;

    /**
     * 修改时间
     * Product.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 主键
     * Product.Id
     *
     * @return the value of Product.Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * Product.Id
     *
     * @param id the value for Product.Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 洗车站点ID号
     * Product.StationId
     *
     * @return the value of Product.StationId
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * 洗车站点ID号
     * Product.StationId
     *
     * @param stationId the value for Product.StationId
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * 洗车价格
     * Product.Price
     *
     * @return the value of Product.Price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 洗车价格
     * Product.Price
     *
     * @param price the value for Product.Price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 普通折扣
     * Product.Sale
     *
     * @return the value of Product.Sale
     */
    public Integer getSale() {
        return sale;
    }

    /**
     * 普通折扣
     * Product.Sale
     *
     * @param sale the value for Product.Sale
     */
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    /**
     * VIP折扣
     * Product.VipSale
     *
     * @return the value of Product.VipSale
     */
    public Integer getVipSale() {
        return vipSale;
    }

    /**
     * VIP折扣
     * Product.VipSale
     *
     * @param vipSale the value for Product.VipSale
     */
    public void setVipSale(Integer vipSale) {
        this.vipSale = vipSale;
    }

    /**
     * 标题
     * Product.Title
     *
     * @return the value of Product.Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * Product.Title
     *
     * @param title the value for Product.Title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 备注
     * Product.Attach
     *
     * @return the value of Product.Attach
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 备注
     * Product.Attach
     *
     * @param attach the value for Product.Attach
     */
    public void setAttach(String attach) {
        this.attach = attach == null ? null : attach.trim();
    }

    /**
     * 0-正常，1删除
     * Product.Status
     *
     * @return the value of Product.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0-正常，1删除
     * Product.Status
     *
     * @param status the value for Product.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * Product.CreateTime
     *
     * @return the value of Product.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * Product.CreateTime
     *
     * @param createTime the value for Product.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * Product.LastModifyTime
     *
     * @return the value of Product.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 修改时间
     * Product.LastModifyTime
     *
     * @param lastModifyTime the value for Product.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
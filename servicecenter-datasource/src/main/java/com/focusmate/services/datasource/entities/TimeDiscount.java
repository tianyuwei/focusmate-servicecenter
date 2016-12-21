package com.focusmate.services.datasource.entities;

import java.util.Date;

/**
 * 时间折扣表
 * TimeDiscount
 */
public class TimeDiscount {
    /**
     * 主键
     * TimeDiscount.Id
     */
    private Integer id;

    /**
     * 外键，产品ID
     * TimeDiscount.ProductId
     */
    private Integer productId;

    /**
     * 折扣开始时间
     * TimeDiscount.DurationStart
     */
    private Date durationStart;

    /**
     * 折扣结束时间
     * TimeDiscount.DurationEnd
     */
    private Date durationEnd;

    /**
     * 折扣内容
     * TimeDiscount.Discount
     */
    private Integer discount;

    /**
     * 0-正常，1删除
     * TimeDiscount.Status
     */
    private Integer status;

    /**
     * 创建时间
     * TimeDiscount.CreateTime
     */
    private Date createTime;

    /**
     * 修改时间
     * TimeDiscount.LastModifyTime
     */
    private Date lastModifyTime;

    /**
     * 主键
     * TimeDiscount.Id
     *
     * @return the value of TimeDiscount.Id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * TimeDiscount.Id
     *
     * @param id the value for TimeDiscount.Id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 外键，产品ID
     * TimeDiscount.ProductId
     *
     * @return the value of TimeDiscount.ProductId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 外键，产品ID
     * TimeDiscount.ProductId
     *
     * @param productId the value for TimeDiscount.ProductId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 折扣开始时间
     * TimeDiscount.DurationStart
     *
     * @return the value of TimeDiscount.DurationStart
     */
    public Date getDurationStart() {
        return durationStart;
    }

    /**
     * 折扣开始时间
     * TimeDiscount.DurationStart
     *
     * @param durationStart the value for TimeDiscount.DurationStart
     */
    public void setDurationStart(Date durationStart) {
        this.durationStart = durationStart;
    }

    /**
     * 折扣结束时间
     * TimeDiscount.DurationEnd
     *
     * @return the value of TimeDiscount.DurationEnd
     */
    public Date getDurationEnd() {
        return durationEnd;
    }

    /**
     * 折扣结束时间
     * TimeDiscount.DurationEnd
     *
     * @param durationEnd the value for TimeDiscount.DurationEnd
     */
    public void setDurationEnd(Date durationEnd) {
        this.durationEnd = durationEnd;
    }

    /**
     * 折扣内容
     * TimeDiscount.Discount
     *
     * @return the value of TimeDiscount.Discount
     */
    public Integer getDiscount() {
        return discount;
    }

    /**
     * 折扣内容
     * TimeDiscount.Discount
     *
     * @param discount the value for TimeDiscount.Discount
     */
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * 0-正常，1删除
     * TimeDiscount.Status
     *
     * @return the value of TimeDiscount.Status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0-正常，1删除
     * TimeDiscount.Status
     *
     * @param status the value for TimeDiscount.Status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     * TimeDiscount.CreateTime
     *
     * @return the value of TimeDiscount.CreateTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * TimeDiscount.CreateTime
     *
     * @param createTime the value for TimeDiscount.CreateTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 修改时间
     * TimeDiscount.LastModifyTime
     *
     * @return the value of TimeDiscount.LastModifyTime
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 修改时间
     * TimeDiscount.LastModifyTime
     *
     * @param lastModifyTime the value for TimeDiscount.LastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }
}
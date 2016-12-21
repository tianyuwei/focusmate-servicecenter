package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 时间折扣表
 * TimeDiscount
 */
public class TimeDiscountExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC  = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    // 主键
    public static final String FIELD_ID              = "Id";

    // 外键，产品ID
    public static final String FIELD_PRODUCTID       = "ProductId";

    // 折扣开始时间
    public static final String FIELD_DURATIONSTART   = "DurationStart";

    // 折扣结束时间
    public static final String FIELD_DURATIONEND     = "DurationEnd";

    // 折扣内容
    public static final String FIELD_DISCOUNT        = "Discount";

    // 0-正常，1删除
    public static final String FIELD_STATUS          = "Status";

    // 创建时间
    public static final String FIELD_CREATETIME      = "CreateTime";

    // 修改时间
    public static final String FIELD_LASTMODIFYTIME  = "LastModifyTime";

    /**
     * TimeDiscount
     */
    protected Integer          offset;

    /**
     * TimeDiscount
     */
    protected Integer          size;

    /**
     * TimeDiscount
     */
    protected String           orderByClause;

    /**
     * TimeDiscount
     */
    protected boolean          distinct;

    /**
     * TimeDiscount
     */
    protected List<Criteria>   oredCriteria;

    /**
     * TimeDiscount
     */
    public TimeDiscountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * TimeDiscount
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * TimeDiscount
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * TimeDiscount
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * TimeDiscount
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * TimeDiscount
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * TimeDiscount
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * TimeDiscount
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * TimeDiscount
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * TimeDiscount
     */
    public Integer getSize() {
        return size;
    }

    /**
     * TimeDiscount
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * TimeDiscount
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * TimeDiscount
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * TimeDiscount
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * TimeDiscount
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * TimeDiscount
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 时间折扣表
     * TimeDiscount
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property, boolean isBinary) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value, isBinary));
        }

        protected void addCriterion(String condition, Object value, String property) {
            addCriterion(condition, value, property, false);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property, boolean isBinary) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2, isBinary));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            addCriterion(condition, value1, value2, property, false);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        /**
         * 主键
         */
        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id", false);
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         * 主键
         */
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdIsNull() {
            addCriterion("ProductId is null");
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdIsNotNull() {
            addCriterion("ProductId is not null");
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("ProductId =", value, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("ProductId <>", value, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("ProductId >", value, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductId >=", value, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("ProductId <", value, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("ProductId <=", value, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("ProductId in", values, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("ProductId not in", values, "productId", false);
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("ProductId between", value1, value2, "productId");
            return (Criteria) this;
        }

        /**
         * 外键，产品ID
         */
        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductId not between", value1, value2, "productId");
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartIsNull() {
            addCriterion("DurationStart is null");
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartIsNotNull() {
            addCriterion("DurationStart is not null");
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartEqualTo(Date value) {
            addCriterion("DurationStart =", value, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartNotEqualTo(Date value) {
            addCriterion("DurationStart <>", value, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartGreaterThan(Date value) {
            addCriterion("DurationStart >", value, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartGreaterThanOrEqualTo(Date value) {
            addCriterion("DurationStart >=", value, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartLessThan(Date value) {
            addCriterion("DurationStart <", value, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartLessThanOrEqualTo(Date value) {
            addCriterion("DurationStart <=", value, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartIn(List<Date> values) {
            addCriterion("DurationStart in", values, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartNotIn(List<Date> values) {
            addCriterion("DurationStart not in", values, "durationStart", false);
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("DurationStart between", value1, value2, "durationStart");
            return (Criteria) this;
        }

        /**
         * 折扣开始时间
         */
        public Criteria andDurationStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("DurationStart not between", value1, value2, "durationStart");
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndIsNull() {
            addCriterion("DurationEnd is null");
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndIsNotNull() {
            addCriterion("DurationEnd is not null");
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndEqualTo(Date value) {
            addCriterion("DurationEnd =", value, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndNotEqualTo(Date value) {
            addCriterion("DurationEnd <>", value, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndGreaterThan(Date value) {
            addCriterion("DurationEnd >", value, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndGreaterThanOrEqualTo(Date value) {
            addCriterion("DurationEnd >=", value, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndLessThan(Date value) {
            addCriterion("DurationEnd <", value, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndLessThanOrEqualTo(Date value) {
            addCriterion("DurationEnd <=", value, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndIn(List<Date> values) {
            addCriterion("DurationEnd in", values, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndNotIn(List<Date> values) {
            addCriterion("DurationEnd not in", values, "durationEnd", false);
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("DurationEnd between", value1, value2, "durationEnd");
            return (Criteria) this;
        }

        /**
         * 折扣结束时间
         */
        public Criteria andDurationEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("DurationEnd not between", value1, value2, "durationEnd");
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("Discount =", value, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("Discount <>", value, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("Discount >", value, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Discount >=", value, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("Discount <", value, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("Discount <=", value, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("Discount in", values, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("Discount not in", values, "discount", false);
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        /**
         * 折扣内容
         */
        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 0-正常，1删除
         */
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime", false);
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 创建时间
         */
        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeIsNull() {
            addCriterion("LastModifyTime is null");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeIsNotNull() {
            addCriterion("LastModifyTime is not null");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeEqualTo(Date value) {
            addCriterion("LastModifyTime =", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeNotEqualTo(Date value) {
            addCriterion("LastModifyTime <>", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeGreaterThan(Date value) {
            addCriterion("LastModifyTime >", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime >=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeLessThan(Date value) {
            addCriterion("LastModifyTime <", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LastModifyTime <=", value, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeIn(List<Date> values) {
            addCriterion("LastModifyTime in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeNotIn(List<Date> values) {
            addCriterion("LastModifyTime not in", values, "lastModifyTime", false);
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }

        /**
         * 修改时间
         */
        public Criteria andLastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LastModifyTime not between", value1, value2, "lastModifyTime");
            return (Criteria) this;
        }
    }

    /**
     * 时间折扣表
     *TimeDiscount
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 时间折扣表
     * TimeDiscount
     */
    public static class Criterion {
        private boolean isBinary;

        private String  condition;

        private Object  value;

        private Object  secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String  typeHandler;

        public boolean isIsBinary() {
            return isBinary;
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
            this.isBinary = false;
        }

        protected Criterion(String condition, Object value, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this(condition, value, typeHandler, false);
        }

        protected Criterion(String condition, Object value, boolean isBinary) {
            this(condition, value, null, isBinary);
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler, boolean isBinary) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
            this.isBinary = isBinary;
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this(condition, value, secondValue, typeHandler, false);
        }

        protected Criterion(String condition, Object value, Object secondValue, boolean isBinary) {
            this(condition, value, secondValue, null, isBinary);
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null, false);
        }
    }

    /**
     * 时间折扣表
     *TimeDiscount
     */
    public static class OrderBy {
        private List<OrderByPair> orderByPairs;

        public OrderBy() {
            super();
            this.orderByPairs = new ArrayList<OrderByPair>();
        }

        public boolean isValid() {
            return orderByPairs.size() > 0;
        }

        public OrderBy clear() {
            orderByPairs.clear();
            return this;
        }

        public OrderBy addOrderBy(String fieldName) {
            return this.addOrderBy(fieldName, ORDERBYDIRECTION_ASC);
        }

        public OrderBy addOrderBy(String fieldName, String direction) {
            this.removeByFieldName(fieldName);//不能重复添加排序条件
            OrderByPair orderByPair = new OrderByPair(fieldName, direction);
            this.orderByPairs.add(orderByPair);
            return this;
        }

        private void removeByFieldName(String fieldName) {
            for (OrderByPair item : orderByPairs) {
                if (StringUtils.equalsIgnoreCase(item.getFieldName(), fieldName)) {
                    orderByPairs.remove(item);
                    break;
                }
            }
        }

        /**
         * 当没有任何排序条件时，直接返回null
         * 否则返回排序条件，多个条件时以,号分割
         */
        @Override
        public String toString() {
            if (!this.isValid()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (OrderByPair item : orderByPairs) {
                sb.append(item.toString());
                sb.append(',');
            }
            sb.deleteCharAt(sb.length() - 1);//删除最后一个字符
            return sb.toString();
        }
    }

    /**
     * 时间折扣表
     *TimeDiscount
     */
    static class OrderByPair {
        private String fieldName;

        private String direction;

        public OrderByPair(String fieldName, String direction) {
            super();
            this.fieldName = fieldName;
            this.direction = direction;
        }

        public String getFieldName() {
            return this.fieldName;
        }

        public String getDirection() {
            return this.direction;
        }

        /**
         * 返回单个排序条件字符串
         */
        @Override
        public String toString() {
            return fieldName + " " + direction;
        }
    }
}
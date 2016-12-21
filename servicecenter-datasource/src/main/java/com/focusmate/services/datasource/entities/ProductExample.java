package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 产品表
 * Product
 */
public class ProductExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    // 主键
    public static final String FIELD_ID = "Id";

    // 洗车站点ID号
    public static final String FIELD_STATIONID = "StationId";

    // 洗车价格
    public static final String FIELD_PRICE = "Price";

    // 普通折扣
    public static final String FIELD_SALE = "Sale";

    // VIP折扣
    public static final String FIELD_VIPSALE = "VipSale";

    // 标题
    public static final String FIELD_TITLE = "Title";

    // 备注
    public static final String FIELD_ATTACH = "Attach";

    // 0-正常，1删除
    public static final String FIELD_STATUS = "Status";

    // 创建时间
    public static final String FIELD_CREATETIME = "CreateTime";

    // 修改时间
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * Product
     */
    protected Integer offset;

    /**
     * Product
     */
    protected Integer size;

    /**
     * Product
     */
    protected String orderByClause;

    /**
     * Product
     */
    protected boolean distinct;

    /**
     * Product
     */
    protected List<Criteria> oredCriteria;

    /**
     * Product
     */
    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * Product
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * Product
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * Product
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * Product
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Product
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Product
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Product
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Product
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Product
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Product
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * Product
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * Product
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Product
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Product
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Product
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 产品表
     * Product
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
         * 洗车站点ID号
         */
        public Criteria andStationIdIsNull() {
            addCriterion("StationId is null");
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdIsNotNull() {
            addCriterion("StationId is not null");
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("StationId =", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("StationId <>", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("StationId >", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StationId >=", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("StationId <", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("StationId <=", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("StationId in", values, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("StationId not in", values, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("StationId between", value1, value2, "stationId");
            return (Criteria) this;
        }

        /**
         * 洗车站点ID号
         */
        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StationId not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("Price =", value, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("Price <>", value, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("Price >", value, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Price >=", value, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceLessThan(Integer value) {
            addCriterion("Price <", value, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("Price <=", value, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("Price in", values, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("Price not in", values, "price", false);
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        /**
         * 洗车价格
         */
        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleIsNull() {
            addCriterion("Sale is null");
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleIsNotNull() {
            addCriterion("Sale is not null");
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleEqualTo(Integer value) {
            addCriterion("Sale =", value, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleNotEqualTo(Integer value) {
            addCriterion("Sale <>", value, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleGreaterThan(Integer value) {
            addCriterion("Sale >", value, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sale >=", value, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleLessThan(Integer value) {
            addCriterion("Sale <", value, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleLessThanOrEqualTo(Integer value) {
            addCriterion("Sale <=", value, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleIn(List<Integer> values) {
            addCriterion("Sale in", values, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleNotIn(List<Integer> values) {
            addCriterion("Sale not in", values, "sale", false);
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleBetween(Integer value1, Integer value2) {
            addCriterion("Sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        /**
         * 普通折扣
         */
        public Criteria andSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("Sale not between", value1, value2, "sale");
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleIsNull() {
            addCriterion("VipSale is null");
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleIsNotNull() {
            addCriterion("VipSale is not null");
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleEqualTo(Integer value) {
            addCriterion("VipSale =", value, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleNotEqualTo(Integer value) {
            addCriterion("VipSale <>", value, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleGreaterThan(Integer value) {
            addCriterion("VipSale >", value, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("VipSale >=", value, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleLessThan(Integer value) {
            addCriterion("VipSale <", value, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleLessThanOrEqualTo(Integer value) {
            addCriterion("VipSale <=", value, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleIn(List<Integer> values) {
            addCriterion("VipSale in", values, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleNotIn(List<Integer> values) {
            addCriterion("VipSale not in", values, "vipSale", false);
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleBetween(Integer value1, Integer value2) {
            addCriterion("VipSale between", value1, value2, "vipSale");
            return (Criteria) this;
        }

        /**
         * VIP折扣
         */
        public Criteria andVipSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("VipSale not between", value1, value2, "vipSale");
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title", false);
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        /**
         * 标题
         */
        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachIsNull() {
            addCriterion("Attach is null");
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachIsNotNull() {
            addCriterion("Attach is not null");
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachEqualTo(String value) {
            addCriterion("Attach =", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachNotEqualTo(String value) {
            addCriterion("Attach <>", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachGreaterThan(String value) {
            addCriterion("Attach >", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachGreaterThanOrEqualTo(String value) {
            addCriterion("Attach >=", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachLessThan(String value) {
            addCriterion("Attach <", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachLessThanOrEqualTo(String value) {
            addCriterion("Attach <=", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachLike(String value) {
            addCriterion("Attach like", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachNotLike(String value) {
            addCriterion("Attach not like", value, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachIn(List<String> values) {
            addCriterion("Attach in", values, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachNotIn(List<String> values) {
            addCriterion("Attach not in", values, "attach", false);
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachBetween(String value1, String value2) {
            addCriterion("Attach between", value1, value2, "attach");
            return (Criteria) this;
        }

        /**
         * 备注
         */
        public Criteria andAttachNotBetween(String value1, String value2) {
            addCriterion("Attach not between", value1, value2, "attach");
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
     * 产品表
     *Product
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 产品表
     * Product
     */
    public static class Criterion {
        private boolean isBinary;

        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
     * 产品表
     *Product
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
     * 产品表
     *Product
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
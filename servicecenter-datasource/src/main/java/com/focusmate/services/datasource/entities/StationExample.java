package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 洗车站点表
 * Station
 */
public class StationExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    // 主键
    public static final String FIELD_ID = "Id";

    // 地址
    public static final String FIELD_ADDRESS = "Address";

    // 纬度
    public static final String FIELD_LATITUDE = "Latitude";

    // 经度
    public static final String FIELD_LONGITUDE = "Longitude";

    // 洗车价格
    public static final String FIELD_PRICE = "Price";

    // 站点名称
    public static final String FIELD_NAME = "name";

    // 站点缩写
    public static final String FIELD_SHORTNAME = "ShortName";

    // 站点状态
    public static final String FIELD_STATUS = "Status";

    public static final String FIELD_COMMANDTYPE = "CommandType";

    // 创建时间
    public static final String FIELD_CREATETIME = "CreateTime";

    // 修改时间
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * Station
     */
    protected Integer offset;

    /**
     * Station
     */
    protected Integer size;

    /**
     * Station
     */
    protected String orderByClause;

    /**
     * Station
     */
    protected boolean distinct;

    /**
     * Station
     */
    protected List<Criteria> oredCriteria;

    /**
     * Station
     */
    public StationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * Station
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * Station
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * Station
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * Station
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Station
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Station
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Station
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Station
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Station
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Station
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * Station
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * Station
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Station
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Station
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Station
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 洗车站点表
     * Station
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
         * 地址
         */
        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address", false);
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         * 地址
         */
        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeIsNull() {
            addCriterion("Latitude is null");
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeIsNotNull() {
            addCriterion("Latitude is not null");
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeEqualTo(Float value) {
            addCriterion("Latitude =", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeNotEqualTo(Float value) {
            addCriterion("Latitude <>", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeGreaterThan(Float value) {
            addCriterion("Latitude >", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("Latitude >=", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeLessThan(Float value) {
            addCriterion("Latitude <", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("Latitude <=", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeIn(List<Float> values) {
            addCriterion("Latitude in", values, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeNotIn(List<Float> values) {
            addCriterion("Latitude not in", values, "latitude", false);
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeBetween(Float value1, Float value2) {
            addCriterion("Latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        /**
         * 纬度
         */
        public Criteria andLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("Latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeIsNull() {
            addCriterion("Longitude is null");
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeIsNotNull() {
            addCriterion("Longitude is not null");
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeEqualTo(Float value) {
            addCriterion("Longitude =", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeNotEqualTo(Float value) {
            addCriterion("Longitude <>", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeGreaterThan(Float value) {
            addCriterion("Longitude >", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("Longitude >=", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeLessThan(Float value) {
            addCriterion("Longitude <", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("Longitude <=", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeIn(List<Float> values) {
            addCriterion("Longitude in", values, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeNotIn(List<Float> values) {
            addCriterion("Longitude not in", values, "longitude", false);
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeBetween(Float value1, Float value2) {
            addCriterion("Longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        /**
         * 经度
         */
        public Criteria andLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("Longitude not between", value1, value2, "longitude");
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
         * 站点名称
         */
        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name", false);
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * 站点名称
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameIsNull() {
            addCriterion("ShortName is null");
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameIsNotNull() {
            addCriterion("ShortName is not null");
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameEqualTo(String value) {
            addCriterion("ShortName =", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("ShortName <>", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("ShortName >", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("ShortName >=", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameLessThan(String value) {
            addCriterion("ShortName <", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("ShortName <=", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameLike(String value) {
            addCriterion("ShortName like", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameNotLike(String value) {
            addCriterion("ShortName not like", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameIn(List<String> values) {
            addCriterion("ShortName in", values, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("ShortName not in", values, "shortName", false);
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("ShortName between", value1, value2, "shortName");
            return (Criteria) this;
        }

        /**
         * 站点缩写
         */
        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("ShortName not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 站点状态
         */
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeIsNull() {
            addCriterion("CommandType is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeIsNotNull() {
            addCriterion("CommandType is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeEqualTo(Integer value) {
            addCriterion("CommandType =", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeNotEqualTo(Integer value) {
            addCriterion("CommandType <>", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeGreaterThan(Integer value) {
            addCriterion("CommandType >", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CommandType >=", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeLessThan(Integer value) {
            addCriterion("CommandType <", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CommandType <=", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeIn(List<Integer> values) {
            addCriterion("CommandType in", values, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeNotIn(List<Integer> values) {
            addCriterion("CommandType not in", values, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeBetween(Integer value1, Integer value2) {
            addCriterion("CommandType between", value1, value2, "commandType");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CommandType not between", value1, value2, "commandType");
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
     * 洗车站点表
     *Station
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 洗车站点表
     * Station
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
     * 洗车站点表
     *Station
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
     * 洗车站点表
     *Station
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
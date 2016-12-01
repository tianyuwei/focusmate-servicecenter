package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * station
 */
public class StationExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    public static final String FIELD_ID = "id";

    public static final String FIELD_ADDRESS = "address";

    public static final String FIELD_CREATE_DATE = "create_date";

    public static final String FIELD_LATITUDE = "latitude";

    public static final String FIELD_LONGITUDE = "longitude";

    public static final String FIELD_PASSWORD = "password";

    public static final String FIELD_PRICE = "price";

    public static final String FIELD_SHORT_NAME = "short_name";

    public static final String FIELD_STATUS = "status";

    public static final String FIELD_USER_NAME = "user_name";

    public static final String FIELD_COMMAND_TYPE = "command_type";

    public static final String FIELD_VISIT_DATE = "visit_date";

    /**
     * station
     */
    protected Integer offset;

    /**
     * station
     */
    protected Integer size;

    /**
     * station
     */
    protected String orderByClause;

    /**
     * station
     */
    protected boolean distinct;

    /**
     * station
     */
    protected List<Criteria> oredCriteria;

    /**
     * station
     */
    public StationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * station
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * station
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * station
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * station
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * station
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * station
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * station
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * station
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * station
     */
    public Integer getSize() {
        return size;
    }

    /**
     * station
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * station
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * station
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * station
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * station
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * station
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * station
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
         */
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeEqualTo(Float value) {
            addCriterion("latitude =", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeNotEqualTo(Float value) {
            addCriterion("latitude <>", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeGreaterThan(Float value) {
            addCriterion("latitude >", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("latitude >=", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeLessThan(Float value) {
            addCriterion("latitude <", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("latitude <=", value, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeIn(List<Float> values) {
            addCriterion("latitude in", values, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeNotIn(List<Float> values) {
            addCriterion("latitude not in", values, "latitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeBetween(Float value1, Float value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeEqualTo(Float value) {
            addCriterion("longitude =", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeNotEqualTo(Float value) {
            addCriterion("longitude <>", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeGreaterThan(Float value) {
            addCriterion("longitude >", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("longitude >=", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeLessThan(Float value) {
            addCriterion("longitude <", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("longitude <=", value, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeIn(List<Float> values) {
            addCriterion("longitude in", values, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeNotIn(List<Float> values) {
            addCriterion("longitude not in", values, "longitude", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeBetween(Float value1, Float value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeIsNull() {
            addCriterion("command_type is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeIsNotNull() {
            addCriterion("command_type is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeEqualTo(Integer value) {
            addCriterion("command_type =", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeNotEqualTo(Integer value) {
            addCriterion("command_type <>", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeGreaterThan(Integer value) {
            addCriterion("command_type >", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("command_type >=", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeLessThan(Integer value) {
            addCriterion("command_type <", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeLessThanOrEqualTo(Integer value) {
            addCriterion("command_type <=", value, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeIn(List<Integer> values) {
            addCriterion("command_type in", values, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeNotIn(List<Integer> values) {
            addCriterion("command_type not in", values, "commandType", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeBetween(Integer value1, Integer value2) {
            addCriterion("command_type between", value1, value2, "commandType");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCommandTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("command_type not between", value1, value2, "commandType");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateIsNull() {
            addCriterion("visit_date is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateIsNotNull() {
            addCriterion("visit_date is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateEqualTo(Date value) {
            addCriterion("visit_date =", value, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateNotEqualTo(Date value) {
            addCriterion("visit_date <>", value, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateGreaterThan(Date value) {
            addCriterion("visit_date >", value, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("visit_date >=", value, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateLessThan(Date value) {
            addCriterion("visit_date <", value, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateLessThanOrEqualTo(Date value) {
            addCriterion("visit_date <=", value, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateIn(List<Date> values) {
            addCriterion("visit_date in", values, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateNotIn(List<Date> values) {
            addCriterion("visit_date not in", values, "visitDate", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateBetween(Date value1, Date value2) {
            addCriterion("visit_date between", value1, value2, "visitDate");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andVisitDateNotBetween(Date value1, Date value2) {
            addCriterion("visit_date not between", value1, value2, "visitDate");
            return (Criteria) this;
        }
    }

    /**
     *station
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * station
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
     *station
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
     *station
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
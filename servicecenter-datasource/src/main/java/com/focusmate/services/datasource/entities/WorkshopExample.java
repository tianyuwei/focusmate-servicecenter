package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 工作间表
 * Workshop
 */
public class WorkshopExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    public static final String FIELD_ID = "Id";

    // 洗车站点ID号
    public static final String FIELD_STATIONID = "StationId";

    // 工作间状态信息
    public static final String FIELD_STATUS = "Status";

    // 创建时间
    public static final String FIELD_CREATETIME = "CreateTime";

    // 修改时间
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * Workshop
     */
    protected Integer offset;

    /**
     * Workshop
     */
    protected Integer size;

    /**
     * Workshop
     */
    protected String orderByClause;

    /**
     * Workshop
     */
    protected boolean distinct;

    /**
     * Workshop
     */
    protected List<Criteria> oredCriteria;

    /**
     * Workshop
     */
    public WorkshopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * Workshop
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * Workshop
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * Workshop
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * Workshop
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Workshop
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Workshop
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Workshop
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * Workshop
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * Workshop
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Workshop
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * Workshop
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * Workshop
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Workshop
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Workshop
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Workshop
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 工作间表
     * Workshop
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        /**
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
         * 工作间状态信息
         */
        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         * 工作间状态信息
         */
        public Criteria andStatusNotBetween(String value1, String value2) {
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
     * 工作间表
     *Workshop
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 工作间表
     * Workshop
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
     * 工作间表
     *Workshop
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
     * 工作间表
     *Workshop
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
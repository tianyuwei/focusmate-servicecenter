package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * workshop
 */
public class WorkshopExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    public static final String FIELD_ID = "id";

    public static final String FIELD_STATION_ID = "station_id";

    public static final String FIELD_STATUS = "status";

    public static final String FIELD_RECORD_TIME = "record_time";

    /**
     * workshop
     */
    protected Integer offset;

    /**
     * workshop
     */
    protected Integer size;

    /**
     * workshop
     */
    protected String orderByClause;

    /**
     * workshop
     */
    protected boolean distinct;

    /**
     * workshop
     */
    protected List<Criteria> oredCriteria;

    /**
     * workshop
     */
    public WorkshopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * workshop
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * workshop
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * workshop
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * workshop
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * workshop
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * workshop
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * workshop
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * workshop
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * workshop
     */
    public Integer getSize() {
        return size;
    }

    /**
     * workshop
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * workshop
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * workshop
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * workshop
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * workshop
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * workshop
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * workshop
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
        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("station_id =", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("station_id <>", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("station_id >", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_id >=", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("station_id <", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_id <=", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("station_id in", values, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("station_id not in", values, "stationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
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
        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
            return (Criteria) this;
        }
    }

    /**
     *workshop
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * workshop
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
     *workshop
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
     *workshop
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
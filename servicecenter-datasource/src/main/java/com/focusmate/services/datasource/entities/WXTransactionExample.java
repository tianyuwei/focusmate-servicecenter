package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * wx_transaction
 */
public class WXTransactionExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    public static final String FIELD_ID = "id";

    public static final String FIELD_CUSTOM_ID = "custom_id";

    public static final String FIELD_FEE = "fee";

    public static final String FIELD_FINISH_TIME = "finish_time";

    public static final String FIELD_ORDER_TIME = "order_time";

    public static final String FIELD_STATION_ID = "station_id";

    public static final String FIELD_STATUS = "status";

    public static final String FIELD_TRANSCATION_ID = "transcation_id";

    /**
     * wx_transaction
     */
    protected Integer offset;

    /**
     * wx_transaction
     */
    protected Integer size;

    /**
     * wx_transaction
     */
    protected String orderByClause;

    /**
     * wx_transaction
     */
    protected boolean distinct;

    /**
     * wx_transaction
     */
    protected List<Criteria> oredCriteria;

    /**
     * wx_transaction
     */
    public WXTransactionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * wx_transaction
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * wx_transaction
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * wx_transaction
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * wx_transaction
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * wx_transaction
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * wx_transaction
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * wx_transaction
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * wx_transaction
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * wx_transaction
     */
    public Integer getSize() {
        return size;
    }

    /**
     * wx_transaction
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * wx_transaction
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * wx_transaction
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * wx_transaction
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * wx_transaction
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * wx_transaction
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * wx_transaction
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
        public Criteria andCustomIdIsNull() {
            addCriterion("custom_id is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdIsNotNull() {
            addCriterion("custom_id is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdEqualTo(String value) {
            addCriterion("custom_id =", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdNotEqualTo(String value) {
            addCriterion("custom_id <>", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdGreaterThan(String value) {
            addCriterion("custom_id >", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdGreaterThanOrEqualTo(String value) {
            addCriterion("custom_id >=", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdLessThan(String value) {
            addCriterion("custom_id <", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdLessThanOrEqualTo(String value) {
            addCriterion("custom_id <=", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdLike(String value) {
            addCriterion("custom_id like", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdNotLike(String value) {
            addCriterion("custom_id not like", value, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdIn(List<String> values) {
            addCriterion("custom_id in", values, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdNotIn(List<String> values) {
            addCriterion("custom_id not in", values, "customId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdBetween(String value1, String value2) {
            addCriterion("custom_id between", value1, value2, "customId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andCustomIdNotBetween(String value1, String value2) {
            addCriterion("custom_id not between", value1, value2, "customId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeEqualTo(Integer value) {
            addCriterion("fee =", value, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeNotEqualTo(Integer value) {
            addCriterion("fee <>", value, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeGreaterThan(Integer value) {
            addCriterion("fee >", value, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee >=", value, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeLessThan(Integer value) {
            addCriterion("fee <", value, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeLessThanOrEqualTo(Integer value) {
            addCriterion("fee <=", value, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeIn(List<Integer> values) {
            addCriterion("fee in", values, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeNotIn(List<Integer> values) {
            addCriterion("fee not in", values, "fee", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeBetween(Integer value1, Integer value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
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
        public Criteria andTranscationIdIsNull() {
            addCriterion("transcation_id is null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdIsNotNull() {
            addCriterion("transcation_id is not null");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdEqualTo(String value) {
            addCriterion("transcation_id =", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdNotEqualTo(String value) {
            addCriterion("transcation_id <>", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdGreaterThan(String value) {
            addCriterion("transcation_id >", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdGreaterThanOrEqualTo(String value) {
            addCriterion("transcation_id >=", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdLessThan(String value) {
            addCriterion("transcation_id <", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdLessThanOrEqualTo(String value) {
            addCriterion("transcation_id <=", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdLike(String value) {
            addCriterion("transcation_id like", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdNotLike(String value) {
            addCriterion("transcation_id not like", value, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdIn(List<String> values) {
            addCriterion("transcation_id in", values, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdNotIn(List<String> values) {
            addCriterion("transcation_id not in", values, "transcationId", false);
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdBetween(String value1, String value2) {
            addCriterion("transcation_id between", value1, value2, "transcationId");
            return (Criteria) this;
        }

        /**
         */
        public Criteria andTranscationIdNotBetween(String value1, String value2) {
            addCriterion("transcation_id not between", value1, value2, "transcationId");
            return (Criteria) this;
        }
    }

    /**
     *wx_transaction
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * wx_transaction
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
     *wx_transaction
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
     *wx_transaction
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
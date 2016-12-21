package com.focusmate.services.datasource.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * 消息订阅者
 * MessageSubscriber
 */
public class MessageSubscriberExample {
    // 顺序排序
    public static final String ORDERBYDIRECTION_ASC = "asc";

    // 倒序排序
    public static final String ORDERBYDIRECTION_DESC = "desc";

    // 主键, 洗车站点ID号
    public static final String FIELD_STATIONID = "StationId";

    // 订阅者名称
    public static final String FIELD_NAME = "Name";

    // 消息队列名
    public static final String FIELD_QUEUE = "Queue";

    // 消息主题名
    public static final String FIELD_TOPIC = "Topic";

    // 0-正常，1删除
    public static final String FIELD_STATUS = "Status";

    // 创建时间
    public static final String FIELD_CREATETIME = "CreateTime";

    // 修改时间
    public static final String FIELD_LASTMODIFYTIME = "LastModifyTime";

    /**
     * MessageSubscriber
     */
    protected Integer offset;

    /**
     * MessageSubscriber
     */
    protected Integer size;

    /**
     * MessageSubscriber
     */
    protected String orderByClause;

    /**
     * MessageSubscriber
     */
    protected boolean distinct;

    /**
     * MessageSubscriber
     */
    protected List<Criteria> oredCriteria;

    /**
     * MessageSubscriber
     */
    public MessageSubscriberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * MessageSubscriber
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * MessageSubscriber
     */
    public void setOrderByClause(OrderBy orderBy) {
        this.orderByClause = orderBy.toString();
    }

    /**
     * MessageSubscriber
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * MessageSubscriber
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * MessageSubscriber
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * MessageSubscriber
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * MessageSubscriber
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * MessageSubscriber
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * MessageSubscriber
     */
    public Integer getSize() {
        return size;
    }

    /**
     * MessageSubscriber
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * MessageSubscriber
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * MessageSubscriber
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * MessageSubscriber
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * MessageSubscriber
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * MessageSubscriber
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 消息订阅者
     * MessageSubscriber
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
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdIsNull() {
            addCriterion("StationId is null");
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdIsNotNull() {
            addCriterion("StationId is not null");
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("StationId =", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("StationId <>", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("StationId >", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("StationId >=", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("StationId <", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("StationId <=", value, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("StationId in", values, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("StationId not in", values, "stationId", false);
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("StationId between", value1, value2, "stationId");
            return (Criteria) this;
        }

        /**
         * 主键, 洗车站点ID号
         */
        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("StationId not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name", false);
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * 订阅者名称
         */
        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueIsNull() {
            addCriterion("Queue is null");
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueIsNotNull() {
            addCriterion("Queue is not null");
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueEqualTo(String value) {
            addCriterion("Queue =", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueNotEqualTo(String value) {
            addCriterion("Queue <>", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueGreaterThan(String value) {
            addCriterion("Queue >", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueGreaterThanOrEqualTo(String value) {
            addCriterion("Queue >=", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueLessThan(String value) {
            addCriterion("Queue <", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueLessThanOrEqualTo(String value) {
            addCriterion("Queue <=", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueLike(String value) {
            addCriterion("Queue like", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueNotLike(String value) {
            addCriterion("Queue not like", value, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueIn(List<String> values) {
            addCriterion("Queue in", values, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueNotIn(List<String> values) {
            addCriterion("Queue not in", values, "queue", false);
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueBetween(String value1, String value2) {
            addCriterion("Queue between", value1, value2, "queue");
            return (Criteria) this;
        }

        /**
         * 消息队列名
         */
        public Criteria andQueueNotBetween(String value1, String value2) {
            addCriterion("Queue not between", value1, value2, "queue");
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicIsNull() {
            addCriterion("Topic is null");
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicIsNotNull() {
            addCriterion("Topic is not null");
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicEqualTo(String value) {
            addCriterion("Topic =", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("Topic <>", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicGreaterThan(String value) {
            addCriterion("Topic >", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("Topic >=", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicLessThan(String value) {
            addCriterion("Topic <", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("Topic <=", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicLike(String value) {
            addCriterion("Topic like", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicNotLike(String value) {
            addCriterion("Topic not like", value, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicIn(List<String> values) {
            addCriterion("Topic in", values, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("Topic not in", values, "topic", false);
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("Topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        /**
         * 消息主题名
         */
        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("Topic not between", value1, value2, "topic");
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
     * 消息订阅者
     *MessageSubscriber
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 消息订阅者
     * MessageSubscriber
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
     * 消息订阅者
     *MessageSubscriber
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
     * 消息订阅者
     *MessageSubscriber
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
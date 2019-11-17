package com.pb.partybuilding.domain;

import java.util.ArrayList;
import java.util.List;

public class TIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TIntegralExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLearningintegralIsNull() {
            addCriterion("learningintegral is null");
            return (Criteria) this;
        }

        public Criteria andLearningintegralIsNotNull() {
            addCriterion("learningintegral is not null");
            return (Criteria) this;
        }

        public Criteria andLearningintegralEqualTo(String value) {
            addCriterion("learningintegral =", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralNotEqualTo(String value) {
            addCriterion("learningintegral <>", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralGreaterThan(String value) {
            addCriterion("learningintegral >", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralGreaterThanOrEqualTo(String value) {
            addCriterion("learningintegral >=", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralLessThan(String value) {
            addCriterion("learningintegral <", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralLessThanOrEqualTo(String value) {
            addCriterion("learningintegral <=", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralLike(String value) {
            addCriterion("learningintegral like", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralNotLike(String value) {
            addCriterion("learningintegral not like", value, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralIn(List<String> values) {
            addCriterion("learningintegral in", values, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralNotIn(List<String> values) {
            addCriterion("learningintegral not in", values, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralBetween(String value1, String value2) {
            addCriterion("learningintegral between", value1, value2, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andLearningintegralNotBetween(String value1, String value2) {
            addCriterion("learningintegral not between", value1, value2, "learningintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralIsNull() {
            addCriterion("activityintegral is null");
            return (Criteria) this;
        }

        public Criteria andActivityintegralIsNotNull() {
            addCriterion("activityintegral is not null");
            return (Criteria) this;
        }

        public Criteria andActivityintegralEqualTo(String value) {
            addCriterion("activityintegral =", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralNotEqualTo(String value) {
            addCriterion("activityintegral <>", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralGreaterThan(String value) {
            addCriterion("activityintegral >", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralGreaterThanOrEqualTo(String value) {
            addCriterion("activityintegral >=", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralLessThan(String value) {
            addCriterion("activityintegral <", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralLessThanOrEqualTo(String value) {
            addCriterion("activityintegral <=", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralLike(String value) {
            addCriterion("activityintegral like", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralNotLike(String value) {
            addCriterion("activityintegral not like", value, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralIn(List<String> values) {
            addCriterion("activityintegral in", values, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralNotIn(List<String> values) {
            addCriterion("activityintegral not in", values, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralBetween(String value1, String value2) {
            addCriterion("activityintegral between", value1, value2, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andActivityintegralNotBetween(String value1, String value2) {
            addCriterion("activityintegral not between", value1, value2, "activityintegral");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdIsNull() {
            addCriterion("partymember_id is null");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdIsNotNull() {
            addCriterion("partymember_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdEqualTo(String value) {
            addCriterion("partymember_id =", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdNotEqualTo(String value) {
            addCriterion("partymember_id <>", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdGreaterThan(String value) {
            addCriterion("partymember_id >", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("partymember_id >=", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdLessThan(String value) {
            addCriterion("partymember_id <", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdLessThanOrEqualTo(String value) {
            addCriterion("partymember_id <=", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdLike(String value) {
            addCriterion("partymember_id like", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdNotLike(String value) {
            addCriterion("partymember_id not like", value, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdIn(List<String> values) {
            addCriterion("partymember_id in", values, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdNotIn(List<String> values) {
            addCriterion("partymember_id not in", values, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdBetween(String value1, String value2) {
            addCriterion("partymember_id between", value1, value2, "partymemberId");
            return (Criteria) this;
        }

        public Criteria andPartymemberIdNotBetween(String value1, String value2) {
            addCriterion("partymember_id not between", value1, value2, "partymemberId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
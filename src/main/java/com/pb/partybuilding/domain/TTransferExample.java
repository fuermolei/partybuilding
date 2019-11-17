package com.pb.partybuilding.domain;

import java.util.ArrayList;
import java.util.List;

public class TTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTransferExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andUsednameIsNull() {
            addCriterion("usedname is null");
            return (Criteria) this;
        }

        public Criteria andUsednameIsNotNull() {
            addCriterion("usedname is not null");
            return (Criteria) this;
        }

        public Criteria andUsednameEqualTo(String value) {
            addCriterion("usedname =", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotEqualTo(String value) {
            addCriterion("usedname <>", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameGreaterThan(String value) {
            addCriterion("usedname >", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameGreaterThanOrEqualTo(String value) {
            addCriterion("usedname >=", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameLessThan(String value) {
            addCriterion("usedname <", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameLessThanOrEqualTo(String value) {
            addCriterion("usedname <=", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameLike(String value) {
            addCriterion("usedname like", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotLike(String value) {
            addCriterion("usedname not like", value, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameIn(List<String> values) {
            addCriterion("usedname in", values, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotIn(List<String> values) {
            addCriterion("usedname not in", values, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameBetween(String value1, String value2) {
            addCriterion("usedname between", value1, value2, "usedname");
            return (Criteria) this;
        }

        public Criteria andUsednameNotBetween(String value1, String value2) {
            addCriterion("usedname not between", value1, value2, "usedname");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNull() {
            addCriterion("idnumber is null");
            return (Criteria) this;
        }

        public Criteria andIdnumberIsNotNull() {
            addCriterion("idnumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumberEqualTo(String value) {
            addCriterion("idnumber =", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotEqualTo(String value) {
            addCriterion("idnumber <>", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThan(String value) {
            addCriterion("idnumber >", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idnumber >=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThan(String value) {
            addCriterion("idnumber <", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLessThanOrEqualTo(String value) {
            addCriterion("idnumber <=", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberLike(String value) {
            addCriterion("idnumber like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotLike(String value) {
            addCriterion("idnumber not like", value, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberIn(List<String> values) {
            addCriterion("idnumber in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotIn(List<String> values) {
            addCriterion("idnumber not in", values, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberBetween(String value1, String value2) {
            addCriterion("idnumber between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andIdnumberNotBetween(String value1, String value2) {
            addCriterion("idnumber not between", value1, value2, "idnumber");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIsNull() {
            addCriterion("briefintroduction is null");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIsNotNull() {
            addCriterion("briefintroduction is not null");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionEqualTo(String value) {
            addCriterion("briefintroduction =", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotEqualTo(String value) {
            addCriterion("briefintroduction <>", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionGreaterThan(String value) {
            addCriterion("briefintroduction >", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("briefintroduction >=", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLessThan(String value) {
            addCriterion("briefintroduction <", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLessThanOrEqualTo(String value) {
            addCriterion("briefintroduction <=", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionLike(String value) {
            addCriterion("briefintroduction like", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotLike(String value) {
            addCriterion("briefintroduction not like", value, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionIn(List<String> values) {
            addCriterion("briefintroduction in", values, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotIn(List<String> values) {
            addCriterion("briefintroduction not in", values, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionBetween(String value1, String value2) {
            addCriterion("briefintroduction between", value1, value2, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andBriefintroductionNotBetween(String value1, String value2) {
            addCriterion("briefintroduction not between", value1, value2, "briefintroduction");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNull() {
            addCriterion("dateofbirth is null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNotNull() {
            addCriterion("dateofbirth is not null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthEqualTo(String value) {
            addCriterion("dateofbirth =", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotEqualTo(String value) {
            addCriterion("dateofbirth <>", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThan(String value) {
            addCriterion("dateofbirth >", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThanOrEqualTo(String value) {
            addCriterion("dateofbirth >=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThan(String value) {
            addCriterion("dateofbirth <", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThanOrEqualTo(String value) {
            addCriterion("dateofbirth <=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLike(String value) {
            addCriterion("dateofbirth like", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotLike(String value) {
            addCriterion("dateofbirth not like", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIn(List<String> values) {
            addCriterion("dateofbirth in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotIn(List<String> values) {
            addCriterion("dateofbirth not in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthBetween(String value1, String value2) {
            addCriterion("dateofbirth between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotBetween(String value1, String value2) {
            addCriterion("dateofbirth not between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andDegreestatusIsNull() {
            addCriterion("degreestatus is null");
            return (Criteria) this;
        }

        public Criteria andDegreestatusIsNotNull() {
            addCriterion("degreestatus is not null");
            return (Criteria) this;
        }

        public Criteria andDegreestatusEqualTo(String value) {
            addCriterion("degreestatus =", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusNotEqualTo(String value) {
            addCriterion("degreestatus <>", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusGreaterThan(String value) {
            addCriterion("degreestatus >", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusGreaterThanOrEqualTo(String value) {
            addCriterion("degreestatus >=", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusLessThan(String value) {
            addCriterion("degreestatus <", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusLessThanOrEqualTo(String value) {
            addCriterion("degreestatus <=", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusLike(String value) {
            addCriterion("degreestatus like", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusNotLike(String value) {
            addCriterion("degreestatus not like", value, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusIn(List<String> values) {
            addCriterion("degreestatus in", values, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusNotIn(List<String> values) {
            addCriterion("degreestatus not in", values, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusBetween(String value1, String value2) {
            addCriterion("degreestatus between", value1, value2, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreestatusNotBetween(String value1, String value2) {
            addCriterion("degreestatus not between", value1, value2, "degreestatus");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataIsNull() {
            addCriterion("joiningpartydata is null");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataIsNotNull() {
            addCriterion("joiningpartydata is not null");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataEqualTo(String value) {
            addCriterion("joiningpartydata =", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataNotEqualTo(String value) {
            addCriterion("joiningpartydata <>", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataGreaterThan(String value) {
            addCriterion("joiningpartydata >", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataGreaterThanOrEqualTo(String value) {
            addCriterion("joiningpartydata >=", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataLessThan(String value) {
            addCriterion("joiningpartydata <", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataLessThanOrEqualTo(String value) {
            addCriterion("joiningpartydata <=", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataLike(String value) {
            addCriterion("joiningpartydata like", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataNotLike(String value) {
            addCriterion("joiningpartydata not like", value, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataIn(List<String> values) {
            addCriterion("joiningpartydata in", values, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataNotIn(List<String> values) {
            addCriterion("joiningpartydata not in", values, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataBetween(String value1, String value2) {
            addCriterion("joiningpartydata between", value1, value2, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJoiningpartydataNotBetween(String value1, String value2) {
            addCriterion("joiningpartydata not between", value1, value2, "joiningpartydata");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andPromiseIsNull() {
            addCriterion("promise is null");
            return (Criteria) this;
        }

        public Criteria andPromiseIsNotNull() {
            addCriterion("promise is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseEqualTo(String value) {
            addCriterion("promise =", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotEqualTo(String value) {
            addCriterion("promise <>", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseGreaterThan(String value) {
            addCriterion("promise >", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseGreaterThanOrEqualTo(String value) {
            addCriterion("promise >=", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLessThan(String value) {
            addCriterion("promise <", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLessThanOrEqualTo(String value) {
            addCriterion("promise <=", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLike(String value) {
            addCriterion("promise like", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotLike(String value) {
            addCriterion("promise not like", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseIn(List<String> values) {
            addCriterion("promise in", values, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotIn(List<String> values) {
            addCriterion("promise not in", values, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseBetween(String value1, String value2) {
            addCriterion("promise between", value1, value2, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotBetween(String value1, String value2) {
            addCriterion("promise not between", value1, value2, "promise");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("branch_id is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("branch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("branch_id =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("branch_id <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("branch_id >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("branch_id >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("branch_id <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("branch_id <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("branch_id like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("branch_id not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("branch_id in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("branch_id not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("branch_id between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("branch_id not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdIsNull() {
            addCriterion("vanguard_id is null");
            return (Criteria) this;
        }

        public Criteria andVanguardIdIsNotNull() {
            addCriterion("vanguard_id is not null");
            return (Criteria) this;
        }

        public Criteria andVanguardIdEqualTo(String value) {
            addCriterion("vanguard_id =", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdNotEqualTo(String value) {
            addCriterion("vanguard_id <>", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdGreaterThan(String value) {
            addCriterion("vanguard_id >", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdGreaterThanOrEqualTo(String value) {
            addCriterion("vanguard_id >=", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdLessThan(String value) {
            addCriterion("vanguard_id <", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdLessThanOrEqualTo(String value) {
            addCriterion("vanguard_id <=", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdLike(String value) {
            addCriterion("vanguard_id like", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdNotLike(String value) {
            addCriterion("vanguard_id not like", value, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdIn(List<String> values) {
            addCriterion("vanguard_id in", values, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdNotIn(List<String> values) {
            addCriterion("vanguard_id not in", values, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdBetween(String value1, String value2) {
            addCriterion("vanguard_id between", value1, value2, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andVanguardIdNotBetween(String value1, String value2) {
            addCriterion("vanguard_id not between", value1, value2, "vanguardId");
            return (Criteria) this;
        }

        public Criteria andTransferunitIsNull() {
            addCriterion("transferunit is null");
            return (Criteria) this;
        }

        public Criteria andTransferunitIsNotNull() {
            addCriterion("transferunit is not null");
            return (Criteria) this;
        }

        public Criteria andTransferunitEqualTo(String value) {
            addCriterion("transferunit =", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitNotEqualTo(String value) {
            addCriterion("transferunit <>", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitGreaterThan(String value) {
            addCriterion("transferunit >", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitGreaterThanOrEqualTo(String value) {
            addCriterion("transferunit >=", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitLessThan(String value) {
            addCriterion("transferunit <", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitLessThanOrEqualTo(String value) {
            addCriterion("transferunit <=", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitLike(String value) {
            addCriterion("transferunit like", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitNotLike(String value) {
            addCriterion("transferunit not like", value, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitIn(List<String> values) {
            addCriterion("transferunit in", values, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitNotIn(List<String> values) {
            addCriterion("transferunit not in", values, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitBetween(String value1, String value2) {
            addCriterion("transferunit between", value1, value2, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransferunitNotBetween(String value1, String value2) {
            addCriterion("transferunit not between", value1, value2, "transferunit");
            return (Criteria) this;
        }

        public Criteria andTransfertimeIsNull() {
            addCriterion("transfertime is null");
            return (Criteria) this;
        }

        public Criteria andTransfertimeIsNotNull() {
            addCriterion("transfertime is not null");
            return (Criteria) this;
        }

        public Criteria andTransfertimeEqualTo(String value) {
            addCriterion("transfertime =", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotEqualTo(String value) {
            addCriterion("transfertime <>", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeGreaterThan(String value) {
            addCriterion("transfertime >", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeGreaterThanOrEqualTo(String value) {
            addCriterion("transfertime >=", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeLessThan(String value) {
            addCriterion("transfertime <", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeLessThanOrEqualTo(String value) {
            addCriterion("transfertime <=", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeLike(String value) {
            addCriterion("transfertime like", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotLike(String value) {
            addCriterion("transfertime not like", value, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeIn(List<String> values) {
            addCriterion("transfertime in", values, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotIn(List<String> values) {
            addCriterion("transfertime not in", values, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeBetween(String value1, String value2) {
            addCriterion("transfertime between", value1, value2, "transfertime");
            return (Criteria) this;
        }

        public Criteria andTransfertimeNotBetween(String value1, String value2) {
            addCriterion("transfertime not between", value1, value2, "transfertime");
            return (Criteria) this;
        }
        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(String value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(String value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(String value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(String value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(String value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLike(String value) {
            addCriterion("nationality like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotLike(String value) {
            addCriterion("nationality not like", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<String> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<String> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(String value1, String value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(String value1, String value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativeplace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativeplace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativeplace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativeplace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativeplace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativeplace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativeplace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativeplace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativeplace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativeplace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativeplace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativeplace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceIsNull() {
            addCriterion("medicalinsurance is null");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceIsNotNull() {
            addCriterion("medicalinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceEqualTo(String value) {
            addCriterion("medicalinsurance =", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceNotEqualTo(String value) {
            addCriterion("medicalinsurance <>", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceGreaterThan(String value) {
            addCriterion("medicalinsurance >", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("medicalinsurance >=", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceLessThan(String value) {
            addCriterion("medicalinsurance <", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceLessThanOrEqualTo(String value) {
            addCriterion("medicalinsurance <=", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceLike(String value) {
            addCriterion("medicalinsurance like", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceNotLike(String value) {
            addCriterion("medicalinsurance not like", value, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceIn(List<String> values) {
            addCriterion("medicalinsurance in", values, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceNotIn(List<String> values) {
            addCriterion("medicalinsurance not in", values, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceBetween(String value1, String value2) {
            addCriterion("medicalinsurance between", value1, value2, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalinsuranceNotBetween(String value1, String value2) {
            addCriterion("medicalinsurance not between", value1, value2, "medicalinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceIsNull() {
            addCriterion("oldinsurance is null");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceIsNotNull() {
            addCriterion("oldinsurance is not null");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceEqualTo(String value) {
            addCriterion("oldinsurance =", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceNotEqualTo(String value) {
            addCriterion("oldinsurance <>", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceGreaterThan(String value) {
            addCriterion("oldinsurance >", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("oldinsurance >=", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceLessThan(String value) {
            addCriterion("oldinsurance <", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceLessThanOrEqualTo(String value) {
            addCriterion("oldinsurance <=", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceLike(String value) {
            addCriterion("oldinsurance like", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceNotLike(String value) {
            addCriterion("oldinsurance not like", value, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceIn(List<String> values) {
            addCriterion("oldinsurance in", values, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceNotIn(List<String> values) {
            addCriterion("oldinsurance not in", values, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceBetween(String value1, String value2) {
            addCriterion("oldinsurance between", value1, value2, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andOldinsuranceNotBetween(String value1, String value2) {
            addCriterion("oldinsurance not between", value1, value2, "oldinsurance");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalstatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalstatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalstatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalstatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalstatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalstatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalstatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalstatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalstatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalstatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalstatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalstatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalstatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andPositivetimeIsNull() {
            addCriterion("positivetime is null");
            return (Criteria) this;
        }

        public Criteria andPositivetimeIsNotNull() {
            addCriterion("positivetime is not null");
            return (Criteria) this;
        }

        public Criteria andPositivetimeEqualTo(String value) {
            addCriterion("positivetime =", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeNotEqualTo(String value) {
            addCriterion("positivetime <>", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeGreaterThan(String value) {
            addCriterion("positivetime >", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeGreaterThanOrEqualTo(String value) {
            addCriterion("positivetime >=", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeLessThan(String value) {
            addCriterion("positivetime <", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeLessThanOrEqualTo(String value) {
            addCriterion("positivetime <=", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeLike(String value) {
            addCriterion("positivetime like", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeNotLike(String value) {
            addCriterion("positivetime not like", value, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeIn(List<String> values) {
            addCriterion("positivetime in", values, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeNotIn(List<String> values) {
            addCriterion("positivetime not in", values, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeBetween(String value1, String value2) {
            addCriterion("positivetime between", value1, value2, "positivetime");
            return (Criteria) this;
        }

        public Criteria andPositivetimeNotBetween(String value1, String value2) {
            addCriterion("positivetime not between", value1, value2, "positivetime");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNull() {
            addCriterion("workdate is null");
            return (Criteria) this;
        }

        public Criteria andWorkdateIsNotNull() {
            addCriterion("workdate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdateEqualTo(String value) {
            addCriterion("workdate =", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotEqualTo(String value) {
            addCriterion("workdate <>", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThan(String value) {
            addCriterion("workdate >", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateGreaterThanOrEqualTo(String value) {
            addCriterion("workdate >=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThan(String value) {
            addCriterion("workdate <", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLessThanOrEqualTo(String value) {
            addCriterion("workdate <=", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateLike(String value) {
            addCriterion("workdate like", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotLike(String value) {
            addCriterion("workdate not like", value, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateIn(List<String> values) {
            addCriterion("workdate in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotIn(List<String> values) {
            addCriterion("workdate not in", values, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateBetween(String value1, String value2) {
            addCriterion("workdate between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andWorkdateNotBetween(String value1, String value2) {
            addCriterion("workdate not between", value1, value2, "workdate");
            return (Criteria) this;
        }

        public Criteria andBeginbranchIsNull() {
            addCriterion("beginbranch is null");
            return (Criteria) this;
        }

        public Criteria andBeginbranchIsNotNull() {
            addCriterion("beginbranch is not null");
            return (Criteria) this;
        }

        public Criteria andBeginbranchEqualTo(String value) {
            addCriterion("beginbranch =", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchNotEqualTo(String value) {
            addCriterion("beginbranch <>", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchGreaterThan(String value) {
            addCriterion("beginbranch >", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchGreaterThanOrEqualTo(String value) {
            addCriterion("beginbranch >=", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchLessThan(String value) {
            addCriterion("beginbranch <", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchLessThanOrEqualTo(String value) {
            addCriterion("beginbranch <=", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchLike(String value) {
            addCriterion("beginbranch like", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchNotLike(String value) {
            addCriterion("beginbranch not like", value, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchIn(List<String> values) {
            addCriterion("beginbranch in", values, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchNotIn(List<String> values) {
            addCriterion("beginbranch not in", values, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchBetween(String value1, String value2) {
            addCriterion("beginbranch between", value1, value2, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andBeginbranchNotBetween(String value1, String value2) {
            addCriterion("beginbranch not between", value1, value2, "beginbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchIsNull() {
            addCriterion("changedbranch is null");
            return (Criteria) this;
        }

        public Criteria andChangedbranchIsNotNull() {
            addCriterion("changedbranch is not null");
            return (Criteria) this;
        }

        public Criteria andChangedbranchEqualTo(String value) {
            addCriterion("changedbranch =", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchNotEqualTo(String value) {
            addCriterion("changedbranch <>", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchGreaterThan(String value) {
            addCriterion("changedbranch >", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchGreaterThanOrEqualTo(String value) {
            addCriterion("changedbranch >=", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchLessThan(String value) {
            addCriterion("changedbranch <", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchLessThanOrEqualTo(String value) {
            addCriterion("changedbranch <=", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchLike(String value) {
            addCriterion("changedbranch like", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchNotLike(String value) {
            addCriterion("changedbranch not like", value, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchIn(List<String> values) {
            addCriterion("changedbranch in", values, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchNotIn(List<String> values) {
            addCriterion("changedbranch not in", values, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchBetween(String value1, String value2) {
            addCriterion("changedbranch between", value1, value2, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andChangedbranchNotBetween(String value1, String value2) {
            addCriterion("changedbranch not between", value1, value2, "changedbranch");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNull() {
            addCriterion("referrer is null");
            return (Criteria) this;
        }

        public Criteria andReferrerIsNotNull() {
            addCriterion("referrer is not null");
            return (Criteria) this;
        }

        public Criteria andReferrerEqualTo(String value) {
            addCriterion("referrer =", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotEqualTo(String value) {
            addCriterion("referrer <>", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThan(String value) {
            addCriterion("referrer >", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerGreaterThanOrEqualTo(String value) {
            addCriterion("referrer >=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThan(String value) {
            addCriterion("referrer <", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLessThanOrEqualTo(String value) {
            addCriterion("referrer <=", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerLike(String value) {
            addCriterion("referrer like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotLike(String value) {
            addCriterion("referrer not like", value, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerIn(List<String> values) {
            addCriterion("referrer in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotIn(List<String> values) {
            addCriterion("referrer not in", values, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerBetween(String value1, String value2) {
            addCriterion("referrer between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andReferrerNotBetween(String value1, String value2) {
            addCriterion("referrer not between", value1, value2, "referrer");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateIsNull() {
            addCriterion("joinedbranchdate is null");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateIsNotNull() {
            addCriterion("joinedbranchdate is not null");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateEqualTo(String value) {
            addCriterion("joinedbranchdate =", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateNotEqualTo(String value) {
            addCriterion("joinedbranchdate <>", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateGreaterThan(String value) {
            addCriterion("joinedbranchdate >", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateGreaterThanOrEqualTo(String value) {
            addCriterion("joinedbranchdate >=", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateLessThan(String value) {
            addCriterion("joinedbranchdate <", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateLessThanOrEqualTo(String value) {
            addCriterion("joinedbranchdate <=", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateLike(String value) {
            addCriterion("joinedbranchdate like", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateNotLike(String value) {
            addCriterion("joinedbranchdate not like", value, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateIn(List<String> values) {
            addCriterion("joinedbranchdate in", values, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateNotIn(List<String> values) {
            addCriterion("joinedbranchdate not in", values, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateBetween(String value1, String value2) {
            addCriterion("joinedbranchdate between", value1, value2, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andJoinedbranchdateNotBetween(String value1, String value2) {
            addCriterion("joinedbranchdate not between", value1, value2, "joinedbranchdate");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andOcupertinoIsNull() {
            addCriterion("ocupertino is null");
            return (Criteria) this;
        }

        public Criteria andOcupertinoIsNotNull() {
            addCriterion("ocupertino is not null");
            return (Criteria) this;
        }

        public Criteria andOcupertinoEqualTo(String value) {
            addCriterion("ocupertino =", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoNotEqualTo(String value) {
            addCriterion("ocupertino <>", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoGreaterThan(String value) {
            addCriterion("ocupertino >", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoGreaterThanOrEqualTo(String value) {
            addCriterion("ocupertino >=", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoLessThan(String value) {
            addCriterion("ocupertino <", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoLessThanOrEqualTo(String value) {
            addCriterion("ocupertino <=", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoLike(String value) {
            addCriterion("ocupertino like", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoNotLike(String value) {
            addCriterion("ocupertino not like", value, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoIn(List<String> values) {
            addCriterion("ocupertino in", values, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoNotIn(List<String> values) {
            addCriterion("ocupertino not in", values, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoBetween(String value1, String value2) {
            addCriterion("ocupertino between", value1, value2, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andOcupertinoNotBetween(String value1, String value2) {
            addCriterion("ocupertino not between", value1, value2, "ocupertino");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNull() {
            addCriterion("relationship is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("relationship is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(String value) {
            addCriterion("relationship =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(String value) {
            addCriterion("relationship <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(String value) {
            addCriterion("relationship >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("relationship >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(String value) {
            addCriterion("relationship <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(String value) {
            addCriterion("relationship <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLike(String value) {
            addCriterion("relationship like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotLike(String value) {
            addCriterion("relationship not like", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<String> values) {
            addCriterion("relationship in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<String> values) {
            addCriterion("relationship not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(String value1, String value2) {
            addCriterion("relationship between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(String value1, String value2) {
            addCriterion("relationship not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIsNull() {
            addCriterion("domicileplace is null");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIsNotNull() {
            addCriterion("domicileplace is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceEqualTo(String value) {
            addCriterion("domicileplace =", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotEqualTo(String value) {
            addCriterion("domicileplace <>", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceGreaterThan(String value) {
            addCriterion("domicileplace >", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceGreaterThanOrEqualTo(String value) {
            addCriterion("domicileplace >=", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLessThan(String value) {
            addCriterion("domicileplace <", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLessThanOrEqualTo(String value) {
            addCriterion("domicileplace <=", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLike(String value) {
            addCriterion("domicileplace like", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotLike(String value) {
            addCriterion("domicileplace not like", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIn(List<String> values) {
            addCriterion("domicileplace in", values, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotIn(List<String> values) {
            addCriterion("domicileplace not in", values, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceBetween(String value1, String value2) {
            addCriterion("domicileplace between", value1, value2, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotBetween(String value1, String value2) {
            addCriterion("domicileplace not between", value1, value2, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andNowaddIsNull() {
            addCriterion("nowadd is null");
            return (Criteria) this;
        }

        public Criteria andNowaddIsNotNull() {
            addCriterion("nowadd is not null");
            return (Criteria) this;
        }

        public Criteria andNowaddEqualTo(String value) {
            addCriterion("nowadd =", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddNotEqualTo(String value) {
            addCriterion("nowadd <>", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddGreaterThan(String value) {
            addCriterion("nowadd >", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddGreaterThanOrEqualTo(String value) {
            addCriterion("nowadd >=", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddLessThan(String value) {
            addCriterion("nowadd <", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddLessThanOrEqualTo(String value) {
            addCriterion("nowadd <=", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddLike(String value) {
            addCriterion("nowadd like", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddNotLike(String value) {
            addCriterion("nowadd not like", value, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddIn(List<String> values) {
            addCriterion("nowadd in", values, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddNotIn(List<String> values) {
            addCriterion("nowadd not in", values, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddBetween(String value1, String value2) {
            addCriterion("nowadd between", value1, value2, "nowadd");
            return (Criteria) this;
        }

        public Criteria andNowaddNotBetween(String value1, String value2) {
            addCriterion("nowadd not between", value1, value2, "nowadd");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andOutofdateIsNull() {
            addCriterion("outofdate is null");
            return (Criteria) this;
        }

        public Criteria andOutofdateIsNotNull() {
            addCriterion("outofdate is not null");
            return (Criteria) this;
        }

        public Criteria andOutofdateEqualTo(String value) {
            addCriterion("outofdate =", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateNotEqualTo(String value) {
            addCriterion("outofdate <>", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateGreaterThan(String value) {
            addCriterion("outofdate >", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateGreaterThanOrEqualTo(String value) {
            addCriterion("outofdate >=", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateLessThan(String value) {
            addCriterion("outofdate <", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateLessThanOrEqualTo(String value) {
            addCriterion("outofdate <=", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateLike(String value) {
            addCriterion("outofdate like", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateNotLike(String value) {
            addCriterion("outofdate not like", value, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateIn(List<String> values) {
            addCriterion("outofdate in", values, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateNotIn(List<String> values) {
            addCriterion("outofdate not in", values, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateBetween(String value1, String value2) {
            addCriterion("outofdate between", value1, value2, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofdateNotBetween(String value1, String value2) {
            addCriterion("outofdate not between", value1, value2, "outofdate");
            return (Criteria) this;
        }

        public Criteria andOutofplaceIsNull() {
            addCriterion("outofplace is null");
            return (Criteria) this;
        }

        public Criteria andOutofplaceIsNotNull() {
            addCriterion("outofplace is not null");
            return (Criteria) this;
        }

        public Criteria andOutofplaceEqualTo(String value) {
            addCriterion("outofplace =", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceNotEqualTo(String value) {
            addCriterion("outofplace <>", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceGreaterThan(String value) {
            addCriterion("outofplace >", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceGreaterThanOrEqualTo(String value) {
            addCriterion("outofplace >=", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceLessThan(String value) {
            addCriterion("outofplace <", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceLessThanOrEqualTo(String value) {
            addCriterion("outofplace <=", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceLike(String value) {
            addCriterion("outofplace like", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceNotLike(String value) {
            addCriterion("outofplace not like", value, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceIn(List<String> values) {
            addCriterion("outofplace in", values, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceNotIn(List<String> values) {
            addCriterion("outofplace not in", values, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceBetween(String value1, String value2) {
            addCriterion("outofplace between", value1, value2, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutofplaceNotBetween(String value1, String value2) {
            addCriterion("outofplace not between", value1, value2, "outofplace");
            return (Criteria) this;
        }

        public Criteria andOutoftypeIsNull() {
            addCriterion("outoftype is null");
            return (Criteria) this;
        }

        public Criteria andOutoftypeIsNotNull() {
            addCriterion("outoftype is not null");
            return (Criteria) this;
        }

        public Criteria andOutoftypeEqualTo(String value) {
            addCriterion("outoftype =", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeNotEqualTo(String value) {
            addCriterion("outoftype <>", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeGreaterThan(String value) {
            addCriterion("outoftype >", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeGreaterThanOrEqualTo(String value) {
            addCriterion("outoftype >=", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeLessThan(String value) {
            addCriterion("outoftype <", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeLessThanOrEqualTo(String value) {
            addCriterion("outoftype <=", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeLike(String value) {
            addCriterion("outoftype like", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeNotLike(String value) {
            addCriterion("outoftype not like", value, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeIn(List<String> values) {
            addCriterion("outoftype in", values, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeNotIn(List<String> values) {
            addCriterion("outoftype not in", values, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeBetween(String value1, String value2) {
            addCriterion("outoftype between", value1, value2, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutoftypeNotBetween(String value1, String value2) {
            addCriterion("outoftype not between", value1, value2, "outoftype");
            return (Criteria) this;
        }

        public Criteria andOutofreasonIsNull() {
            addCriterion("outofreason is null");
            return (Criteria) this;
        }

        public Criteria andOutofreasonIsNotNull() {
            addCriterion("outofreason is not null");
            return (Criteria) this;
        }

        public Criteria andOutofreasonEqualTo(String value) {
            addCriterion("outofreason =", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonNotEqualTo(String value) {
            addCriterion("outofreason <>", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonGreaterThan(String value) {
            addCriterion("outofreason >", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonGreaterThanOrEqualTo(String value) {
            addCriterion("outofreason >=", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonLessThan(String value) {
            addCriterion("outofreason <", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonLessThanOrEqualTo(String value) {
            addCriterion("outofreason <=", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonLike(String value) {
            addCriterion("outofreason like", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonNotLike(String value) {
            addCriterion("outofreason not like", value, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonIn(List<String> values) {
            addCriterion("outofreason in", values, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonNotIn(List<String> values) {
            addCriterion("outofreason not in", values, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonBetween(String value1, String value2) {
            addCriterion("outofreason between", value1, value2, "outofreason");
            return (Criteria) this;
        }

        public Criteria andOutofreasonNotBetween(String value1, String value2) {
            addCriterion("outofreason not between", value1, value2, "outofreason");
            return (Criteria) this;
        }

        public Criteria andAvtivenumIsNull() {
            addCriterion("avtivenum is null");
            return (Criteria) this;
        }

        public Criteria andAvtivenumIsNotNull() {
            addCriterion("avtivenum is not null");
            return (Criteria) this;
        }

        public Criteria andAvtivenumEqualTo(String value) {
            addCriterion("avtivenum =", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumNotEqualTo(String value) {
            addCriterion("avtivenum <>", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumGreaterThan(String value) {
            addCriterion("avtivenum >", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumGreaterThanOrEqualTo(String value) {
            addCriterion("avtivenum >=", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumLessThan(String value) {
            addCriterion("avtivenum <", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumLessThanOrEqualTo(String value) {
            addCriterion("avtivenum <=", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumLike(String value) {
            addCriterion("avtivenum like", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumNotLike(String value) {
            addCriterion("avtivenum not like", value, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumIn(List<String> values) {
            addCriterion("avtivenum in", values, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumNotIn(List<String> values) {
            addCriterion("avtivenum not in", values, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumBetween(String value1, String value2) {
            addCriterion("avtivenum between", value1, value2, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andAvtivenumNotBetween(String value1, String value2) {
            addCriterion("avtivenum not between", value1, value2, "avtivenum");
            return (Criteria) this;
        }

        public Criteria andContactstatusIsNull() {
            addCriterion("contactstatus is null");
            return (Criteria) this;
        }

        public Criteria andContactstatusIsNotNull() {
            addCriterion("contactstatus is not null");
            return (Criteria) this;
        }

        public Criteria andContactstatusEqualTo(String value) {
            addCriterion("contactstatus =", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusNotEqualTo(String value) {
            addCriterion("contactstatus <>", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusGreaterThan(String value) {
            addCriterion("contactstatus >", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusGreaterThanOrEqualTo(String value) {
            addCriterion("contactstatus >=", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusLessThan(String value) {
            addCriterion("contactstatus <", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusLessThanOrEqualTo(String value) {
            addCriterion("contactstatus <=", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusLike(String value) {
            addCriterion("contactstatus like", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusNotLike(String value) {
            addCriterion("contactstatus not like", value, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusIn(List<String> values) {
            addCriterion("contactstatus in", values, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusNotIn(List<String> values) {
            addCriterion("contactstatus not in", values, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusBetween(String value1, String value2) {
            addCriterion("contactstatus between", value1, value2, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andContactstatusNotBetween(String value1, String value2) {
            addCriterion("contactstatus not between", value1, value2, "contactstatus");
            return (Criteria) this;
        }

        public Criteria andOutcontectIsNull() {
            addCriterion("outcontect is null");
            return (Criteria) this;
        }

        public Criteria andOutcontectIsNotNull() {
            addCriterion("outcontect is not null");
            return (Criteria) this;
        }

        public Criteria andOutcontectEqualTo(String value) {
            addCriterion("outcontect =", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectNotEqualTo(String value) {
            addCriterion("outcontect <>", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectGreaterThan(String value) {
            addCriterion("outcontect >", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectGreaterThanOrEqualTo(String value) {
            addCriterion("outcontect >=", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectLessThan(String value) {
            addCriterion("outcontect <", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectLessThanOrEqualTo(String value) {
            addCriterion("outcontect <=", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectLike(String value) {
            addCriterion("outcontect like", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectNotLike(String value) {
            addCriterion("outcontect not like", value, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectIn(List<String> values) {
            addCriterion("outcontect in", values, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectNotIn(List<String> values) {
            addCriterion("outcontect not in", values, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectBetween(String value1, String value2) {
            addCriterion("outcontect between", value1, value2, "outcontect");
            return (Criteria) this;
        }

        public Criteria andOutcontectNotBetween(String value1, String value2) {
            addCriterion("outcontect not between", value1, value2, "outcontect");
            return (Criteria) this;
        }

        public Criteria andIncontectIsNull() {
            addCriterion("incontect is null");
            return (Criteria) this;
        }

        public Criteria andIncontectIsNotNull() {
            addCriterion("incontect is not null");
            return (Criteria) this;
        }

        public Criteria andIncontectEqualTo(String value) {
            addCriterion("incontect =", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectNotEqualTo(String value) {
            addCriterion("incontect <>", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectGreaterThan(String value) {
            addCriterion("incontect >", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectGreaterThanOrEqualTo(String value) {
            addCriterion("incontect >=", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectLessThan(String value) {
            addCriterion("incontect <", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectLessThanOrEqualTo(String value) {
            addCriterion("incontect <=", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectLike(String value) {
            addCriterion("incontect like", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectNotLike(String value) {
            addCriterion("incontect not like", value, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectIn(List<String> values) {
            addCriterion("incontect in", values, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectNotIn(List<String> values) {
            addCriterion("incontect not in", values, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectBetween(String value1, String value2) {
            addCriterion("incontect between", value1, value2, "incontect");
            return (Criteria) this;
        }

        public Criteria andIncontectNotBetween(String value1, String value2) {
            addCriterion("incontect not between", value1, value2, "incontect");
            return (Criteria) this;
        }

        public Criteria andInunitIsNull() {
            addCriterion("inunit is null");
            return (Criteria) this;
        }

        public Criteria andInunitIsNotNull() {
            addCriterion("inunit is not null");
            return (Criteria) this;
        }

        public Criteria andInunitEqualTo(String value) {
            addCriterion("inunit =", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitNotEqualTo(String value) {
            addCriterion("inunit <>", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitGreaterThan(String value) {
            addCriterion("inunit >", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitGreaterThanOrEqualTo(String value) {
            addCriterion("inunit >=", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitLessThan(String value) {
            addCriterion("inunit <", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitLessThanOrEqualTo(String value) {
            addCriterion("inunit <=", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitLike(String value) {
            addCriterion("inunit like", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitNotLike(String value) {
            addCriterion("inunit not like", value, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitIn(List<String> values) {
            addCriterion("inunit in", values, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitNotIn(List<String> values) {
            addCriterion("inunit not in", values, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitBetween(String value1, String value2) {
            addCriterion("inunit between", value1, value2, "inunit");
            return (Criteria) this;
        }

        public Criteria andInunitNotBetween(String value1, String value2) {
            addCriterion("inunit not between", value1, value2, "inunit");
            return (Criteria) this;
        }

        public Criteria andLostdateIsNull() {
            addCriterion("lostdate is null");
            return (Criteria) this;
        }

        public Criteria andLostdateIsNotNull() {
            addCriterion("lostdate is not null");
            return (Criteria) this;
        }

        public Criteria andLostdateEqualTo(String value) {
            addCriterion("lostdate =", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateNotEqualTo(String value) {
            addCriterion("lostdate <>", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateGreaterThan(String value) {
            addCriterion("lostdate >", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateGreaterThanOrEqualTo(String value) {
            addCriterion("lostdate >=", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateLessThan(String value) {
            addCriterion("lostdate <", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateLessThanOrEqualTo(String value) {
            addCriterion("lostdate <=", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateLike(String value) {
            addCriterion("lostdate like", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateNotLike(String value) {
            addCriterion("lostdate not like", value, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateIn(List<String> values) {
            addCriterion("lostdate in", values, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateNotIn(List<String> values) {
            addCriterion("lostdate not in", values, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateBetween(String value1, String value2) {
            addCriterion("lostdate between", value1, value2, "lostdate");
            return (Criteria) this;
        }

        public Criteria andLostdateNotBetween(String value1, String value2) {
            addCriterion("lostdate not between", value1, value2, "lostdate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateIsNull() {
            addCriterion("abroaddate is null");
            return (Criteria) this;
        }

        public Criteria andAbroaddateIsNotNull() {
            addCriterion("abroaddate is not null");
            return (Criteria) this;
        }

        public Criteria andAbroaddateEqualTo(String value) {
            addCriterion("abroaddate =", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateNotEqualTo(String value) {
            addCriterion("abroaddate <>", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateGreaterThan(String value) {
            addCriterion("abroaddate >", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateGreaterThanOrEqualTo(String value) {
            addCriterion("abroaddate >=", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateLessThan(String value) {
            addCriterion("abroaddate <", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateLessThanOrEqualTo(String value) {
            addCriterion("abroaddate <=", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateLike(String value) {
            addCriterion("abroaddate like", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateNotLike(String value) {
            addCriterion("abroaddate not like", value, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateIn(List<String> values) {
            addCriterion("abroaddate in", values, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateNotIn(List<String> values) {
            addCriterion("abroaddate not in", values, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateBetween(String value1, String value2) {
            addCriterion("abroaddate between", value1, value2, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroaddateNotBetween(String value1, String value2) {
            addCriterion("abroaddate not between", value1, value2, "abroaddate");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonIsNull() {
            addCriterion("abroadreason is null");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonIsNotNull() {
            addCriterion("abroadreason is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonEqualTo(String value) {
            addCriterion("abroadreason =", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonNotEqualTo(String value) {
            addCriterion("abroadreason <>", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonGreaterThan(String value) {
            addCriterion("abroadreason >", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonGreaterThanOrEqualTo(String value) {
            addCriterion("abroadreason >=", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonLessThan(String value) {
            addCriterion("abroadreason <", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonLessThanOrEqualTo(String value) {
            addCriterion("abroadreason <=", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonLike(String value) {
            addCriterion("abroadreason like", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonNotLike(String value) {
            addCriterion("abroadreason not like", value, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonIn(List<String> values) {
            addCriterion("abroadreason in", values, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonNotIn(List<String> values) {
            addCriterion("abroadreason not in", values, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonBetween(String value1, String value2) {
            addCriterion("abroadreason between", value1, value2, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadreasonNotBetween(String value1, String value2) {
            addCriterion("abroadreason not between", value1, value2, "abroadreason");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusIsNull() {
            addCriterion("abroadstatus is null");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusIsNotNull() {
            addCriterion("abroadstatus is not null");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusEqualTo(String value) {
            addCriterion("abroadstatus =", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusNotEqualTo(String value) {
            addCriterion("abroadstatus <>", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusGreaterThan(String value) {
            addCriterion("abroadstatus >", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusGreaterThanOrEqualTo(String value) {
            addCriterion("abroadstatus >=", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusLessThan(String value) {
            addCriterion("abroadstatus <", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusLessThanOrEqualTo(String value) {
            addCriterion("abroadstatus <=", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusLike(String value) {
            addCriterion("abroadstatus like", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusNotLike(String value) {
            addCriterion("abroadstatus not like", value, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusIn(List<String> values) {
            addCriterion("abroadstatus in", values, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusNotIn(List<String> values) {
            addCriterion("abroadstatus not in", values, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusBetween(String value1, String value2) {
            addCriterion("abroadstatus between", value1, value2, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andAbroadstatusNotBetween(String value1, String value2) {
            addCriterion("abroadstatus not between", value1, value2, "abroadstatus");
            return (Criteria) this;
        }

        public Criteria andPartyshipIsNull() {
            addCriterion("partyship is null");
            return (Criteria) this;
        }

        public Criteria andPartyshipIsNotNull() {
            addCriterion("partyship is not null");
            return (Criteria) this;
        }

        public Criteria andPartyshipEqualTo(String value) {
            addCriterion("partyship =", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipNotEqualTo(String value) {
            addCriterion("partyship <>", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipGreaterThan(String value) {
            addCriterion("partyship >", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipGreaterThanOrEqualTo(String value) {
            addCriterion("partyship >=", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipLessThan(String value) {
            addCriterion("partyship <", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipLessThanOrEqualTo(String value) {
            addCriterion("partyship <=", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipLike(String value) {
            addCriterion("partyship like", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipNotLike(String value) {
            addCriterion("partyship not like", value, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipIn(List<String> values) {
            addCriterion("partyship in", values, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipNotIn(List<String> values) {
            addCriterion("partyship not in", values, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipBetween(String value1, String value2) {
            addCriterion("partyship between", value1, value2, "partyship");
            return (Criteria) this;
        }

        public Criteria andPartyshipNotBetween(String value1, String value2) {
            addCriterion("partyship not between", value1, value2, "partyship");
            return (Criteria) this;
        }

        public Criteria andBackdateIsNull() {
            addCriterion("backdate is null");
            return (Criteria) this;
        }

        public Criteria andBackdateIsNotNull() {
            addCriterion("backdate is not null");
            return (Criteria) this;
        }

        public Criteria andBackdateEqualTo(String value) {
            addCriterion("backdate =", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotEqualTo(String value) {
            addCriterion("backdate <>", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateGreaterThan(String value) {
            addCriterion("backdate >", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateGreaterThanOrEqualTo(String value) {
            addCriterion("backdate >=", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateLessThan(String value) {
            addCriterion("backdate <", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateLessThanOrEqualTo(String value) {
            addCriterion("backdate <=", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateLike(String value) {
            addCriterion("backdate like", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotLike(String value) {
            addCriterion("backdate not like", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateIn(List<String> values) {
            addCriterion("backdate in", values, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotIn(List<String> values) {
            addCriterion("backdate not in", values, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateBetween(String value1, String value2) {
            addCriterion("backdate between", value1, value2, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotBetween(String value1, String value2) {
            addCriterion("backdate not between", value1, value2, "backdate");
            return (Criteria) this;
        }

        public Criteria andIngroupIsNull() {
            addCriterion("ingroup is null");
            return (Criteria) this;
        }

        public Criteria andIngroupIsNotNull() {
            addCriterion("ingroup is not null");
            return (Criteria) this;
        }

        public Criteria andIngroupEqualTo(String value) {
            addCriterion("ingroup =", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupNotEqualTo(String value) {
            addCriterion("ingroup <>", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupGreaterThan(String value) {
            addCriterion("ingroup >", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupGreaterThanOrEqualTo(String value) {
            addCriterion("ingroup >=", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupLessThan(String value) {
            addCriterion("ingroup <", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupLessThanOrEqualTo(String value) {
            addCriterion("ingroup <=", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupLike(String value) {
            addCriterion("ingroup like", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupNotLike(String value) {
            addCriterion("ingroup not like", value, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupIn(List<String> values) {
            addCriterion("ingroup in", values, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupNotIn(List<String> values) {
            addCriterion("ingroup not in", values, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupBetween(String value1, String value2) {
            addCriterion("ingroup between", value1, value2, "ingroup");
            return (Criteria) this;
        }

        public Criteria andIngroupNotBetween(String value1, String value2) {
            addCriterion("ingroup not between", value1, value2, "ingroup");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusIsNull() {
            addCriterion("recoverstatus is null");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusIsNotNull() {
            addCriterion("recoverstatus is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusEqualTo(String value) {
            addCriterion("recoverstatus =", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusNotEqualTo(String value) {
            addCriterion("recoverstatus <>", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusGreaterThan(String value) {
            addCriterion("recoverstatus >", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusGreaterThanOrEqualTo(String value) {
            addCriterion("recoverstatus >=", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusLessThan(String value) {
            addCriterion("recoverstatus <", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusLessThanOrEqualTo(String value) {
            addCriterion("recoverstatus <=", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusLike(String value) {
            addCriterion("recoverstatus like", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusNotLike(String value) {
            addCriterion("recoverstatus not like", value, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusIn(List<String> values) {
            addCriterion("recoverstatus in", values, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusNotIn(List<String> values) {
            addCriterion("recoverstatus not in", values, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusBetween(String value1, String value2) {
            addCriterion("recoverstatus between", value1, value2, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andRecoverstatusNotBetween(String value1, String value2) {
            addCriterion("recoverstatus not between", value1, value2, "recoverstatus");
            return (Criteria) this;
        }

        public Criteria andBackupsIsNull() {
            addCriterion("backups is null");
            return (Criteria) this;
        }

        public Criteria andBackupsIsNotNull() {
            addCriterion("backups is not null");
            return (Criteria) this;
        }

        public Criteria andBackupsEqualTo(String value) {
            addCriterion("backups =", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsNotEqualTo(String value) {
            addCriterion("backups <>", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsGreaterThan(String value) {
            addCriterion("backups >", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsGreaterThanOrEqualTo(String value) {
            addCriterion("backups >=", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsLessThan(String value) {
            addCriterion("backups <", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsLessThanOrEqualTo(String value) {
            addCriterion("backups <=", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsLike(String value) {
            addCriterion("backups like", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsNotLike(String value) {
            addCriterion("backups not like", value, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsIn(List<String> values) {
            addCriterion("backups in", values, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsNotIn(List<String> values) {
            addCriterion("backups not in", values, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsBetween(String value1, String value2) {
            addCriterion("backups between", value1, value2, "backups");
            return (Criteria) this;
        }

        public Criteria andBackupsNotBetween(String value1, String value2) {
            addCriterion("backups not between", value1, value2, "backups");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNull() {
            addCriterion("operationtime is null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNotNull() {
            addCriterion("operationtime is not null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeEqualTo(String value) {
            addCriterion("operationtime =", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotEqualTo(String value) {
            addCriterion("operationtime <>", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThan(String value) {
            addCriterion("operationtime >", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("operationtime >=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThan(String value) {
            addCriterion("operationtime <", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThanOrEqualTo(String value) {
            addCriterion("operationtime <=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLike(String value) {
            addCriterion("operationtime like", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotLike(String value) {
            addCriterion("operationtime not like", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIn(List<String> values) {
            addCriterion("operationtime in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotIn(List<String> values) {
            addCriterion("operationtime not in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeBetween(String value1, String value2) {
            addCriterion("operationtime between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotBetween(String value1, String value2) {
            addCriterion("operationtime not between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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
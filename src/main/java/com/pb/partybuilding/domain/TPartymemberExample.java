package com.pb.partybuilding.domain;

import java.util.ArrayList;
import java.util.List;

public class TPartymemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPartymemberExample() {
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
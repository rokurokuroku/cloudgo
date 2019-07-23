package com.roku.cloudgo.pojo;

import java.util.ArrayList;
import java.util.List;

public class SellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerExample() {
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

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNull() {
            addCriterion("seller_password is null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNotNull() {
            addCriterion("seller_password is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordEqualTo(String value) {
            addCriterion("seller_password =", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotEqualTo(String value) {
            addCriterion("seller_password <>", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThan(String value) {
            addCriterion("seller_password >", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("seller_password >=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThan(String value) {
            addCriterion("seller_password <", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThanOrEqualTo(String value) {
            addCriterion("seller_password <=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLike(String value) {
            addCriterion("seller_password like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotLike(String value) {
            addCriterion("seller_password not like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIn(List<String> values) {
            addCriterion("seller_password in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotIn(List<String> values) {
            addCriterion("seller_password not in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordBetween(String value1, String value2) {
            addCriterion("seller_password between", value1, value2, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotBetween(String value1, String value2) {
            addCriterion("seller_password not between", value1, value2, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneIsNull() {
            addCriterion("seller_telephone is null");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneIsNotNull() {
            addCriterion("seller_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneEqualTo(Integer value) {
            addCriterion("seller_telephone =", value, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneNotEqualTo(Integer value) {
            addCriterion("seller_telephone <>", value, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneGreaterThan(Integer value) {
            addCriterion("seller_telephone >", value, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_telephone >=", value, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneLessThan(Integer value) {
            addCriterion("seller_telephone <", value, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneLessThanOrEqualTo(Integer value) {
            addCriterion("seller_telephone <=", value, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneIn(List<Integer> values) {
            addCriterion("seller_telephone in", values, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneNotIn(List<Integer> values) {
            addCriterion("seller_telephone not in", values, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneBetween(Integer value1, Integer value2) {
            addCriterion("seller_telephone between", value1, value2, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerTelephoneNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_telephone not between", value1, value2, "sellerTelephone");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIsNull() {
            addCriterion("seller_email is null");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIsNotNull() {
            addCriterion("seller_email is not null");
            return (Criteria) this;
        }

        public Criteria andSellerEmailEqualTo(String value) {
            addCriterion("seller_email =", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotEqualTo(String value) {
            addCriterion("seller_email <>", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailGreaterThan(String value) {
            addCriterion("seller_email >", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("seller_email >=", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLessThan(String value) {
            addCriterion("seller_email <", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLessThanOrEqualTo(String value) {
            addCriterion("seller_email <=", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailLike(String value) {
            addCriterion("seller_email like", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotLike(String value) {
            addCriterion("seller_email not like", value, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailIn(List<String> values) {
            addCriterion("seller_email in", values, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotIn(List<String> values) {
            addCriterion("seller_email not in", values, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailBetween(String value1, String value2) {
            addCriterion("seller_email between", value1, value2, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerEmailNotBetween(String value1, String value2) {
            addCriterion("seller_email not between", value1, value2, "sellerEmail");
            return (Criteria) this;
        }

        public Criteria andSellerLevelIsNull() {
            addCriterion("seller_level is null");
            return (Criteria) this;
        }

        public Criteria andSellerLevelIsNotNull() {
            addCriterion("seller_level is not null");
            return (Criteria) this;
        }

        public Criteria andSellerLevelEqualTo(Integer value) {
            addCriterion("seller_level =", value, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelNotEqualTo(Integer value) {
            addCriterion("seller_level <>", value, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelGreaterThan(Integer value) {
            addCriterion("seller_level >", value, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_level >=", value, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelLessThan(Integer value) {
            addCriterion("seller_level <", value, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("seller_level <=", value, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelIn(List<Integer> values) {
            addCriterion("seller_level in", values, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelNotIn(List<Integer> values) {
            addCriterion("seller_level not in", values, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelBetween(Integer value1, Integer value2) {
            addCriterion("seller_level between", value1, value2, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_level not between", value1, value2, "sellerLevel");
            return (Criteria) this;
        }

        public Criteria andSellerGenderIsNull() {
            addCriterion("seller_gender is null");
            return (Criteria) this;
        }

        public Criteria andSellerGenderIsNotNull() {
            addCriterion("seller_gender is not null");
            return (Criteria) this;
        }

        public Criteria andSellerGenderEqualTo(String value) {
            addCriterion("seller_gender =", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderNotEqualTo(String value) {
            addCriterion("seller_gender <>", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderGreaterThan(String value) {
            addCriterion("seller_gender >", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("seller_gender >=", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderLessThan(String value) {
            addCriterion("seller_gender <", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderLessThanOrEqualTo(String value) {
            addCriterion("seller_gender <=", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderLike(String value) {
            addCriterion("seller_gender like", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderNotLike(String value) {
            addCriterion("seller_gender not like", value, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderIn(List<String> values) {
            addCriterion("seller_gender in", values, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderNotIn(List<String> values) {
            addCriterion("seller_gender not in", values, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderBetween(String value1, String value2) {
            addCriterion("seller_gender between", value1, value2, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerGenderNotBetween(String value1, String value2) {
            addCriterion("seller_gender not between", value1, value2, "sellerGender");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionIsNull() {
            addCriterion("seller_description is null");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionIsNotNull() {
            addCriterion("seller_description is not null");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionEqualTo(String value) {
            addCriterion("seller_description =", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionNotEqualTo(String value) {
            addCriterion("seller_description <>", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionGreaterThan(String value) {
            addCriterion("seller_description >", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("seller_description >=", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionLessThan(String value) {
            addCriterion("seller_description <", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionLessThanOrEqualTo(String value) {
            addCriterion("seller_description <=", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionLike(String value) {
            addCriterion("seller_description like", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionNotLike(String value) {
            addCriterion("seller_description not like", value, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionIn(List<String> values) {
            addCriterion("seller_description in", values, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionNotIn(List<String> values) {
            addCriterion("seller_description not in", values, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionBetween(String value1, String value2) {
            addCriterion("seller_description between", value1, value2, "sellerDescription");
            return (Criteria) this;
        }

        public Criteria andSellerDescriptionNotBetween(String value1, String value2) {
            addCriterion("seller_description not between", value1, value2, "sellerDescription");
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
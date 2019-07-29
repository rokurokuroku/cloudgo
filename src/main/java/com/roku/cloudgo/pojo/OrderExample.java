package com.roku.cloudgo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Long value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Long value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Long value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Long value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Long> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Long> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Long value1, Long value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNumbersIsNull() {
            addCriterion("product_numbers is null");
            return (Criteria) this;
        }

        public Criteria andProductNumbersIsNotNull() {
            addCriterion("product_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumbersEqualTo(Long value) {
            addCriterion("product_numbers =", value, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersNotEqualTo(Long value) {
            addCriterion("product_numbers <>", value, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersGreaterThan(Long value) {
            addCriterion("product_numbers >", value, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersGreaterThanOrEqualTo(Long value) {
            addCriterion("product_numbers >=", value, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersLessThan(Long value) {
            addCriterion("product_numbers <", value, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersLessThanOrEqualTo(Long value) {
            addCriterion("product_numbers <=", value, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersIn(List<Long> values) {
            addCriterion("product_numbers in", values, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersNotIn(List<Long> values) {
            addCriterion("product_numbers not in", values, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersBetween(Long value1, Long value2) {
            addCriterion("product_numbers between", value1, value2, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andProductNumbersNotBetween(Long value1, Long value2) {
            addCriterion("product_numbers not between", value1, value2, "productNumbers");
            return (Criteria) this;
        }

        public Criteria andTradingHourIsNull() {
            addCriterion("trading_hour is null");
            return (Criteria) this;
        }

        public Criteria andTradingHourIsNotNull() {
            addCriterion("trading_hour is not null");
            return (Criteria) this;
        }

        public Criteria andTradingHourEqualTo(Date value) {
            addCriterion("trading_hour =", value, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourNotEqualTo(Date value) {
            addCriterion("trading_hour <>", value, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourGreaterThan(Date value) {
            addCriterion("trading_hour >", value, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourGreaterThanOrEqualTo(Date value) {
            addCriterion("trading_hour >=", value, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourLessThan(Date value) {
            addCriterion("trading_hour <", value, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourLessThanOrEqualTo(Date value) {
            addCriterion("trading_hour <=", value, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourIn(List<Date> values) {
            addCriterion("trading_hour in", values, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourNotIn(List<Date> values) {
            addCriterion("trading_hour not in", values, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourBetween(Date value1, Date value2) {
            addCriterion("trading_hour between", value1, value2, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andTradingHourNotBetween(Date value1, Date value2) {
            addCriterion("trading_hour not between", value1, value2, "tradingHour");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNull() {
            addCriterion("shipping_address is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNotNull() {
            addCriterion("shipping_address is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualTo(String value) {
            addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualTo(String value) {
            addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThan(String value) {
            addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThan(String value) {
            addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLike(String value) {
            addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotLike(String value) {
            addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIn(List<String> values) {
            addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotIn(List<String> values) {
            addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressBetween(String value1, String value2) {
            addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotBetween(String value1, String value2) {
            addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIsNull() {
            addCriterion("transaction_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIsNotNull() {
            addCriterion("transaction_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountEqualTo(Float value) {
            addCriterion("transaction_amount =", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotEqualTo(Float value) {
            addCriterion("transaction_amount <>", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountGreaterThan(Float value) {
            addCriterion("transaction_amount >", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("transaction_amount >=", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountLessThan(Float value) {
            addCriterion("transaction_amount <", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountLessThanOrEqualTo(Float value) {
            addCriterion("transaction_amount <=", value, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountIn(List<Float> values) {
            addCriterion("transaction_amount in", values, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotIn(List<Float> values) {
            addCriterion("transaction_amount not in", values, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountBetween(Float value1, Float value2) {
            addCriterion("transaction_amount between", value1, value2, "transactionAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionAmountNotBetween(Float value1, Float value2) {
            addCriterion("transaction_amount not between", value1, value2, "transactionAmount");
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
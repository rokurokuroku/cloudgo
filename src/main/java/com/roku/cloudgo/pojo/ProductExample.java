package com.roku.cloudgo.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
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

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Float value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Float value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Float value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Float value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Float value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Float> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Float> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Float value1, Float value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Float value1, Float value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductRemainingIsNull() {
            addCriterion("product_remaining is null");
            return (Criteria) this;
        }

        public Criteria andProductRemainingIsNotNull() {
            addCriterion("product_remaining is not null");
            return (Criteria) this;
        }

        public Criteria andProductRemainingEqualTo(Integer value) {
            addCriterion("product_remaining =", value, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingNotEqualTo(Integer value) {
            addCriterion("product_remaining <>", value, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingGreaterThan(Integer value) {
            addCriterion("product_remaining >", value, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_remaining >=", value, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingLessThan(Integer value) {
            addCriterion("product_remaining <", value, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingLessThanOrEqualTo(Integer value) {
            addCriterion("product_remaining <=", value, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingIn(List<Integer> values) {
            addCriterion("product_remaining in", values, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingNotIn(List<Integer> values) {
            addCriterion("product_remaining not in", values, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingBetween(Integer value1, Integer value2) {
            addCriterion("product_remaining between", value1, value2, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductRemainingNotBetween(Integer value1, Integer value2) {
            addCriterion("product_remaining not between", value1, value2, "productRemaining");
            return (Criteria) this;
        }

        public Criteria andProductSalesIsNull() {
            addCriterion("product_sales is null");
            return (Criteria) this;
        }

        public Criteria andProductSalesIsNotNull() {
            addCriterion("product_sales is not null");
            return (Criteria) this;
        }

        public Criteria andProductSalesEqualTo(Integer value) {
            addCriterion("product_sales =", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesNotEqualTo(Integer value) {
            addCriterion("product_sales <>", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesGreaterThan(Integer value) {
            addCriterion("product_sales >", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_sales >=", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesLessThan(Integer value) {
            addCriterion("product_sales <", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesLessThanOrEqualTo(Integer value) {
            addCriterion("product_sales <=", value, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesIn(List<Integer> values) {
            addCriterion("product_sales in", values, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesNotIn(List<Integer> values) {
            addCriterion("product_sales not in", values, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesBetween(Integer value1, Integer value2) {
            addCriterion("product_sales between", value1, value2, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("product_sales not between", value1, value2, "productSales");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNull() {
            addCriterion("product_description is null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIsNotNull() {
            addCriterion("product_description is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionEqualTo(String value) {
            addCriterion("product_description =", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotEqualTo(String value) {
            addCriterion("product_description <>", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThan(String value) {
            addCriterion("product_description >", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("product_description >=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThan(String value) {
            addCriterion("product_description <", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLessThanOrEqualTo(String value) {
            addCriterion("product_description <=", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionLike(String value) {
            addCriterion("product_description like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotLike(String value) {
            addCriterion("product_description not like", value, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionIn(List<String> values) {
            addCriterion("product_description in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotIn(List<String> values) {
            addCriterion("product_description not in", values, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionBetween(String value1, String value2) {
            addCriterion("product_description between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductDescriptionNotBetween(String value1, String value2) {
            addCriterion("product_description not between", value1, value2, "productDescription");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNull() {
            addCriterion("product_image is null");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNotNull() {
            addCriterion("product_image is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageEqualTo(Integer value) {
            addCriterion("product_image =", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotEqualTo(Integer value) {
            addCriterion("product_image <>", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThan(Integer value) {
            addCriterion("product_image >", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_image >=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThan(Integer value) {
            addCriterion("product_image <", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThanOrEqualTo(Integer value) {
            addCriterion("product_image <=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageIn(List<Integer> values) {
            addCriterion("product_image in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotIn(List<Integer> values) {
            addCriterion("product_image not in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageBetween(Integer value1, Integer value2) {
            addCriterion("product_image between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotBetween(Integer value1, Integer value2) {
            addCriterion("product_image not between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductMarkIsNull() {
            addCriterion("product_mark is null");
            return (Criteria) this;
        }

        public Criteria andProductMarkIsNotNull() {
            addCriterion("product_mark is not null");
            return (Criteria) this;
        }

        public Criteria andProductMarkEqualTo(Float value) {
            addCriterion("product_mark =", value, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkNotEqualTo(Float value) {
            addCriterion("product_mark <>", value, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkGreaterThan(Float value) {
            addCriterion("product_mark >", value, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkGreaterThanOrEqualTo(Float value) {
            addCriterion("product_mark >=", value, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkLessThan(Float value) {
            addCriterion("product_mark <", value, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkLessThanOrEqualTo(Float value) {
            addCriterion("product_mark <=", value, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkIn(List<Float> values) {
            addCriterion("product_mark in", values, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkNotIn(List<Float> values) {
            addCriterion("product_mark not in", values, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkBetween(Float value1, Float value2) {
            addCriterion("product_mark between", value1, value2, "productMark");
            return (Criteria) this;
        }

        public Criteria andProductMarkNotBetween(Float value1, Float value2) {
            addCriterion("product_mark not between", value1, value2, "productMark");
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
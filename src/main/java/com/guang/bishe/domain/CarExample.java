package com.guang.bishe.domain;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Long value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Long value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Long value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Long value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Long value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Long> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Long> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Long value1, Long value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Long value1, Long value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdIsNull() {
            addCriterion("car_buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdIsNotNull() {
            addCriterion("car_buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdEqualTo(Long value) {
            addCriterion("car_buyer_id =", value, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdNotEqualTo(Long value) {
            addCriterion("car_buyer_id <>", value, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdGreaterThan(Long value) {
            addCriterion("car_buyer_id >", value, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_buyer_id >=", value, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdLessThan(Long value) {
            addCriterion("car_buyer_id <", value, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("car_buyer_id <=", value, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdIn(List<Long> values) {
            addCriterion("car_buyer_id in", values, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdNotIn(List<Long> values) {
            addCriterion("car_buyer_id not in", values, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdBetween(Long value1, Long value2) {
            addCriterion("car_buyer_id between", value1, value2, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("car_buyer_id not between", value1, value2, "carBuyerId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdIsNull() {
            addCriterion("car_product_id is null");
            return (Criteria) this;
        }

        public Criteria andCarProductIdIsNotNull() {
            addCriterion("car_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarProductIdEqualTo(Long value) {
            addCriterion("car_product_id =", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdNotEqualTo(Long value) {
            addCriterion("car_product_id <>", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdGreaterThan(Long value) {
            addCriterion("car_product_id >", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("car_product_id >=", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdLessThan(Long value) {
            addCriterion("car_product_id <", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdLessThanOrEqualTo(Long value) {
            addCriterion("car_product_id <=", value, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdIn(List<Long> values) {
            addCriterion("car_product_id in", values, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdNotIn(List<Long> values) {
            addCriterion("car_product_id not in", values, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdBetween(Long value1, Long value2) {
            addCriterion("car_product_id between", value1, value2, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductIdNotBetween(Long value1, Long value2) {
            addCriterion("car_product_id not between", value1, value2, "carProductId");
            return (Criteria) this;
        }

        public Criteria andCarProductNumIsNull() {
            addCriterion("car_product_num is null");
            return (Criteria) this;
        }

        public Criteria andCarProductNumIsNotNull() {
            addCriterion("car_product_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarProductNumEqualTo(Integer value) {
            addCriterion("car_product_num =", value, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumNotEqualTo(Integer value) {
            addCriterion("car_product_num <>", value, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumGreaterThan(Integer value) {
            addCriterion("car_product_num >", value, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_product_num >=", value, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumLessThan(Integer value) {
            addCriterion("car_product_num <", value, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("car_product_num <=", value, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumIn(List<Integer> values) {
            addCriterion("car_product_num in", values, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumNotIn(List<Integer> values) {
            addCriterion("car_product_num not in", values, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumBetween(Integer value1, Integer value2) {
            addCriterion("car_product_num between", value1, value2, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("car_product_num not between", value1, value2, "carProductNum");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceIsNull() {
            addCriterion("car_product_price is null");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceIsNotNull() {
            addCriterion("car_product_price is not null");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceEqualTo(Double value) {
            addCriterion("car_product_price =", value, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceNotEqualTo(Double value) {
            addCriterion("car_product_price <>", value, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceGreaterThan(Double value) {
            addCriterion("car_product_price >", value, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("car_product_price >=", value, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceLessThan(Double value) {
            addCriterion("car_product_price <", value, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("car_product_price <=", value, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceIn(List<Double> values) {
            addCriterion("car_product_price in", values, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceNotIn(List<Double> values) {
            addCriterion("car_product_price not in", values, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceBetween(Double value1, Double value2) {
            addCriterion("car_product_price between", value1, value2, "carProductPrice");
            return (Criteria) this;
        }

        public Criteria andCarProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("car_product_price not between", value1, value2, "carProductPrice");
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
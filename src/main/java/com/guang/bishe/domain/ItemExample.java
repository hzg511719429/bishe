package com.guang.bishe.domain;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdIsNull() {
            addCriterion("item_order_id is null");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdIsNotNull() {
            addCriterion("item_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdEqualTo(Long value) {
            addCriterion("item_order_id =", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdNotEqualTo(Long value) {
            addCriterion("item_order_id <>", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdGreaterThan(Long value) {
            addCriterion("item_order_id >", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_order_id >=", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdLessThan(Long value) {
            addCriterion("item_order_id <", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("item_order_id <=", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdIn(List<Long> values) {
            addCriterion("item_order_id in", values, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdNotIn(List<Long> values) {
            addCriterion("item_order_id not in", values, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdBetween(Long value1, Long value2) {
            addCriterion("item_order_id between", value1, value2, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("item_order_id not between", value1, value2, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdIsNull() {
            addCriterion("item_product_id is null");
            return (Criteria) this;
        }

        public Criteria andItemProductIdIsNotNull() {
            addCriterion("item_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemProductIdEqualTo(Long value) {
            addCriterion("item_product_id =", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdNotEqualTo(Long value) {
            addCriterion("item_product_id <>", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdGreaterThan(Long value) {
            addCriterion("item_product_id >", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_product_id >=", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdLessThan(Long value) {
            addCriterion("item_product_id <", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdLessThanOrEqualTo(Long value) {
            addCriterion("item_product_id <=", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdIn(List<Long> values) {
            addCriterion("item_product_id in", values, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdNotIn(List<Long> values) {
            addCriterion("item_product_id not in", values, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdBetween(Long value1, Long value2) {
            addCriterion("item_product_id between", value1, value2, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdNotBetween(Long value1, Long value2) {
            addCriterion("item_product_id not between", value1, value2, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductNumIsNull() {
            addCriterion("item_product_num is null");
            return (Criteria) this;
        }

        public Criteria andItemProductNumIsNotNull() {
            addCriterion("item_product_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemProductNumEqualTo(Integer value) {
            addCriterion("item_product_num =", value, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumNotEqualTo(Integer value) {
            addCriterion("item_product_num <>", value, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumGreaterThan(Integer value) {
            addCriterion("item_product_num >", value, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_product_num >=", value, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumLessThan(Integer value) {
            addCriterion("item_product_num <", value, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumLessThanOrEqualTo(Integer value) {
            addCriterion("item_product_num <=", value, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumIn(List<Integer> values) {
            addCriterion("item_product_num in", values, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumNotIn(List<Integer> values) {
            addCriterion("item_product_num not in", values, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumBetween(Integer value1, Integer value2) {
            addCriterion("item_product_num between", value1, value2, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductNumNotBetween(Integer value1, Integer value2) {
            addCriterion("item_product_num not between", value1, value2, "itemProductNum");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceIsNull() {
            addCriterion("item_product_price is null");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceIsNotNull() {
            addCriterion("item_product_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceEqualTo(Double value) {
            addCriterion("item_product_price =", value, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceNotEqualTo(Double value) {
            addCriterion("item_product_price <>", value, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceGreaterThan(Double value) {
            addCriterion("item_product_price >", value, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("item_product_price >=", value, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceLessThan(Double value) {
            addCriterion("item_product_price <", value, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("item_product_price <=", value, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceIn(List<Double> values) {
            addCriterion("item_product_price in", values, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceNotIn(List<Double> values) {
            addCriterion("item_product_price not in", values, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceBetween(Double value1, Double value2) {
            addCriterion("item_product_price between", value1, value2, "itemProductPrice");
            return (Criteria) this;
        }

        public Criteria andItemProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("item_product_price not between", value1, value2, "itemProductPrice");
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
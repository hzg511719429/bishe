package com.guang.bishe.domain;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Long value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Long value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Long value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Long value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Long value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Long> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Long> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Long value1, Long value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Long value1, Long value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdIsNull() {
            addCriterion("menu_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdIsNotNull() {
            addCriterion("menu_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdEqualTo(Long value) {
            addCriterion("menu_seller_id =", value, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdNotEqualTo(Long value) {
            addCriterion("menu_seller_id <>", value, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdGreaterThan(Long value) {
            addCriterion("menu_seller_id >", value, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_seller_id >=", value, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdLessThan(Long value) {
            addCriterion("menu_seller_id <", value, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("menu_seller_id <=", value, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdIn(List<Long> values) {
            addCriterion("menu_seller_id in", values, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdNotIn(List<Long> values) {
            addCriterion("menu_seller_id not in", values, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdBetween(Long value1, Long value2) {
            addCriterion("menu_seller_id between", value1, value2, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("menu_seller_id not between", value1, value2, "menuSellerId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdIsNull() {
            addCriterion("menu_product_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdIsNotNull() {
            addCriterion("menu_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdEqualTo(Long value) {
            addCriterion("menu_product_id =", value, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdNotEqualTo(Long value) {
            addCriterion("menu_product_id <>", value, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdGreaterThan(Long value) {
            addCriterion("menu_product_id >", value, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("menu_product_id >=", value, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdLessThan(Long value) {
            addCriterion("menu_product_id <", value, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdLessThanOrEqualTo(Long value) {
            addCriterion("menu_product_id <=", value, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdIn(List<Long> values) {
            addCriterion("menu_product_id in", values, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdNotIn(List<Long> values) {
            addCriterion("menu_product_id not in", values, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdBetween(Long value1, Long value2) {
            addCriterion("menu_product_id between", value1, value2, "menuProductId");
            return (Criteria) this;
        }

        public Criteria andMenuProductIdNotBetween(Long value1, Long value2) {
            addCriterion("menu_product_id not between", value1, value2, "menuProductId");
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
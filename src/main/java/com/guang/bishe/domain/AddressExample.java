package com.guang.bishe.domain;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Long value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Long value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Long value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Long value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Long> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Long> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Long value1, Long value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdIsNull() {
            addCriterion("address_buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdIsNotNull() {
            addCriterion("address_buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdEqualTo(Long value) {
            addCriterion("address_buyer_id =", value, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdNotEqualTo(Long value) {
            addCriterion("address_buyer_id <>", value, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdGreaterThan(Long value) {
            addCriterion("address_buyer_id >", value, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("address_buyer_id >=", value, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdLessThan(Long value) {
            addCriterion("address_buyer_id <", value, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("address_buyer_id <=", value, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdIn(List<Long> values) {
            addCriterion("address_buyer_id in", values, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdNotIn(List<Long> values) {
            addCriterion("address_buyer_id not in", values, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdBetween(Long value1, Long value2) {
            addCriterion("address_buyer_id between", value1, value2, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("address_buyer_id not between", value1, value2, "addressBuyerId");
            return (Criteria) this;
        }

        public Criteria andAddressAddressIsNull() {
            addCriterion("address_address is null");
            return (Criteria) this;
        }

        public Criteria andAddressAddressIsNotNull() {
            addCriterion("address_address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressAddressEqualTo(String value) {
            addCriterion("address_address =", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressNotEqualTo(String value) {
            addCriterion("address_address <>", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressGreaterThan(String value) {
            addCriterion("address_address >", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address_address >=", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressLessThan(String value) {
            addCriterion("address_address <", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressLessThanOrEqualTo(String value) {
            addCriterion("address_address <=", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressLike(String value) {
            addCriterion("address_address like", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressNotLike(String value) {
            addCriterion("address_address not like", value, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressIn(List<String> values) {
            addCriterion("address_address in", values, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressNotIn(List<String> values) {
            addCriterion("address_address not in", values, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressBetween(String value1, String value2) {
            addCriterion("address_address between", value1, value2, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressAddressNotBetween(String value1, String value2) {
            addCriterion("address_address not between", value1, value2, "addressAddress");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultIsNull() {
            addCriterion("address_is_default is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultIsNotNull() {
            addCriterion("address_is_default is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultEqualTo(String value) {
            addCriterion("address_is_default =", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultNotEqualTo(String value) {
            addCriterion("address_is_default <>", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultGreaterThan(String value) {
            addCriterion("address_is_default >", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("address_is_default >=", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultLessThan(String value) {
            addCriterion("address_is_default <", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("address_is_default <=", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultLike(String value) {
            addCriterion("address_is_default like", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultNotLike(String value) {
            addCriterion("address_is_default not like", value, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultIn(List<String> values) {
            addCriterion("address_is_default in", values, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultNotIn(List<String> values) {
            addCriterion("address_is_default not in", values, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultBetween(String value1, String value2) {
            addCriterion("address_is_default between", value1, value2, "addressIsDefault");
            return (Criteria) this;
        }

        public Criteria andAddressIsDefaultNotBetween(String value1, String value2) {
            addCriterion("address_is_default not between", value1, value2, "addressIsDefault");
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
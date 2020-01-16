package com.guang.bishe.domain;

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

        public Criteria andProductNoIsNull() {
            addCriterion("product_no is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("product_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("product_no =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("product_no <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("product_no >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_no >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("product_no <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("product_no <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("product_no like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("product_no not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("product_no in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("product_no not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("product_no between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("product_no not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdIsNull() {
            addCriterion("product_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdIsNotNull() {
            addCriterion("product_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdEqualTo(Long value) {
            addCriterion("product_seller_id =", value, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdNotEqualTo(Long value) {
            addCriterion("product_seller_id <>", value, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdGreaterThan(Long value) {
            addCriterion("product_seller_id >", value, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_seller_id >=", value, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdLessThan(Long value) {
            addCriterion("product_seller_id <", value, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("product_seller_id <=", value, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdIn(List<Long> values) {
            addCriterion("product_seller_id in", values, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdNotIn(List<Long> values) {
            addCriterion("product_seller_id not in", values, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdBetween(Long value1, Long value2) {
            addCriterion("product_seller_id between", value1, value2, "productSellerId");
            return (Criteria) this;
        }

        public Criteria andProductSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("product_seller_id not between", value1, value2, "productSellerId");
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

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNull() {
            addCriterion("product_stock is null");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNotNull() {
            addCriterion("product_stock is not null");
            return (Criteria) this;
        }

        public Criteria andProductStockEqualTo(Integer value) {
            addCriterion("product_stock =", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotEqualTo(Integer value) {
            addCriterion("product_stock <>", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThan(Integer value) {
            addCriterion("product_stock >", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_stock >=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThan(Integer value) {
            addCriterion("product_stock <", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThanOrEqualTo(Integer value) {
            addCriterion("product_stock <=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockIn(List<Integer> values) {
            addCriterion("product_stock in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotIn(List<Integer> values) {
            addCriterion("product_stock not in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockBetween(Integer value1, Integer value2) {
            addCriterion("product_stock between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotBetween(Integer value1, Integer value2) {
            addCriterion("product_stock not between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductTasteIsNull() {
            addCriterion("product_taste is null");
            return (Criteria) this;
        }

        public Criteria andProductTasteIsNotNull() {
            addCriterion("product_taste is not null");
            return (Criteria) this;
        }

        public Criteria andProductTasteEqualTo(String value) {
            addCriterion("product_taste =", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteNotEqualTo(String value) {
            addCriterion("product_taste <>", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteGreaterThan(String value) {
            addCriterion("product_taste >", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteGreaterThanOrEqualTo(String value) {
            addCriterion("product_taste >=", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteLessThan(String value) {
            addCriterion("product_taste <", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteLessThanOrEqualTo(String value) {
            addCriterion("product_taste <=", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteLike(String value) {
            addCriterion("product_taste like", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteNotLike(String value) {
            addCriterion("product_taste not like", value, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteIn(List<String> values) {
            addCriterion("product_taste in", values, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteNotIn(List<String> values) {
            addCriterion("product_taste not in", values, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteBetween(String value1, String value2) {
            addCriterion("product_taste between", value1, value2, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductTasteNotBetween(String value1, String value2) {
            addCriterion("product_taste not between", value1, value2, "productTaste");
            return (Criteria) this;
        }

        public Criteria andProductIsSellIsNull() {
            addCriterion("product_is_sell is null");
            return (Criteria) this;
        }

        public Criteria andProductIsSellIsNotNull() {
            addCriterion("product_is_sell is not null");
            return (Criteria) this;
        }

        public Criteria andProductIsSellEqualTo(String value) {
            addCriterion("product_is_sell =", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellNotEqualTo(String value) {
            addCriterion("product_is_sell <>", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellGreaterThan(String value) {
            addCriterion("product_is_sell >", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellGreaterThanOrEqualTo(String value) {
            addCriterion("product_is_sell >=", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellLessThan(String value) {
            addCriterion("product_is_sell <", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellLessThanOrEqualTo(String value) {
            addCriterion("product_is_sell <=", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellLike(String value) {
            addCriterion("product_is_sell like", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellNotLike(String value) {
            addCriterion("product_is_sell not like", value, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellIn(List<String> values) {
            addCriterion("product_is_sell in", values, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellNotIn(List<String> values) {
            addCriterion("product_is_sell not in", values, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellBetween(String value1, String value2) {
            addCriterion("product_is_sell between", value1, value2, "productIsSell");
            return (Criteria) this;
        }

        public Criteria andProductIsSellNotBetween(String value1, String value2) {
            addCriterion("product_is_sell not between", value1, value2, "productIsSell");
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

        public Criteria andProductPictureIsNull() {
            addCriterion("product_picture is null");
            return (Criteria) this;
        }

        public Criteria andProductPictureIsNotNull() {
            addCriterion("product_picture is not null");
            return (Criteria) this;
        }

        public Criteria andProductPictureEqualTo(String value) {
            addCriterion("product_picture =", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotEqualTo(String value) {
            addCriterion("product_picture <>", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureGreaterThan(String value) {
            addCriterion("product_picture >", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureGreaterThanOrEqualTo(String value) {
            addCriterion("product_picture >=", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLessThan(String value) {
            addCriterion("product_picture <", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLessThanOrEqualTo(String value) {
            addCriterion("product_picture <=", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLike(String value) {
            addCriterion("product_picture like", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotLike(String value) {
            addCriterion("product_picture not like", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureIn(List<String> values) {
            addCriterion("product_picture in", values, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotIn(List<String> values) {
            addCriterion("product_picture not in", values, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureBetween(String value1, String value2) {
            addCriterion("product_picture between", value1, value2, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotBetween(String value1, String value2) {
            addCriterion("product_picture not between", value1, value2, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledIsNull() {
            addCriterion("product_hass_selled is null");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledIsNotNull() {
            addCriterion("product_hass_selled is not null");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledEqualTo(Integer value) {
            addCriterion("product_hass_selled =", value, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledNotEqualTo(Integer value) {
            addCriterion("product_hass_selled <>", value, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledGreaterThan(Integer value) {
            addCriterion("product_hass_selled >", value, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_hass_selled >=", value, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledLessThan(Integer value) {
            addCriterion("product_hass_selled <", value, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledLessThanOrEqualTo(Integer value) {
            addCriterion("product_hass_selled <=", value, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledIn(List<Integer> values) {
            addCriterion("product_hass_selled in", values, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledNotIn(List<Integer> values) {
            addCriterion("product_hass_selled not in", values, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledBetween(Integer value1, Integer value2) {
            addCriterion("product_hass_selled between", value1, value2, "productHassSelled");
            return (Criteria) this;
        }

        public Criteria andProductHassSelledNotBetween(Integer value1, Integer value2) {
            addCriterion("product_hass_selled not between", value1, value2, "productHassSelled");
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
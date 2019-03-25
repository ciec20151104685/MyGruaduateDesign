package com.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderSeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderSeatExample() {
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

        public Criteria andStudentidIsNull() {
            addCriterion("StudentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("StudentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("StudentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("StudentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("StudentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StudentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("StudentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("StudentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("StudentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("StudentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("StudentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("StudentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNull() {
            addCriterion("seatId is null");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNotNull() {
            addCriterion("seatId is not null");
            return (Criteria) this;
        }

        public Criteria andSeatidEqualTo(Integer value) {
            addCriterion("seatId =", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotEqualTo(Integer value) {
            addCriterion("seatId <>", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThan(Integer value) {
            addCriterion("seatId >", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("seatId >=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThan(Integer value) {
            addCriterion("seatId <", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThanOrEqualTo(Integer value) {
            addCriterion("seatId <=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidIn(List<Integer> values) {
            addCriterion("seatId in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotIn(List<Integer> values) {
            addCriterion("seatId not in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidBetween(Integer value1, Integer value2) {
            addCriterion("seatId between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotBetween(Integer value1, Integer value2) {
            addCriterion("seatId not between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andOrderdataIsNull() {
            addCriterion("Orderdata is null");
            return (Criteria) this;
        }

        public Criteria andOrderdataIsNotNull() {
            addCriterion("Orderdata is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdataEqualTo(Date value) {
            addCriterion("Orderdata =", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataNotEqualTo(Date value) {
            addCriterion("Orderdata <>", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataGreaterThan(Date value) {
            addCriterion("Orderdata >", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataGreaterThanOrEqualTo(Date value) {
            addCriterion("Orderdata >=", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataLessThan(Date value) {
            addCriterion("Orderdata <", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataLessThanOrEqualTo(Date value) {
            addCriterion("Orderdata <=", value, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataIn(List<Date> values) {
            addCriterion("Orderdata in", values, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataNotIn(List<Date> values) {
            addCriterion("Orderdata not in", values, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataBetween(Date value1, Date value2) {
            addCriterion("Orderdata between", value1, value2, "orderdata");
            return (Criteria) this;
        }

        public Criteria andOrderdataNotBetween(Date value1, Date value2) {
            addCriterion("Orderdata not between", value1, value2, "orderdata");
            return (Criteria) this;
        }

        public Criteria andDelatedataIsNull() {
            addCriterion("DelateData is null");
            return (Criteria) this;
        }

        public Criteria andDelatedataIsNotNull() {
            addCriterion("DelateData is not null");
            return (Criteria) this;
        }

        public Criteria andDelatedataEqualTo(Date value) {
            addCriterion("DelateData =", value, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataNotEqualTo(Date value) {
            addCriterion("DelateData <>", value, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataGreaterThan(Date value) {
            addCriterion("DelateData >", value, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataGreaterThanOrEqualTo(Date value) {
            addCriterion("DelateData >=", value, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataLessThan(Date value) {
            addCriterion("DelateData <", value, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataLessThanOrEqualTo(Date value) {
            addCriterion("DelateData <=", value, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataIn(List<Date> values) {
            addCriterion("DelateData in", values, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataNotIn(List<Date> values) {
            addCriterion("DelateData not in", values, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataBetween(Date value1, Date value2) {
            addCriterion("DelateData between", value1, value2, "delatedata");
            return (Criteria) this;
        }

        public Criteria andDelatedataNotBetween(Date value1, Date value2) {
            addCriterion("DelateData not between", value1, value2, "delatedata");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNull() {
            addCriterion("Savetime is null");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNotNull() {
            addCriterion("Savetime is not null");
            return (Criteria) this;
        }

        public Criteria andSavetimeEqualTo(Integer value) {
            addCriterion("Savetime =", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotEqualTo(Integer value) {
            addCriterion("Savetime <>", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThan(Integer value) {
            addCriterion("Savetime >", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Savetime >=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThan(Integer value) {
            addCriterion("Savetime <", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThanOrEqualTo(Integer value) {
            addCriterion("Savetime <=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeIn(List<Integer> values) {
            addCriterion("Savetime in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotIn(List<Integer> values) {
            addCriterion("Savetime not in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeBetween(Integer value1, Integer value2) {
            addCriterion("Savetime between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("Savetime not between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andOutorderIsNull() {
            addCriterion("OutOrder is null");
            return (Criteria) this;
        }

        public Criteria andOutorderIsNotNull() {
            addCriterion("OutOrder is not null");
            return (Criteria) this;
        }

        public Criteria andOutorderEqualTo(Integer value) {
            addCriterion("OutOrder =", value, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderNotEqualTo(Integer value) {
            addCriterion("OutOrder <>", value, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderGreaterThan(Integer value) {
            addCriterion("OutOrder >", value, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("OutOrder >=", value, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderLessThan(Integer value) {
            addCriterion("OutOrder <", value, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderLessThanOrEqualTo(Integer value) {
            addCriterion("OutOrder <=", value, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderIn(List<Integer> values) {
            addCriterion("OutOrder in", values, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderNotIn(List<Integer> values) {
            addCriterion("OutOrder not in", values, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderBetween(Integer value1, Integer value2) {
            addCriterion("OutOrder between", value1, value2, "outorder");
            return (Criteria) this;
        }

        public Criteria andOutorderNotBetween(Integer value1, Integer value2) {
            addCriterion("OutOrder not between", value1, value2, "outorder");
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
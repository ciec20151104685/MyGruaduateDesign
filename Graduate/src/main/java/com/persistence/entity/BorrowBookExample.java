package com.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowBookExample() {
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

        public Criteria andBookidIsNull() {
            addCriterion("bookId is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookId =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookId <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookId >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookId >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookId <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookId <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookId in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookId not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookId between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookId not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBorrowdataIsNull() {
            addCriterion("Borrowdata is null");
            return (Criteria) this;
        }

        public Criteria andBorrowdataIsNotNull() {
            addCriterion("Borrowdata is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowdataEqualTo(Date value) {
            addCriterion("Borrowdata =", value, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataNotEqualTo(Date value) {
            addCriterion("Borrowdata <>", value, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataGreaterThan(Date value) {
            addCriterion("Borrowdata >", value, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataGreaterThanOrEqualTo(Date value) {
            addCriterion("Borrowdata >=", value, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataLessThan(Date value) {
            addCriterion("Borrowdata <", value, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataLessThanOrEqualTo(Date value) {
            addCriterion("Borrowdata <=", value, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataIn(List<Date> values) {
            addCriterion("Borrowdata in", values, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataNotIn(List<Date> values) {
            addCriterion("Borrowdata not in", values, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataBetween(Date value1, Date value2) {
            addCriterion("Borrowdata between", value1, value2, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andBorrowdataNotBetween(Date value1, Date value2) {
            addCriterion("Borrowdata not between", value1, value2, "borrowdata");
            return (Criteria) this;
        }

        public Criteria andReturndataIsNull() {
            addCriterion("Returndata is null");
            return (Criteria) this;
        }

        public Criteria andReturndataIsNotNull() {
            addCriterion("Returndata is not null");
            return (Criteria) this;
        }

        public Criteria andReturndataEqualTo(Date value) {
            addCriterion("Returndata =", value, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataNotEqualTo(Date value) {
            addCriterion("Returndata <>", value, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataGreaterThan(Date value) {
            addCriterion("Returndata >", value, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataGreaterThanOrEqualTo(Date value) {
            addCriterion("Returndata >=", value, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataLessThan(Date value) {
            addCriterion("Returndata <", value, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataLessThanOrEqualTo(Date value) {
            addCriterion("Returndata <=", value, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataIn(List<Date> values) {
            addCriterion("Returndata in", values, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataNotIn(List<Date> values) {
            addCriterion("Returndata not in", values, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataBetween(Date value1, Date value2) {
            addCriterion("Returndata between", value1, value2, "returndata");
            return (Criteria) this;
        }

        public Criteria andReturndataNotBetween(Date value1, Date value2) {
            addCriterion("Returndata not between", value1, value2, "returndata");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeIsNull() {
            addCriterion("ExceptreturnTime is null");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeIsNotNull() {
            addCriterion("ExceptreturnTime is not null");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeEqualTo(Date value) {
            addCriterion("ExceptreturnTime =", value, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeNotEqualTo(Date value) {
            addCriterion("ExceptreturnTime <>", value, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeGreaterThan(Date value) {
            addCriterion("ExceptreturnTime >", value, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ExceptreturnTime >=", value, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeLessThan(Date value) {
            addCriterion("ExceptreturnTime <", value, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeLessThanOrEqualTo(Date value) {
            addCriterion("ExceptreturnTime <=", value, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeIn(List<Date> values) {
            addCriterion("ExceptreturnTime in", values, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeNotIn(List<Date> values) {
            addCriterion("ExceptreturnTime not in", values, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeBetween(Date value1, Date value2) {
            addCriterion("ExceptreturnTime between", value1, value2, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andExceptreturntimeNotBetween(Date value1, Date value2) {
            addCriterion("ExceptreturnTime not between", value1, value2, "exceptreturntime");
            return (Criteria) this;
        }

        public Criteria andOverdataIsNull() {
            addCriterion("Overdata is null");
            return (Criteria) this;
        }

        public Criteria andOverdataIsNotNull() {
            addCriterion("Overdata is not null");
            return (Criteria) this;
        }

        public Criteria andOverdataEqualTo(Integer value) {
            addCriterion("Overdata =", value, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataNotEqualTo(Integer value) {
            addCriterion("Overdata <>", value, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataGreaterThan(Integer value) {
            addCriterion("Overdata >", value, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataGreaterThanOrEqualTo(Integer value) {
            addCriterion("Overdata >=", value, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataLessThan(Integer value) {
            addCriterion("Overdata <", value, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataLessThanOrEqualTo(Integer value) {
            addCriterion("Overdata <=", value, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataIn(List<Integer> values) {
            addCriterion("Overdata in", values, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataNotIn(List<Integer> values) {
            addCriterion("Overdata not in", values, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataBetween(Integer value1, Integer value2) {
            addCriterion("Overdata between", value1, value2, "overdata");
            return (Criteria) this;
        }

        public Criteria andOverdataNotBetween(Integer value1, Integer value2) {
            addCriterion("Overdata not between", value1, value2, "overdata");
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
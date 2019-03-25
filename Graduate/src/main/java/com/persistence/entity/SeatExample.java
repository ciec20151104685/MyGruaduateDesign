package com.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class SeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeatExample() {
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

        public Criteria andSeatidIsNull() {
            addCriterion("SeatId is null");
            return (Criteria) this;
        }

        public Criteria andSeatidIsNotNull() {
            addCriterion("SeatId is not null");
            return (Criteria) this;
        }

        public Criteria andSeatidEqualTo(Integer value) {
            addCriterion("SeatId =", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotEqualTo(Integer value) {
            addCriterion("SeatId <>", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThan(Integer value) {
            addCriterion("SeatId >", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SeatId >=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThan(Integer value) {
            addCriterion("SeatId <", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidLessThanOrEqualTo(Integer value) {
            addCriterion("SeatId <=", value, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidIn(List<Integer> values) {
            addCriterion("SeatId in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotIn(List<Integer> values) {
            addCriterion("SeatId not in", values, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidBetween(Integer value1, Integer value2) {
            addCriterion("SeatId between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andSeatidNotBetween(Integer value1, Integer value2) {
            addCriterion("SeatId not between", value1, value2, "seatid");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNull() {
            addCriterion("identify is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNotNull() {
            addCriterion("identify is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyEqualTo(Integer value) {
            addCriterion("identify =", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotEqualTo(Integer value) {
            addCriterion("identify <>", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThan(Integer value) {
            addCriterion("identify >", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("identify >=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThan(Integer value) {
            addCriterion("identify <", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThanOrEqualTo(Integer value) {
            addCriterion("identify <=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyIn(List<Integer> values) {
            addCriterion("identify in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotIn(List<Integer> values) {
            addCriterion("identify not in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyBetween(Integer value1, Integer value2) {
            addCriterion("identify between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotBetween(Integer value1, Integer value2) {
            addCriterion("identify not between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSusernameIsNull() {
            addCriterion("Susername is null");
            return (Criteria) this;
        }

        public Criteria andSusernameIsNotNull() {
            addCriterion("Susername is not null");
            return (Criteria) this;
        }

        public Criteria andSusernameEqualTo(String value) {
            addCriterion("Susername =", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotEqualTo(String value) {
            addCriterion("Susername <>", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThan(String value) {
            addCriterion("Susername >", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameGreaterThanOrEqualTo(String value) {
            addCriterion("Susername >=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThan(String value) {
            addCriterion("Susername <", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLessThanOrEqualTo(String value) {
            addCriterion("Susername <=", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameLike(String value) {
            addCriterion("Susername like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotLike(String value) {
            addCriterion("Susername not like", value, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameIn(List<String> values) {
            addCriterion("Susername in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotIn(List<String> values) {
            addCriterion("Susername not in", values, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameBetween(String value1, String value2) {
            addCriterion("Susername between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andSusernameNotBetween(String value1, String value2) {
            addCriterion("Susername not between", value1, value2, "susername");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("starttime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("starttime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andFreetimeIsNull() {
            addCriterion("freetime is null");
            return (Criteria) this;
        }

        public Criteria andFreetimeIsNotNull() {
            addCriterion("freetime is not null");
            return (Criteria) this;
        }

        public Criteria andFreetimeEqualTo(Integer value) {
            addCriterion("freetime =", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeNotEqualTo(Integer value) {
            addCriterion("freetime <>", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeGreaterThan(Integer value) {
            addCriterion("freetime >", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freetime >=", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeLessThan(Integer value) {
            addCriterion("freetime <", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeLessThanOrEqualTo(Integer value) {
            addCriterion("freetime <=", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeIn(List<Integer> values) {
            addCriterion("freetime in", values, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeNotIn(List<Integer> values) {
            addCriterion("freetime not in", values, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeBetween(Integer value1, Integer value2) {
            addCriterion("freetime between", value1, value2, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("freetime not between", value1, value2, "freetime");
            return (Criteria) this;
        }

        public Criteria andSavetimesIsNull() {
            addCriterion("savetimes is null");
            return (Criteria) this;
        }

        public Criteria andSavetimesIsNotNull() {
            addCriterion("savetimes is not null");
            return (Criteria) this;
        }

        public Criteria andSavetimesEqualTo(Integer value) {
            addCriterion("savetimes =", value, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesNotEqualTo(Integer value) {
            addCriterion("savetimes <>", value, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesGreaterThan(Integer value) {
            addCriterion("savetimes >", value, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("savetimes >=", value, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesLessThan(Integer value) {
            addCriterion("savetimes <", value, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesLessThanOrEqualTo(Integer value) {
            addCriterion("savetimes <=", value, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesIn(List<Integer> values) {
            addCriterion("savetimes in", values, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesNotIn(List<Integer> values) {
            addCriterion("savetimes not in", values, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesBetween(Integer value1, Integer value2) {
            addCriterion("savetimes between", value1, value2, "savetimes");
            return (Criteria) this;
        }

        public Criteria andSavetimesNotBetween(Integer value1, Integer value2) {
            addCriterion("savetimes not between", value1, value2, "savetimes");
            return (Criteria) this;
        }

        public Criteria andAreaLikeInsensitive(String value) {
            addCriterion("upper(area) like", value.toUpperCase(), "area");
            return (Criteria) this;
        }

        public Criteria andSusernameLikeInsensitive(String value) {
            addCriterion("upper(Susername) like", value.toUpperCase(), "susername");
            return (Criteria) this;
        }

        public Criteria andStarttimeLikeInsensitive(String value) {
            addCriterion("upper(starttime) like", value.toUpperCase(), "starttime");
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
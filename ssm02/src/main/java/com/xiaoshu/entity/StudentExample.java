package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTbStudentIdIsNull() {
            addCriterion("tb_student_id is null");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdIsNotNull() {
            addCriterion("tb_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdEqualTo(Integer value) {
            addCriterion("tb_student_id =", value, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdNotEqualTo(Integer value) {
            addCriterion("tb_student_id <>", value, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdGreaterThan(Integer value) {
            addCriterion("tb_student_id >", value, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_student_id >=", value, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdLessThan(Integer value) {
            addCriterion("tb_student_id <", value, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("tb_student_id <=", value, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdIn(List<Integer> values) {
            addCriterion("tb_student_id in", values, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdNotIn(List<Integer> values) {
            addCriterion("tb_student_id not in", values, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("tb_student_id between", value1, value2, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_student_id not between", value1, value2, "tbStudentId");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameIsNull() {
            addCriterion("tb_student_name is null");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameIsNotNull() {
            addCriterion("tb_student_name is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameEqualTo(String value) {
            addCriterion("tb_student_name =", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameNotEqualTo(String value) {
            addCriterion("tb_student_name <>", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameGreaterThan(String value) {
            addCriterion("tb_student_name >", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("tb_student_name >=", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameLessThan(String value) {
            addCriterion("tb_student_name <", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameLessThanOrEqualTo(String value) {
            addCriterion("tb_student_name <=", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameLike(String value) {
            addCriterion("tb_student_name like", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameNotLike(String value) {
            addCriterion("tb_student_name not like", value, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameIn(List<String> values) {
            addCriterion("tb_student_name in", values, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameNotIn(List<String> values) {
            addCriterion("tb_student_name not in", values, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameBetween(String value1, String value2) {
            addCriterion("tb_student_name between", value1, value2, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentNameNotBetween(String value1, String value2) {
            addCriterion("tb_student_name not between", value1, value2, "tbStudentName");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexIsNull() {
            addCriterion("tb_student_sex is null");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexIsNotNull() {
            addCriterion("tb_student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexEqualTo(String value) {
            addCriterion("tb_student_sex =", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexNotEqualTo(String value) {
            addCriterion("tb_student_sex <>", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexGreaterThan(String value) {
            addCriterion("tb_student_sex >", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("tb_student_sex >=", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexLessThan(String value) {
            addCriterion("tb_student_sex <", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexLessThanOrEqualTo(String value) {
            addCriterion("tb_student_sex <=", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexLike(String value) {
            addCriterion("tb_student_sex like", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexNotLike(String value) {
            addCriterion("tb_student_sex not like", value, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexIn(List<String> values) {
            addCriterion("tb_student_sex in", values, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexNotIn(List<String> values) {
            addCriterion("tb_student_sex not in", values, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexBetween(String value1, String value2) {
            addCriterion("tb_student_sex between", value1, value2, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentSexNotBetween(String value1, String value2) {
            addCriterion("tb_student_sex not between", value1, value2, "tbStudentSex");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeIsNull() {
            addCriterion("tb_student_age is null");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeIsNotNull() {
            addCriterion("tb_student_age is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeEqualTo(Integer value) {
            addCriterion("tb_student_age =", value, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeNotEqualTo(Integer value) {
            addCriterion("tb_student_age <>", value, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeGreaterThan(Integer value) {
            addCriterion("tb_student_age >", value, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_student_age >=", value, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeLessThan(Integer value) {
            addCriterion("tb_student_age <", value, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeLessThanOrEqualTo(Integer value) {
            addCriterion("tb_student_age <=", value, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeIn(List<Integer> values) {
            addCriterion("tb_student_age in", values, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeNotIn(List<Integer> values) {
            addCriterion("tb_student_age not in", values, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeBetween(Integer value1, Integer value2) {
            addCriterion("tb_student_age between", value1, value2, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_student_age not between", value1, value2, "tbStudentAge");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgIsNull() {
            addCriterion("tb_student_img is null");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgIsNotNull() {
            addCriterion("tb_student_img is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgEqualTo(String value) {
            addCriterion("tb_student_img =", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgNotEqualTo(String value) {
            addCriterion("tb_student_img <>", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgGreaterThan(String value) {
            addCriterion("tb_student_img >", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgGreaterThanOrEqualTo(String value) {
            addCriterion("tb_student_img >=", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgLessThan(String value) {
            addCriterion("tb_student_img <", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgLessThanOrEqualTo(String value) {
            addCriterion("tb_student_img <=", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgLike(String value) {
            addCriterion("tb_student_img like", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgNotLike(String value) {
            addCriterion("tb_student_img not like", value, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgIn(List<String> values) {
            addCriterion("tb_student_img in", values, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgNotIn(List<String> values) {
            addCriterion("tb_student_img not in", values, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgBetween(String value1, String value2) {
            addCriterion("tb_student_img between", value1, value2, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentImgNotBetween(String value1, String value2) {
            addCriterion("tb_student_img not between", value1, value2, "tbStudentImg");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayIsNull() {
            addCriterion("tb_student_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayIsNotNull() {
            addCriterion("tb_student_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("tb_student_birthday =", value, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("tb_student_birthday <>", value, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("tb_student_birthday >", value, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tb_student_birthday >=", value, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("tb_student_birthday <", value, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tb_student_birthday <=", value, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("tb_student_birthday in", values, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("tb_student_birthday not in", values, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tb_student_birthday between", value1, value2, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tb_student_birthday not between", value1, value2, "tbStudentBirthday");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidIsNull() {
            addCriterion("tb_student_tid is null");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidIsNotNull() {
            addCriterion("tb_student_tid is not null");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidEqualTo(Integer value) {
            addCriterion("tb_student_tid =", value, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidNotEqualTo(Integer value) {
            addCriterion("tb_student_tid <>", value, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidGreaterThan(Integer value) {
            addCriterion("tb_student_tid >", value, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_student_tid >=", value, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidLessThan(Integer value) {
            addCriterion("tb_student_tid <", value, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidLessThanOrEqualTo(Integer value) {
            addCriterion("tb_student_tid <=", value, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidIn(List<Integer> values) {
            addCriterion("tb_student_tid in", values, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidNotIn(List<Integer> values) {
            addCriterion("tb_student_tid not in", values, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidBetween(Integer value1, Integer value2) {
            addCriterion("tb_student_tid between", value1, value2, "tbStudentTid");
            return (Criteria) this;
        }

        public Criteria andTbStudentTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_student_tid not between", value1, value2, "tbStudentTid");
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
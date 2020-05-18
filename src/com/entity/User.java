package com.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * 用户信息
 */
public class User implements Serializable {
    @Chinese("姓名")
    private String name;
    @Chinese("等级")
    private String level;
    @Chinese("年龄组")
    private String ageGroup;
    @Chinese("职业组")
    private String jobGroup;
    @Chinese("兴趣分类")
    private String interest;
    @Chinese("邮箱")
    private String email;

    public User() {
    }

    public User(String name, String level, String ageGroup, String jobGroup, String interest, String email) {
        this.name = name;
        this.level = level;
        this.ageGroup = ageGroup;
        this.jobGroup = jobGroup;
        this.interest = interest;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(level, user.level) &&
                Objects.equals(ageGroup, user.ageGroup) &&
                Objects.equals(jobGroup, user.jobGroup) &&
                Objects.equals(interest, user.interest) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, ageGroup, jobGroup, interest, email);
    }

    @Override
    public String toString() {
        return name +"\t"+level+"\t"+ageGroup+"\t"+jobGroup+"\t"+interest+"\t"+email;
    }
}

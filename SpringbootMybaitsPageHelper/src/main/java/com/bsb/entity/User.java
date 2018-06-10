package com.bsb.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import java.util.Date;


@Data
@JsonSerialize
public class User {

    private Integer testId;
    private Integer tenantId;
    private String name;
    private Integer age;
    private Integer testType;
    private Date testDate;
    private Integer role;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "testId=" + testId +
                ", tenantId=" + tenantId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", testType=" + testType +
                ", testDate=" + testDate +
                ", role=" + role +
                ", phone='" + phone + '\'' +
                '}';
    }
}
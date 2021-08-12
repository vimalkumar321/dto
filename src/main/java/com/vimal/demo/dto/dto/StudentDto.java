package com.vimal.demo.dto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class StudentDto {
    @JsonProperty(access= JsonProperty.Access.READ_ONLY)
    private int id;
    private String name;
    private Date dob;
    private Long mobile;
    private String email;

    public StudentDto(){}

    public StudentDto(int id, String name, Date dob, Long mobile, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mobile = mobile;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

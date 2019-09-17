package com.leiming.course_evaluation.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//教师实体
@Entity


public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//设置id，生成策略
    private Long id;
    private String username;
    private String password;
    private String sex;
    private String teacherNumber;
    @Transient//禁止此字段对应数据库
    private String dptName;
    @ManyToOne//与院系实体多对一关系建立
    @JoinColumn(name = "department_id")
    @JsonBackReference//禁止此字段序列化，防止死循环
    private Department department;

    public Teacher(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(String teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Teacher(String username, String password, String sex, String teacherNumber, String dptName, Department department) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.teacherNumber = teacherNumber;
        this.dptName = dptName;
        this.department = department;
    }


}

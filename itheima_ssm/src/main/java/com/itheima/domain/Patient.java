package com.itheima.domain;

public class Patient {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer did;
    private String content;

    private Dept dept;

    public Patient(Integer id, String name, Integer gender,  Integer did, String content, Dept dept) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.did = did;
        this.content = content;
        this.dept = dept;
    }

    public Patient() {
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", did=" + did +
                ", content='" + content + '\'' +
                ", dept=" + dept +
                '}';
    }
}

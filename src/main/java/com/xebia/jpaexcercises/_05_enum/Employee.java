package com.xebia.jpaexcercises._05_enum;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private Long id;

    @Column(name = "full_name")
    private String name;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "long_bio")
    private String bio;

    @Basic(fetch = FetchType.LAZY)
    @Lob
    @Column(name = "pic")
    private byte[] picture;

    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
}

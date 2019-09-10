package com.xebia.jpaexcercises._01_access;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
public class EmployeeWithMixedAccess {
    @Id
    private long id;
    private String username;
    @Transient
    private String email;

    public void setEmailAddress(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Access(AccessType.PROPERTY)
    @Column(name = "email_address")
    public String getEmailAddress() {

        return this.email.replace("@gmail.com", "@xebia.com");
    }
}

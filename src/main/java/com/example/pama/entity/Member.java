package com.example.pama.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="MEMBER")
public class Member {
    @Id
    @Column(name="MEMBER_ID")
    private String id;

    @Column(name="NAME", nullable = false)
    private String username;

    //대소문자를 구분하지 않는 데이터베이스일 경우, 대소문자 구분없이 매핑.
    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


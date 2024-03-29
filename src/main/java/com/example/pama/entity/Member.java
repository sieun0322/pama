package com.example.pama.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name="MEMBER")
public class Member {
    @Id
    @Column(name="MEMBER_ID")
    private String id;

    private String password;
    @Column(name="NICKNAME", nullable = false)
    private String nickname;

    //대소문자를 구분하지 않는 데이터베이스일 경우, 대소문자 구분없이 매핑.
    private Integer age;

    private String email;

    @Enumerated(EnumType.STRING)
    private RoleType role;//USER,ADMIN

    private String provider;
    private String providerId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Builder
    public Member(String nickname, String password, String email, RoleType role, String provider, String providerId, Timestamp createDate) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.role = role;
        this.provider = provider;
        this.providerId = providerId;
        this.createdDate = createDate;
    }

}


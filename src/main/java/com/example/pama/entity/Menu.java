package com.example.pama.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name="MENU")
public class Menu {
    @Id
    @Column(name="MENU_ID")
    private String id;

    @Column(name="NAME", nullable = false)
    private String name;

    private String desc;

    private String storeId;

    private Boolean useYn;

    private Integer sort;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Builder
    public Menu(String name, String desc, String storeId, Boolean useYn, Integer sort, Timestamp createDate) {
        this.name = name;
        this.desc = desc;
        this.storeId = storeId;
        this.useYn = useYn;
        this.sort = sort;
        this.createdDate = createDate;
    }

}


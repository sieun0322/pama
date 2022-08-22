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
@Table(name="ITEM")
public class Item {
    @Id
    @Column(name="ITEM_ID")
    private String id;

    @Column(name="MENU_ID")
    private String menu_id;

    private String category;
    @Column(name="NAME", nullable = false)
    private String name;

    private String desc;

    private String unit;

    private Boolean useYn;

    private Integer price;
    private Integer sort;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Builder
    public Item(String menu_id,String category,String name, String desc,String unit, Integer price, Boolean useYn, Integer sort, Timestamp createDate) {

        this.menu_id = menu_id;
        this.category = category;
        this.name = name;
        this.desc = desc;
        this.unit = unit;
        this.price = price;
        this.useYn = useYn;
        this.sort = sort;
        this.createdDate = createDate;
    }

}


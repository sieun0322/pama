package com.example.pama.entity.inheritance;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name="ITEM_ID")
    private Long id;
    private String name;
    private int price;

}

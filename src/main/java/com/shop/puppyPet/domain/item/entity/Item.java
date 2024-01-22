package com.shop.puppyPet.domain.item.entity;

import com.shop.puppyPet.domain.base.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Item extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long item_key;

    private String item_nm;

    private int item_price;

    private SatutsENUM item_status;

    private int item_quantity;

    private String description;

    private int view_count;

    private ColorENUM item_color_type;

}

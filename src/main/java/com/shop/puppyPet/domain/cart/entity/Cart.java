package com.shop.puppyPet.domain.cart.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cart_id;

    @Column(nullable = false)
    private int total_quantity;

    @Column(nullable = false, name="item_nm")
    private int cart_item_nm;

    @Column(nullable = false, name="item_color")
    private String cart_item_color;

    @Column(nullable = false, name="item_price")
    private int cart_item_price;

    @Column(nullable = false, name="item_quantity")
    private int cart_item_quantity;


}

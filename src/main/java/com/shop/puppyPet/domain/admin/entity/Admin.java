package com.shop.puppyPet.domain.admin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "admin")
@Entity
@Getter
@Setter
@ToString
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminKey;

    @Column(nullable = false)
    private String admin_id;

    @Column(nullable = false)
    private String admin_pw;

    @Column(nullable = false)
    private String admin_nm;

}

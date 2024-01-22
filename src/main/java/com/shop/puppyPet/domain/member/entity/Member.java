package com.shop.puppyPet.domain.member.entity;


import com.shop.puppyPet.domain.base.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Builder
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberKey;

    @Column(nullable = false)
    private String mem_nm;

    @Column(nullable = false)
    private String mem_email;

    @Column(nullable = false)
    private String mem_id;

    @Column(nullable = false)
    private String mem_password;

    @Column(nullable = false)
    private String mem_address;

    @Column(nullable = false)
    private String mem_phone;

    @Enumerated(EnumType.STRING)
    private GradeENUM mem_grade;

    @CreationTimestamp
    private LocalDateTime createAt;

    @CreatedDate
    private LocalDateTime loginDate;



}

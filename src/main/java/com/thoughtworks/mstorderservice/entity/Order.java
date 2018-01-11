package com.thoughtworks.mstorderservice.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_detail")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "address")
    private String goodsId;

    @Column(name = "good_name")
    private String goodsName;

    @Column(name = "good_price")
    private Long goodsPrice;
}
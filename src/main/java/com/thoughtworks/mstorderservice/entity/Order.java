package com.thoughtworks.mstorderservice.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mst_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private String status;
}
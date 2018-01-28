package com.thoughtworks.mstorderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class GoodsDto {
    private String id;
    private String name;
    private Double price;
    private int quantity;
}

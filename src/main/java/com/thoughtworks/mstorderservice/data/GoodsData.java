package com.thoughtworks.mstorderservice.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GoodsData {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private Long stockCount;
}

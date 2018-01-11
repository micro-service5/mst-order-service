package com.thoughtworks.mstorderservice.data;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GoodsData {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private Long stockCount;
}

package com.thoughtworks.mstorderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@AllArgsConstructor
public class OrderCreation {
    private List<GoodsDto> goods;
}

package com.thoughtworks.mstorderservice.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.mstorderservice.entity.ShoppingCartItem;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShoppingCartItemDto {
    private Long userId;
    private Long goodsId;
    private Long count;

    public static ShoppingCartItemDto from(ShoppingCartItem shoppingCartItem) {
        return new ObjectMapper().convertValue(shoppingCartItem, ShoppingCartItemDto.class);
    }
}

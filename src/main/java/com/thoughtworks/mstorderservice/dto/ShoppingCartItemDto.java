package com.thoughtworks.mstorderservice.dto;

import com.thoughtworks.mstorderservice.entity.ShoppingCartItem;
import com.thoughtworks.mstorderservice.util.EntityMapper;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartItemDto {
    private Long userId;
    private Long goodsId;
    private Long count;

    public static ShoppingCartItemDto from(ShoppingCartItem shoppingCartItem) {
        ShoppingCartItemDto shoppingCartItemDto = EntityMapper.map(shoppingCartItem, ShoppingCartItemDto.class);
        shoppingCartItemDto.setCount(shoppingCartItem.getGoodsCount());
        return shoppingCartItemDto;
    }
}

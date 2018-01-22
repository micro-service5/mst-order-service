package com.thoughtworks.mstorderservice.controller;

import com.thoughtworks.mstorderservice.data.GoodsData;
import com.thoughtworks.mstorderservice.dto.ShoppingCartItemDto;
import com.thoughtworks.mstorderservice.entity.ShoppingCartItem;
import com.thoughtworks.mstorderservice.service.ShoppingCartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    private ShoppingCartService shoppingCartService;

    ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping
    public List<ShoppingCartItemDto> getAll(@RequestParam(required = false) Long userId) {
        return shoppingCartService.getAll(userId)
                .stream()
                .map(ShoppingCartItemDto::from)
                .collect(Collectors.toList());
    }

    @PostMapping
    public ShoppingCartItemDto save(
            @RequestParam Long userId,
            @RequestParam Long goodsId,
            @RequestParam Long goodsCount) {
        return ShoppingCartItemDto.from(
                shoppingCartService.addGoods(
                        ShoppingCartItem.builder()
                                .userId(userId)
                                .goodsId(goodsId)
                                .goodsCount(goodsCount)
                                .build()));
    }

    @GetMapping("/user-names")
    List<String> getNamesFromUser() {
        return shoppingCartService.getNames();
    }
}

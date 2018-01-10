package com.thoughtworks.mstorderservice.controller;

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

    @GetMapping("/index")
    public String hello() {
        return shoppingCartService.hello();
    }

    @GetMapping("/all")
    public List<ShoppingCartItemDto> getAll(
            @RequestParam(value = "userId", defaultValue = "1", required = false) Long userId) {
        return shoppingCartService.getAll(userId)
                .stream()
                .map(ShoppingCartItemDto::from)
                .collect(Collectors.toList());
    }

    @PostMapping
    public void save(@RequestBody ShoppingCartItem shoppingCartItem) {
        shoppingCartService.addGoods(shoppingCartItem);
    }
}

package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.Repository.ShoppingCartItemRepository;
import com.thoughtworks.mstorderservice.entity.ShoppingCartItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    private ShoppingCartItemRepository shoppingCartItemRepository;

    ShoppingCartService(ShoppingCartItemRepository shoppingCartItemRepository) {
        this.shoppingCartItemRepository = shoppingCartItemRepository;
    }

    public List<ShoppingCartItem> getAll(Long userId) {
        return shoppingCartItemRepository.findAll();
    }

    public ShoppingCartItem addGoods(ShoppingCartItem shoppingCartItem) {
        return shoppingCartItemRepository.save(shoppingCartItem);
    }

    public String hello() {
        return "hello, this is shopping cart service";
    }
}

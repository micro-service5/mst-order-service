package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.Repository.ShoppingCartItemRepository;
import com.thoughtworks.mstorderservice.entity.ShoppingCartItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingCartService {

    private ShoppingCartItemRepository shoppingCartItemRepository;

    ShoppingCartService(ShoppingCartItemRepository shoppingCartItemRepository) {
        this.shoppingCartItemRepository = shoppingCartItemRepository;
    }

    public List<ShoppingCartItem> getAll(Long userId) {
        if (userId == null) {
            return shoppingCartItemRepository.findAll();
        } else {
            return shoppingCartItemRepository.findAllByUserId(userId);
        }
    }

    public ShoppingCartItem addGoods(ShoppingCartItem shoppingCartItem) {
        Optional<ShoppingCartItem> oldShoppingCartItem = shoppingCartItemRepository.findOneByUserIdAndGoodsId(
                shoppingCartItem.getUserId(),
                shoppingCartItem.getGoodsId());
        ShoppingCartItem shoppingCartItemToSave = oldShoppingCartItem.orElse(shoppingCartItem);
        shoppingCartItemToSave.setGoodsCount(shoppingCartItem.getGoodsCount());
        return shoppingCartItemRepository.save(shoppingCartItemToSave);
    }
}

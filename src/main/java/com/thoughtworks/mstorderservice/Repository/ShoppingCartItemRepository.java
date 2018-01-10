package com.thoughtworks.mstorderservice.Repository;

import com.thoughtworks.mstorderservice.entity.ShoppingCartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartItemRepository extends JpaRepository<ShoppingCartItem, Long> {
    List<ShoppingCartItem> findAllByUserId(Long userId);
}

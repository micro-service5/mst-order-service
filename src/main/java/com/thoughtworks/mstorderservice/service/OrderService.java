package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.Repository.OrderRepository;
import com.thoughtworks.mstorderservice.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrdersByUserId(Long userId) {
        return orderRepository.findAllByUserId(userId);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

}

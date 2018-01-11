package com.thoughtworks.mstorderservice.service;

import com.thoughtworks.mstorderservice.Repository.OrderRepository;
import com.thoughtworks.mstorderservice.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public String hello() {
        return "hello, i'm order service";
    }

    public List<Order> getAllDetail(Long orderId) {
        return orderRepository.findAllByOrderId(orderId);
    }

}

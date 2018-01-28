package com.thoughtworks.mstorderservice.controller;

import com.thoughtworks.mstorderservice.dto.OrderCreation;
import com.thoughtworks.mstorderservice.entity.Order;
import com.thoughtworks.mstorderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.POST;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrdersByUserId(@RequestParam Long userId) {
        return orderService.getAllOrdersByUserId(userId);
    }

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    @ResponseStatus(OK)
    public Order createOrder(OrderCreation order) {
        return orderService.createOrder(order);
    }

}

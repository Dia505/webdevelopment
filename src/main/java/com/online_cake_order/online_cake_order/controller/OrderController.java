package com.online_cake_order.online_cake_order.controller;

import com.online_cake_order.online_cake_order.dto.OrderDto;
import com.online_cake_order.online_cake_order.entity.Order;
import com.online_cake_order.online_cake_order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/save-order")
    public String createData(@RequestBody OrderDto orderDto) {
        orderService.saveOrder(orderDto);
        return "Data saved";
    }

    @GetMapping("/retrieve-all-order")
    public List<Order> getAllData() {
        return orderService.getAll();
    }

    @GetMapping("retrieve-order-by-id{orderId}")
    public Optional<Order> getById(@PathVariable("orderId") Integer orderId) {
        return orderService.getById(orderId);
    }

    @DeleteMapping("delete-order-by-id{orderId}")
    public void deleteById(@PathVariable("orderId") Integer orderId) {
        orderService.deleteById(orderId);
    }
}

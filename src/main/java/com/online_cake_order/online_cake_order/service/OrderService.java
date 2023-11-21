package com.online_cake_order.online_cake_order.service;

import com.online_cake_order.online_cake_order.dto.OrderDto;
import com.online_cake_order.online_cake_order.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    void saveOrder(OrderDto orderDto);
    List<Order> getAll();
    Optional<Order> getById(Integer order_id);
    void deleteById(Integer order_id);
}

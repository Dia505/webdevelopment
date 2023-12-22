package com.online_cake_order.online_cake_order.service.impl;
import com.online_cake_order.online_cake_order.dto.OrderDto;
import com.online_cake_order.online_cake_order.entity.Item;
import com.online_cake_order.online_cake_order.entity.Order;
import com.online_cake_order.online_cake_order.entity.User;
import com.online_cake_order.online_cake_order.repository.ItemRepository;
import com.online_cake_order.online_cake_order.repository.OrderRepository;
import com.online_cake_order.online_cake_order.repository.UserRepository;
import com.online_cake_order.online_cake_order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    private final ItemRepository itemRepository;

    @Override
    public void saveOrder(OrderDto orderDto) {
        Order order = new Order();

        User user = userRepository.findById(orderDto.getUser_id())
                .orElseThrow(()->new NoSuchElementException("No data found"));
        order.setUser(user);

        Item item = itemRepository.findById(orderDto.getItem_id())
                .orElseThrow(()->new NoSuchElementException("No data found"));
        order.setItem(item);

        order.setQuantity(orderDto.getQuantity());

        orderRepository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getById(Integer order_id) {
        return orderRepository.findById(order_id);
    }

    @Override
    public void deleteById(Integer order_id) {
        orderRepository.deleteById(order_id);
    }
}

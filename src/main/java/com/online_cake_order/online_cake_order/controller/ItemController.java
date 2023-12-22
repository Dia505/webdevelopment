package com.online_cake_order.online_cake_order.controller;

import com.online_cake_order.online_cake_order.dto.ItemDto;
import com.online_cake_order.online_cake_order.entity.Item;
import com.online_cake_order.online_cake_order.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping("/retrieve-item")
    public String getData() {
        return "data retrieved";
    }

    @PostMapping("/save-item")
    public String createData(@RequestBody ItemDto itemDto) {
        itemService.save(itemDto);
        return "Data saved";
    }

    @GetMapping("/retrieve-all-item")
    public List<Item> getAllData() {
        return itemService.getAll();
    }

    @GetMapping("/retrieve-item-by-id/{itemId}")
    public Optional<Item> getById(@PathVariable("itemId") Integer itemId) {
        return itemService.getById(itemId);
    }

    @DeleteMapping("/delete-item-by-id/{itemId}")
    public void deleteById(@PathVariable("itemId") Integer itemId) {
        itemService.deleteById(itemId);
    }
}

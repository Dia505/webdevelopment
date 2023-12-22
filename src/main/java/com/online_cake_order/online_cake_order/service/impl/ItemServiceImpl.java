package com.online_cake_order.online_cake_order.service.impl;
import com.online_cake_order.online_cake_order.dto.ItemDto;
import com.online_cake_order.online_cake_order.entity.Item;
import com.online_cake_order.online_cake_order.repository.ItemRepository;
import com.online_cake_order.online_cake_order.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Override
    public String save(ItemDto itemDto) {
        Item item = new Item();

        if(itemDto.getItemId()!=null) {
            item=itemRepository.findById(itemDto.getItemId())
                    .orElseThrow(()->new NullPointerException("data not found"));
        }

        item.setName(itemDto.getName());
        item.setImage(itemDto.getImage());
        item.setPrice(itemDto.getPrice());
        item.setQuantity(itemDto.getQuantity());
        item.setDescription(itemDto.getDescription());

        itemRepository.save(item);
        return "Data saved";
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getById(Integer itemId) {
        return itemRepository.findById(itemId);
    }

    @Override
    public void deleteById(Integer itemId) {
        itemRepository.deleteById(itemId);
    }
}

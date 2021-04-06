package com.example.dockerdemo.services;

import com.example.dockerdemo.entity.Item;
import com.example.dockerdemo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> findAllItems() {
        return itemRepository.findAll();

    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }


}

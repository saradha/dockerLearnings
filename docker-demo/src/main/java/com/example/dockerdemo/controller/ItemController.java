package com.example.dockerdemo.controller;

import com.example.dockerdemo.entity.Item;
import com.example.dockerdemo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        List<Item> itemLists = new ArrayList<>();
        return itemService.findAllItems();
    }


    @PostMapping("/items")
    public Item createItem() {
        LocalDateTime dateTime = LocalDateTime.now();
        Item item = new Item("item1" + dateTime, 100.0);
        return itemService.saveItem(item);
    }
}

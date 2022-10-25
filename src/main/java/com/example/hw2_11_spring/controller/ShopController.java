package com.example.hw2_11_spring.controller;

import com.example.hw2_11_spring.model.Product;
import com.example.hw2_11_spring.service.ShopServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {
    private final ShopServiceImpl shopService;

    public ShopController(ShopServiceImpl shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> idProducts) {
        shopService.add(idProducts);
    }

    @GetMapping("/get")
     public Collection<Product> get() {
        return shopService.get();
    }


}


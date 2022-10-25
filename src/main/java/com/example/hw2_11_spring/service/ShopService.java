package com.example.hw2_11_spring.service;

import com.example.hw2_11_spring.model.Product;

import java.util.Collection;
import java.util.List;

 public interface ShopService {


    Collection<Product> get();

    void add(List<Integer> ids);
}

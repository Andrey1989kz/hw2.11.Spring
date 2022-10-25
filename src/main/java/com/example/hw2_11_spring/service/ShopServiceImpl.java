package com.example.hw2_11_spring.service;

import com.example.hw2_11_spring.component.Basket;
import com.example.hw2_11_spring.model.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ShopServiceImpl implements ShopService {

    private Basket basket;

    private final Map<Integer, Product> products = Map.of(
            1, new Product(1, "Шины", 5000),
            2, new Product(2, "Диски", 10_000),
            3, new Product(3, "Дворники", 500),
            4, new Product(4, "Домкрат", 7500),
            5, new Product(5, "Аптечка", 250),
            6, new Product(6, "Огнетушитель", 450),
            7, new Product(7, "Аромотизатор", 100)
    );
@Override
    public Collection<Product> get() {
        return basket.get();
    }
@Override
    public void add(List<Integer> idProducts) {
        basket.add(
                idProducts.stream()
                        .map(products::get)
                        .collect(Collectors.toList())
        );

    }
}



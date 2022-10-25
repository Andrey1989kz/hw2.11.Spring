package com.example.hw2_11_spring.model;

public class Product {
        private final int idProduct;
        private final String product;
        private final double price;

         public Product(int idProduct, String product, double price) {
            this.idProduct = idProduct;
            this.product = product;
            this.price = price;
        }

        public int getIdProduct() {
            return idProduct;
        }

        public String getProduct() {
            return product;
        }

        public double getPrice() {
            return price;
        }
    }



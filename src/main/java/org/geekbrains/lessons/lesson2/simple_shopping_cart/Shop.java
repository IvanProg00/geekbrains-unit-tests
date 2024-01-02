package org.geekbrains.lessons.lesson2.simple_shopping_cart;

import java.util.List;

public class Shop {
    private final List<Product> productsShop;

    public Shop(List<Product> productsShop) {
        this.productsShop = productsShop;
    }

    public List<Product> getProductsShop() {
        return productsShop;
    }
}
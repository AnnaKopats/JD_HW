package com.academy.kopats.lesson20;

import java.util.*;

public class Basket {
    private ArrayList<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }
    public void add(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}

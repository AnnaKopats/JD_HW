package com.academy.kopats.lesson20;

import java.util.ArrayList;

public class ProductCategory {
    private String name;
    private ArrayList<Product> productsCategory;

    public ProductCategory(String name) {
        this.name = name;
        this.productsCategory = new ArrayList<>();
    }

    public boolean add(Product product){
        productsCategory.add(product);
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProductsCategory() {
        return productsCategory;
    }

    public void setProductsCategory(ArrayList<Product> productsCategory) {
        this.productsCategory = productsCategory;
    }
}

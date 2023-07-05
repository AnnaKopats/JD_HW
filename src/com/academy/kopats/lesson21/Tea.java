package com.academy.kopats.lesson21;

public class Tea implements Drinks{
    @Override
    public void prepare() {
        System.out.println("Готовится чай");
    }
}

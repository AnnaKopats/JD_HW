package com.academy.kopats.lesson21;

public class Coffee implements Drinks{
    @Override
    public void prepare() {
        System.out.println("Готовится кофе");
    }
}

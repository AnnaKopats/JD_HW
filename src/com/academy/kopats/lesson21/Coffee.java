package com.academy.kopats.lesson21;

public class Coffee implements Drinks{
    public Coffee() {
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Готовится кофе");

    }
}

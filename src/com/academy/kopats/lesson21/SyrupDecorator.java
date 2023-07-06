package com.academy.kopats.lesson21;

public class SyrupDecorator extends Decorator{
    public SyrupDecorator() {
    }


    @Override
    public void addIngredients() {
        System.out.println("Добавлен сироп");
    }
}

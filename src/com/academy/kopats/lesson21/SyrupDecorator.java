package com.academy.kopats.lesson21;

public class SyrupDecorator extends Decorator{
    public SyrupDecorator(Drinks drinks) {
        super(drinks);
    }


    @Override
    public void addIngredients() {
        System.out.println("Добавлен сироп");
    }
}

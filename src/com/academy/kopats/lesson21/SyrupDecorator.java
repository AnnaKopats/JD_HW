package com.academy.kopats.lesson21;

public class SyrupDecorator extends Decorator{
    public SyrupDecorator(Drinks drinks) {
        super(drinks);
        addIngredients();
    }


    @Override
    public void addIngredients() {
        System.out.println("Добавлен сироп");
    }
}

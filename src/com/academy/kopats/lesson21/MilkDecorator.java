package com.academy.kopats.lesson21;

public class MilkDecorator extends Decorator {

    public MilkDecorator(Drinks drinks) {
        super(drinks);
        addIngredients();
    }

    @Override
    public void addIngredients() {
        System.out.println("Добавлено молоко");
    }
}

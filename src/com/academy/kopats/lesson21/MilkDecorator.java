package com.academy.kopats.lesson21;

public class MilkDecorator extends Decorator {

    public MilkDecorator(Drinks drinks) {
        super(drinks);
    }

    @Override
    public void addIngredients() {
        System.out.println("Добавлено молоко");
    }
}

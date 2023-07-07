package com.academy.kopats.lesson21;

public class SugarDecorator extends Decorator {

    public SugarDecorator(Drinks drinks) {
        super(drinks);
addIngredients();
    }

    @Override
    public void addIngredients() {
        System.out.println("Добавлен сахар");
    }
}

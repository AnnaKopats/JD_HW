package com.academy.kopats.lesson21;

public class SugarDecorator extends Decorator {

    public SugarDecorator(Drinks drinks) {
        super(drinks);

    }

    @Override
    public void addIngredients() {
        System.out.println("Добавлен сахар");
    }
}

package com.academy.kopats.lesson21;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Drinks component) {
        super(component);
    }

    @Override
    public void addIngredients() {
        System.out.println(" с молоком");
    }
}

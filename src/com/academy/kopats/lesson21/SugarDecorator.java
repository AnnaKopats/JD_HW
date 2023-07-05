package com.academy.kopats.lesson21;

public class SugarDecorator extends Decorator{
    public SugarDecorator(Drinks component) {
        super(component);
    }

    @Override
    public void addIngredients() {
        System.out.println(" с сахаром");
    }
}

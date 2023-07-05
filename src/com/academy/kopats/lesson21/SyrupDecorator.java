package com.academy.kopats.lesson21;

public class SyrupDecorator extends Decorator{
    public SyrupDecorator(Drinks component) {
        super(component);
    }

    @Override
    public void addIngredients() {
        System.out.println(" с сиропом");
    }
}

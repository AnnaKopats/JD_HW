package com.academy.kopats.lesson21;

abstract class Decorator implements Drinks{
    private Drinks component;

    public Decorator() {
    }
    public abstract void addIngredients();

    @Override
    public void prepare() {
        component.prepare();
        addIngredients();
    }
}

package com.academy.kopats.lesson21;

abstract class Decorator implements Drinks{
    private Drinks component;

    public Decorator(Drinks component) {
        this.component = component;
    }
    public abstract void addIngredients();

    @Override
    public void prepare() {
        component.prepare();
        addIngredients();
    }
}

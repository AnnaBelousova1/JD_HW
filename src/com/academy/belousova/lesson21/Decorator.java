package com.academy.belousova.lesson21;

public abstract class Decorator implements Drink{
    private Drink component;

    public Decorator(Drink component) {
        this.component = component;
    }
    public abstract void afterMake();

    @Override
    public void make() {
        component.make();
        afterMake();
    }
}

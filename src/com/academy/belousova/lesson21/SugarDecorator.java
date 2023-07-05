package com.academy.belousova.lesson21;

public class SugarDecorator extends Decorator{
    public SugarDecorator(Drink component) {
        super(component);
    }

    @Override
    public void afterMake() {
        System.out.println("Добавляется сахар");
    }
}

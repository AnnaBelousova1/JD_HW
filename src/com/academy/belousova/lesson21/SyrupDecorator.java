package com.academy.belousova.lesson21;

public class SyrupDecorator extends Decorator{
    public SyrupDecorator(Drink component) {
        super(component);
    }

    @Override
    public void afterMake() {
        System.out.println("Добавляется сироп");
    }
}

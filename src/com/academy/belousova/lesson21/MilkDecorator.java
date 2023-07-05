package com.academy.belousova.lesson21;

public class MilkDecorator extends Decorator{
    public MilkDecorator(Drink component) {
        super(component);
    }

    @Override
    public void afterMake() {
        System.out.println("Добавляется молоко");
    }
}

package com.academy.belousova.lesson6.hierarchy;

public abstract class Warship implements Ship {
    private String name;

    public Warship(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("Я хожу в море!");
    }

    public abstract void shoot();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

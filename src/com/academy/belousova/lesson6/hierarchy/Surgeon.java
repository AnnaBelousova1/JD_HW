package com.academy.belousova.lesson6.hierarchy;

public abstract class Surgeon implements Doctor {
    private String name;

    public Surgeon(String name) {
        this.name = name;
    }

    @Override
    public void heal() {
        System.out.println("Я лечу и оперирую!");
    }

    public abstract void operate();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

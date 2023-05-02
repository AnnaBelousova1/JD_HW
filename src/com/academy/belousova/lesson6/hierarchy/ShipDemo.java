package com.academy.belousova.lesson6.hierarchy;

public class ShipDemo {
    public static void main(String[] args) {
        Aerocarrier aerocarrier = new Aerocarrier("Горшков");
        System.out.println("Мое имя: " + aerocarrier.getName());

        aerocarrier.walk();
        aerocarrier.shoot();
        aerocarrier.base();

    }
}

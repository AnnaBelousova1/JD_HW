package com.academy.belousova.lesson6.hierarchy;

public class Neurosurgeon extends Surgeon {

    public Neurosurgeon(String name) {
        super(name);
     }

    @Override
    public void operate() {
        System.out.println("Я узкий специалист - нейрохирург!");

    }
}



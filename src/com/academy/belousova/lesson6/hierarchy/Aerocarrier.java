package com.academy.belousova.lesson6.hierarchy;

public class Aerocarrier extends Warship {
    public Aerocarrier(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("Я умею стрелять!");

    }
    public void base(){
        System.out.println("Я являюсь базой в море для самолетов!");
    }
}

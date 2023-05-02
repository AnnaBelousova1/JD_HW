package com.academy.belousova.lesson6.hierarchy;

public class DoctorDemo {
    public static void main(String[] args) {
        Neurosurgeon neurosurgeon = new Neurosurgeon("Tad");
        System.out.println("Меня зовут " + neurosurgeon.getName());

        neurosurgeon.heal();
        neurosurgeon.operate();

    }
}

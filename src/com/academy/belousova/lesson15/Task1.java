package com.academy.belousova.lesson15;

public class Task1 {
    public static void main(String[] args) {
        Printer printer1 = new Printer("Текст 1");
        Printer printer2 = new Printer("Текст 2");
        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);
        thread1.start();
        thread2.start();
    }
}

package com.academy.belousova.lesson16;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 4; i++) {
            new Counter("Поток " + i);
        }
        Counter.sleep();
    }
}

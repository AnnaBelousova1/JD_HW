package com.academy.belousova.lesson15;

public class Incrementer extends Thread {
    @Override
    public void run() {
        int i;
        for (i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            Task3.value++;
        }
    }
}

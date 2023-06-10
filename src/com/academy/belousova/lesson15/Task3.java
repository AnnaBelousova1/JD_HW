package com.academy.belousova.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static Integer value = 0;

    public static void main(String[] args) throws InterruptedException {
        List<Incrementer> list = new ArrayList<>();
        int i;

        for (i = 0; i < 1000; i++) {

            if (i % 10 == 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Exception!Exception!Exception!Exception!");
            }

            Incrementer incrementer = new Incrementer();
            incrementer.start();
            list.add(incrementer);
        }

        for (Incrementer incrementer : list) {
            incrementer.join();
        }

        System.out.println(value);
    }
}


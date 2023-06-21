package com.academy.belousova.lesson17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task4 {
    public static final int BUYERS_TO_SERVE = 200;

    public static void main(String[] args) {

        ExecutorService executor = null;
        try {
            executor = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 2; i++) {
                executor.execute(new Cashier("Cashier №" + i));
            }

            System.out.println("Магазин открылся!");
            for (int i = 0; i < BUYERS_TO_SERVE; i++) {
                Buyer buyer = new Buyer(i);
                QueueContainer.addBuyer(buyer);
            }
            
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Все задачи выполнены");
    }
}

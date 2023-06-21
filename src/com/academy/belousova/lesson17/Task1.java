package com.academy.belousova.lesson17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {

        ExecutorService executor = null;
        try {
            executor = Executors.newFixedThreadPool(2);

            executor.execute(new Counter("1"));
            executor.execute(new Counter("2"));
            executor.execute(new Counter("3"));
            executor.execute(new Counter("4"));
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

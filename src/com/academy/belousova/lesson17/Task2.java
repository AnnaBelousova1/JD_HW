package com.academy.belousova.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        ExecutorService executor = null;
        try {
            executor = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 2; i++) {
                executor.execute(new SafeQueue<>(8));
            }

            for (int i = 0; i < 2; i++) {
                for (String s : list) {
                    SafeQueue.enqueue(s);
                }
            }

            for (int i = 0; i < 4; i++) {
                SafeQueue.dequeue();
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


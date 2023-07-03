package com.academy.belousova.lesson17;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import static java.lang.Thread.sleep;

public class Task3 {
    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(100);

        BankAccount bankAccount = new BankAccount(integer);

        ExecutorService executor = null;

        try {
          executor = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 2; i++) {
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 200; i++) {
                            bankAccount.deposit(100);
                        }
                    }
                });
                executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 100; i++) {
                            bankAccount.withdraw(200);
                        }
                        try {
                            sleep(200);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
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
        System.out.println("__________________________________");
        System.out.println("Конечный баланс: " + bankAccount);
    }
}
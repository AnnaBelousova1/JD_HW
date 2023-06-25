package com.academy.belousova.lesson17;

import java.util.concurrent.*;

public class Task3 {
    public static void main(String[] args) {
        ExecutorService executor = null;

        try {
            executor = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 2; i++) {
                executor.execute(new BankAccount(100)); //потоки созданы, но метод run не меняет баланс
                System.out.println("__________________________________");
            }

            for (int i = 0; i < 200; i++) {
                BankAccount.deposit(100);//это просто последовательный вызов статических методов. нужно вызывать их в запущенных потоках
            }
            for (int i = 0; i < 100; i++) {
                BankAccount.withdraw(200); //это просто последовательный вызов статических методов. нужно вызывать их в запущенных потоках
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
        System.out.println("Конечный баланс: " + BankAccount.getBalance());

    }
}
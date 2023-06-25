package com.academy.belousova.lesson17;

import java.util.concurrent.CountDownLatch;

public class BankAccount implements Runnable {
    private static double balance; //синхронизации нет никакой, при большом количестве запусков рано или поздно будут проблемы из-за конкурнетного доступа. потоки будут

    private static final CountDownLatch start = new CountDownLatch(2);//защелки не нужны, нету у нас в этой ДЗ заданий на использование защелок
    private static final CountDownLatch finish = new CountDownLatch(2);

    @Override
    public void run() {

        try {
            start.countDown();
            start.await();
            System.out.println(Thread.currentThread().getName() + " стартовал");
            Thread.sleep(Math.round(Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + " финишировал");
            finish.countDown();
            finish.await();
            System.out.println(Thread.currentThread().getName() + " завершился");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public BankAccount(double balance) {
        BankAccount.balance = balance;
        System.out.println("Начальный баланс: " + getBalance());
    }

    public static void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
        System.out.println("Баланс после списания: " + newBalance);
    }

    public static void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Баланс после зачисления: " + newBalance);
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        BankAccount.balance = balance;
    }
}

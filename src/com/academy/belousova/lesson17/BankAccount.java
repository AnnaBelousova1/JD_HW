package com.academy.belousova.lesson17;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
    private AtomicInteger balance;

    public BankAccount(AtomicInteger balance) {
        this.balance = balance;
        System.out.println("Начальный баланс: " + balance);
    }

    public void withdraw(int amount) {

        int current = balance.get();
        int newValue = current - amount;
        while (!balance.compareAndSet(current, newValue)) {
            current = balance.get();
            newValue = current - amount;
        }
        System.out.println("Списано " + amount + ", текущий баланс " + getBalance());
    }

    public void deposit(int amount) {
        balance.addAndGet(amount);
        System.out.println("Зачислено " + amount + ", текущий баланс " + getBalance());
    }

    public AtomicInteger getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
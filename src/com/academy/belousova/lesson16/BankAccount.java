package com.academy.belousova.lesson16;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
        System.out.println("Начальный баланс: " + this.balance);
    }

    public synchronized void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
        System.out.println("Баланс после списания: " + newBalance);
    }

    public synchronized void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Баланс после зачисления: " + newBalance);
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}

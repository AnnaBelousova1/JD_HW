package com.academy.belousova.lesson16;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(100);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 200; i++) {
                bankAccount.deposit(100);
            }

        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                bankAccount.withdraw(200);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("_____________________________");
        System.out.println("Конечное значение баланса: " + bankAccount);
    }
}

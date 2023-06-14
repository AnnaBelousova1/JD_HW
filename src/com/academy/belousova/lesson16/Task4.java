package com.academy.belousova.lesson16;

public class Task4 {
    public static final int BUYERS_TO_SERVE = 200;
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            new Cashier(i).start();
        }

        System.out.println("Магазин открылся!");
        for (int i = 0; i < BUYERS_TO_SERVE; i++) {
            Buyer buyer = new Buyer(i);
            QueueContainer.addBuyer(buyer);
        }
    }
}

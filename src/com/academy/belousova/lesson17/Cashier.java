package com.academy.belousova.lesson17;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

import static java.lang.Thread.sleep;

public class Cashier implements Runnable {
    private  String name;
    private static final CountDownLatch start = new CountDownLatch(2);
    private static final CountDownLatch finish = new CountDownLatch(2);

    public Cashier(String name) {
            this.name = name;
    }

    @Override
    public void run() {
        try {
            start.countDown();
            start.await();
            System.out.println(Thread.currentThread().getName() + " стартовал");
            System.out.println(getName() + " приступил к работе");
            sleep(Math.round(Math.random() * 1000));

            while (QueueContainer.isServiceNeeded()) {
                Buyer buyer = QueueContainer.removeBuyer();
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                printBill(buyer);
                QueueContainer.incrementCounter();
            }
            System.out.println(getName() + " завершил работу");


            System.out.println(Thread.currentThread().getName() + " финишировал");
            finish.countDown();
            finish.await();

            System.out.println(Thread.currentThread().getName() + " завершился");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void printBill(Buyer buyer) {
        if (buyer == null) {
            return;
        }
        Map<String, Integer> bucket = buyer.getBucket();

        System.out.println("________________________________");
        System.out.println(getName() + " обслуживает " + buyer.getName());
        double sum = 0;
        for (Map.Entry<String, Integer> entry : bucket.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            sum += entry.getValue();
        }
        System.out.println("Итого сумма: " + sum);
        System.out.println("________________________________");

    }

    public  String getName() {
        return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }
}
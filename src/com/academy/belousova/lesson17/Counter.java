package com.academy.belousova.lesson17;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements Runnable {

    private final String name;
    private static final CountDownLatch start = new CountDownLatch(2);
    private static final CountDownLatch finish = new CountDownLatch(2);
    private static final AtomicInteger counter = new AtomicInteger(0);

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {

            start.countDown();
            start.await();

            Thread.sleep(Math.round(Math.random() * 1000));

            finish.countDown();
            finish.await();

            increment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void increment() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Задача " + name + " выполняется в потоке " +
                    Thread.currentThread().getName() + " и увеличивает счетчик до " + (counter.incrementAndGet()));

            System.out.println("Задача " + name + " завершена");
        }
    }
}

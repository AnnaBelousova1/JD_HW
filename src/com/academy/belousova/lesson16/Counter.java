package com.academy.belousova.lesson16;

public class Counter extends Thread {

    private final static String MONITOR = "s";
    private static Integer count = 0;

    public Counter(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        increment();
    }

    public void increment() {
        synchronized (MONITOR) {
            try {
                System.out.println(getName() + " увеличил счетчик до " + (++count));
                MONITOR.wait();
                System.out.println(getName() + " снова увеличил счетчик до " + (++count));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void sleep() throws InterruptedException {
        sleep(1000);
        System.out.println("Первая пауза завершена");
        synchronized (MONITOR) {
            MONITOR.notify();
        }
        sleep(1000);
        System.out.println("Вторая пауза завершена");
        synchronized (MONITOR) {
            MONITOR.notifyAll();
        }
    }
}

package com.academy.belousova.lesson17;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class QueueContainer {
    private static AtomicInteger counter = new AtomicInteger(0);
    static final LinkedBlockingQueue<Buyer> que = new LinkedBlockingQueue<>();

    public static void addBuyer(Buyer buyer) {
        que.add(buyer);
    }

    public static Buyer removeBuyer() {
        return que.poll();
    }

    public static void incrementCounter() {
        counter.incrementAndGet();
    }

    public static boolean isServiceNeeded() {
        return counter.get() <= Task4.BUYERS_TO_SERVE;
    }
}

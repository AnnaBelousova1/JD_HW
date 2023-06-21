package com.academy.belousova.lesson17;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueContainer {
    private static final Queue<Buyer> queue = new ArrayDeque<>();

    private static int counter = 0;

    public static void addBuyer(Buyer buyer) {
            queue.add(buyer);
    }

    public static Buyer removeBuyer() {
            return queue.poll();
    }

    public static  void incrementCounter() {
        counter++;
    }

    public static  boolean isServiceNeeded() {
        return counter <= Task4.BUYERS_TO_SERVE;
    }
}

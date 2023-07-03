package com.academy.belousova.lesson17;

import java.util.concurrent.*;

public class SafeQueue<V> {
    private static final int SIZE = 2;
    static final BlockingQueue<Object> queue = new ArrayBlockingQueue<>(SIZE);

    public SafeQueue() {
    }

    public static <V> void enqueue(V item) {

        try {
            if (queue.size() == SIZE) {
                System.out.println("Очередь заполнена, ждем, пока освободится место");
            }
            if (queue.size() == 0) {
                System.out.println("Очередь пуста");
            }
            queue.put(item);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Элемент " + item + " добавлен");
    }

    public static <V> V dequeue() {

        try {
            if (queue.size() == 0) {
                System.out.println("Очередь пуста, ожидая, пока что-то не будет помещено");
            }
            if (queue.size() == SIZE) {
                System.out.println("Очередь заполнена");
            }

            System.out.println("Элемент " + queue.take() + " извлечен");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return (V) queue;
    }
}

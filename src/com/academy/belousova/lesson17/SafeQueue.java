package com.academy.belousova.lesson17;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;

public class SafeQueue<V> implements Runnable {

    private static int size;
    private static Queue<Object> queue = new ArrayDeque<>(); //Смысл этого задания - просто заменить потокоопасную очередь на потокобезопасную
    private static final CountDownLatch start = new CountDownLatch(2); //не нужны они тут
    private static final CountDownLatch finish = new CountDownLatch(2);


    public SafeQueue(int size) {
        SafeQueue.size = size;
    }

    @Override
    public void run() {

        try {
            start.countDown();
            start.await();
            System.out.println(Thread.currentThread().getName() + " стартовал");
            Thread.sleep(Math.round(Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + " финишировал");
            finish.countDown();
            finish.await();
            System.out.println(Thread.currentThread().getName() + " завершился");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized <V>void enqueue(V item) {
        while (queue.size() == size) {
                System.out.println("Очередь заполнена, ждем, пока освободится место");
        }
        if (queue.size() == 0) {
            System.out.println("Очередь пуста");
        }

        queue.add(item);
        System.out.println("Элемент " + item + " добавлен");
    }

    public static <V> V dequeue() {
        while (queue.size() == 0) {
                System.out.println("Очередь пуста, ожидая, пока что-то не будет помещено");
        }
        if (queue.size() == size) {
            System.out.println("Очередь заполнена");
        }

        V qt = (V) queue.peek(); //синхронизации нет. это опасные с точки зрения доступа к ресурсу действия
        queue.remove(qt);
        System.out.println("Элемент " + qt + " извлечен");
        return (V) queue;
    }
}

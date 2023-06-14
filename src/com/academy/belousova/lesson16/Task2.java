package com.academy.belousova.lesson16;

public class Task2 {
    public static void main(String[] args) {
        SafeQueue q = new SafeQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Передний элемент равен " + q.peek());
        q.dequeue();
        System.out.println("Передний элемент равен " + q.peek());

        System.out.println("Размер очереди равен " + q.size());

        q.dequeue();
        q.dequeue();

        if (q.isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            System.out.println("Очередь не пуста");
        }
    }
}



package com.academy.belousova.lesson15;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{4, 0, 3, 2};

        ArraySum arraySum1 = new ArraySum(array1);
        Thread thread1 = new Thread(arraySum1);
        thread1.start();

        ArraySum arraySum2 = new ArraySum(array2);
        Thread thread2 = new Thread(arraySum2);
        thread2.start();

        System.out.println("Общая сумма обоих потоков = " + (ArraySum.sum(array1) + ArraySum.sum(array2)));
    }
}

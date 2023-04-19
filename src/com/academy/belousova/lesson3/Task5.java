package com.academy.belousova.lesson3;

/*
Напишите 2 метода каждый из которых принимает массив элементов.
Первый метод должен выводить в консоль максимальное значение из массива,
второй – минимальное. Напишите для них Javadoc комментарии.
 */

/**
 * @version Java 19.0
 * @location Grodno
 * @autor Anna Belousova
 */

public class Task5 {
    /**
     * This class shows how to find max and min numbers an array in Java
     *
     * @param args
     */
    public static void main(String[] args) {
        printMax();
        printMin();
    }

    public static int printMax() {
        int[] array = {9, 10, 6, 7, 2, 5};
        System.out.println("Вывод массива на экран: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int maxNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum)
                maxNum = array[i];
        }
        System.out.println("Максимальное значение из массива: " + maxNum);
        return 0;
    }


    public static void printMin() {
        int[] array = {99, 1, 68, 9, 2, 6};
        System.out.println("Вывод массива на экран: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        int minNum = array[0];

        for (int j : array) {
            if (j < minNum)
                minNum = j;
        }
        System.out.println("Минимальное значение из массива: " + minNum);
    }
}

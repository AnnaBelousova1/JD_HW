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
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = Task4.readArray();
        printArray(ints);
        printMax(ints);
        printMin(ints);
    }

    /**
     * This method takes an array entered by the user from the console and
     * displays it on the screen.
     * @param array
     */
    public static void printArray(int[] array) {
        System.out.println("Вывод массива на экран: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * This method takes an array and shows how to find max number an array
     * @param array
     */
    public static void printMax(int[] array) {
        int maxNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum)
                maxNum = array[i];
        }
        System.out.println("Максимальное значение из массива: " + maxNum);
    }

    /**
     * This method takes an array and shows how to find min number an array
     * @param array
     */
    public static void printMin(int[] array) {
        int minNum = array[0];

        for (int j : array) {
            if (j < minNum)
                minNum = j;
        }
        System.out.println("Минимальное значение из массива: " + minNum);
    }
}
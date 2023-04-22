package com.academy.belousova.lesson3;

/*
Для того, чтобы ввести массив используйте уже написанный метод из предыдущего пункта.
 */

public class Task6 {
    public static void main(String[] args) {
        int[] ints = Task4.readArray();
        printArray(ints);
    }

    public static void printArray(int[] array) {
        System.out.println("Вывод массива на экран: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
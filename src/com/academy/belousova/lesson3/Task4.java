package com.academy.belousova.lesson3;

import java.util.Scanner;

/*
– Напишите статический публичный метод, который читает с консоли
строку целочисленных значений, разделенных пробелом и возвращает их массив.
- Напишите статический публичный метод, который принимает массив
целочисленных элементов и выводит их на экран.
- Напишите еще один метод, который делает то же, что и в предыдущем пункте,
но не выводит число на экран если оно кратно 7.
 */

public class Task4 {
    public static void main(String[] args) {
        int[] ints = readArray();
        printArray(ints);
        printArray2(ints);
    }

    public static int[] readArray() {
        System.out.println("Введите элементы массива через пробел: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arrayString = s.trim().split(" ");

        int[] intArray = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            intArray[i] = Integer.parseInt(arrayString[i]);
        }
        return intArray;
    }

    public static void printArray(int[] array) {
        System.out.println("Вывод массива на экран: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray2(int[] array) {
        System.out.println("Вывод массива на экран без чисел кратных 7: ");
        for (int j : array) {
            if (j % 7 == 0) {
                continue;
            }
            System.out.print(j + " ");
        }
    }
}







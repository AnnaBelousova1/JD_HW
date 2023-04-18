package com.academy.belousova.lesson3;

/* Вывести последовательность 012345678900112233445566778899000…
до числа 9999 включительно.
 */

public class Task2 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                a = i++;
            }
            a++;
        }

        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("0");
            }
            array[i] = i * 11;
            System.out.print(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("00");
            }
            array[i] = i * 111;
            System.out.print(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("000");
            }
            array[i] = i * 1111;
            System.out.print(array[i]);
        }
    }
}





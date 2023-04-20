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

        printArray();
        printNewArray();
        printWithout();
    }

    public static void printArray() {

        System.out.println("Введите 10 элементов через пробел: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] array = new int[10]; // почему 10? я хочу сколько угодно, не надо меня ограничивать))

        String[] split = str.split(" "); //подсказка: чему равна длина этого массива?

        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        System.out.println("Вывод массива на экран: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


    public static void printNewArray() {
        int[] array = {9, 7, 5, 68, 23, 0, 1};
/*не надо создавать новый массив, нужно принять в метод
массив, который ввел пользователь с клавиатуры
 */
        System.out.println("Вывод нового массива на экран: ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printWithout() {
        int[] array = {9, 7, 5, 68, 23, 0, 1}; //то же самое. передать пользовательский массив в качетсве параметра

        System.out.println("Вывод массива на экран без чисел кратных 7: ");
        for (int j : array) {
            if (j % 7 == 0) {
                continue;
            }
            System.out.print(j + " ");
        }
    }
}







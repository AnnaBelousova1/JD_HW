package com.academy.belousova.lesson3;

/*
Для того, чтобы ввести массив используйте уже написанный метод из предыдущего пункта.
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        input();
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Вывод массива на экран: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

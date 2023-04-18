package com.academy.belousova.lesson4;

/*
Напишите программу, которая принимает из консоли количество
чисел Фибоначчи и генерирует заданное количество. Используйте рекурсию.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }


    public static void main(String[] args) {
        System.out.println("Введите количество чисел Фибоначчи: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();


        System.out.println("Проверка: ");
        int[] fib = new int[20];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        System.out.println(Arrays.toString(fib));
    }
}

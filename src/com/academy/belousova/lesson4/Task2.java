package com.academy.belousova.lesson4;

/* Напишите программу, которая принимает 2 числа из консоли
и выводит наибольший общий делитель. Используйте рекурсию.
 */

import java.util.Scanner;

public class Task2 {
    public static int maxNum(int a, int b) {
        if (a % b == 0) {
            return b;
        } else
            return maxNum(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Введите второе число: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();


    }
}

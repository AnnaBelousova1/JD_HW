package com.academy.belousova.lesson2;

import java.util.Scanner;

/* Напишите программу, которая считывает из консоли вещественное число
с количеством порядков после запятой не менее 5 (наприм 155.55556) и выводит
число в консоль, округленным до 3-х порядков после запятой по правилам
математического округления. Программа должна обеспечить точность и избегать потерь данных.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите вещественное число (после запятой не менее 5 знаков): ");

        Scanner sc = new Scanner(System.in);
        float i = sc.nextFloat();

        System.out.printf("Вывод на консоль с округлением до 3 знаков: %.3f", i);
    }
}

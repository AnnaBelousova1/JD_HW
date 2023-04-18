package com.academy.belousova.lesson2;

import java.util.Scanner;

/* Написать программу которая считывает 2 числа с консоли и
выводит значение их суммы в 4-х форматах: десятичный, двоичный,
восьмеричный и шестнадцатеричный.
 */
public class Task1 {
    public static void main(String[] args) {
        var1();
    }

    public static void var1() {
        System.out.println("Введите первое число: ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Введите второе число: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        int sum = num1 + num2;
        System.out.println("Сумма двух чисел в десятичной системе равна: " + sum);

        String binary = Integer.toBinaryString(sum);
        System.out.println("Сумма двух чисел в двоичной системе равна: " + binary);

        String octal = Integer.toOctalString(sum);
        System.out.println("Сумма двух чисел в восьмеричной системе равна: " + octal);

        String hex = Integer.toHexString(sum);
        System.out.println("Сумма двух чисел в шестнадцатеричной системе равна: " + hex);

    }

    // В качестве примера - для себя.
    // Второй вариант. Не предусмотрен вывод в двоичной системе с использованием спецификаторов.
    public static void var2() {
        System.out.println("Введите первое число: ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();

        System.out.println("Введите второе число: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        int sum = num1 + num2;

        System.out.println("Сумма двух чисел в различных системах исчисления:");
        System.out.printf("десятичной - %d, восьмеричной - %o, шестнадцатеричной - %x", sum, sum, sum);
    }
}


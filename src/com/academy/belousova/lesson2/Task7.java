package com.academy.belousova.lesson2;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/* Напишите программу которая:
- генерирует случайное число в диапазоне от 0 до 100;
- считывает из консоли целочисленное значение с порядком
более чем 10^20. (Например 18 000 000 000 000 000 000).
-умножает случайное число на число, введенное с консоли и
выводит результат.
 */

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите целочисленное значение с порядком более чем 10^20: ");

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();

        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;

        System.out.println("Случайное число из диапазона от 0 до 100: " + i);

        BigInteger d = BigInteger.valueOf(i);
        BigInteger result = n.multiply(d);

        System.out.println("Результат умножения случайного числа на число, введенное с консоли: " + result);
    }
}

package com.academy.belousova.lesson2;

import java.util.Scanner;

/* Программа должна считать с консоли количество лет и
вывести строку со словом «год» по правилам русского языка.
(21 год, 22 года, 25 лет).
 */

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите свой возраст: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 11 && age <= 14) {
            System.out.println("Ваш возраст: " + age + " " + "лет");
        } else if (age % 10 == 1) {
            System.out.println("Ваш возраст: " + age + " " + "год");
        } else if (age % 10 >= 2 && age % 10 <= 4) {
            System.out.println("Ваш возраст: " + age + " " + "года");
        } else {
            System.out.println("Ваш возраст: " + age + " " + "лет");
        }
    }
}

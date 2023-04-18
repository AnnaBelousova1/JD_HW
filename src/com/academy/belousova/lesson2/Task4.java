package com.academy.belousova.lesson2;

import java.util.Scanner;

/* Считайте порядковый номер месяца, введенный через консоль.
Программа должна вывести в консоль название месяца согласно его
порядковому номеру. Если число вне интервала 1-12 сообщить
что такого месяца нет.
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число месяца: ");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i) {
            case 1 -> System.out.println("Вы ввели число месяца - Январь.");
            case 2 -> System.out.println("Вы ввели число месяца - Февраль.");
            case 3 -> System.out.println("Вы ввели число месяца - Март.");
            case 4 -> System.out.println("Вы ввели число месяца - Апрель.");
            case 5 -> System.out.println("Вы ввели число месяца - Май.");
            case 6 -> System.out.println("Вы ввели число месяца - Июнь.");
            case 7 -> System.out.println("Вы ввели число месяца - Июль.");
            case 8 -> System.out.println("Вы ввели число месяца - Август.");
            case 9 -> System.out.println("Вы ввели число месяца - Сентябрь.");
            case 10 -> System.out.println("Вы ввели число месяца - Октябрь.");
            case 11 -> System.out.println("Вы ввели число месяца - Ноябрь.");
            case 12 -> System.out.println("Вы ввели число месяца - Декабрь.");
            default -> System.out.println("Вы ввели число вне диапазона 1-12. Такого месяца нет.");
        }
    }
}



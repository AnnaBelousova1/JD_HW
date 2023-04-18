package com.academy.belousova.lesson2;

import java.util.Scanner;

/* Считайте число, введенное через консоль. Программа должна
вывести на экран является ли число четным или нечетным.
 */
public class Task2 {
    public static void main(String[] args) {
        var1();
    }

    public static void var1() {
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Введенное число является нечетным.");
        } else {
            System.out.println("Введенное число является четным.");
        }
    }


    // Второй вариант
    public static void var2() {
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean entrance = getEntrance(n);

        if (entrance) {
            System.out.println("Введенное число является нечетным.");
        } else {
            System.out.println("Введенное число является четным.");
        }
    }

    public static boolean getEntrance(int n) {
        if (n % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // Третий вариант
    public static void var3() {
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String entrance = (n % 2 != 0) ? "Число нечетное" : "Число четное";
        System.out.println(entrance);
    }


    // Четвертый вариант
    public static void var4() {
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean entrance = (n % 2 != 0);

        if (entrance) {
            System.out.println("Введенное число является нечетным.");
        } else {
            System.out.println("Введенное число является четным.");
        }
    }

    /* Пятый вариант - рабочий. Закомментирован.
    public static void var5() {
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean entrance = getEntrance(n);

        if (entrance) {
            System.out.println("Введенное число является нечетным.");
        } else {
            System.out.println("Введенное число является четным.");
        }
    }

    public static boolean getEntrance(int n) {
        return (n % 2 != 0);
    }
     */
}


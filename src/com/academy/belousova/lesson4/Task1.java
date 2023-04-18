package com.academy.belousova.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        expression();
        expression2();
        expression3();
        expression4();
    }

    public static void expression() {
        double a = 756.13;
        double x = 0.3;
        final double PI = 3.14;

        double b = Math.pow(Math.cos((x + x) + (PI / 6)), 5);

        double s = Math.sqrt((x * (Math.pow(a, 3))));

        double d = Math.log(Math.abs((a - 1.12 * x) / 4));

        double res = b - s - d;
        System.out.println("Результат арифметического выражения равен: " + res);
    }

    public static void expression2() {
        double a = 756.13;
        double x = 0.3;
        final double PI = 3.14;

        double res = Math.pow(Math.cos((x + x) + (PI / 6)), 5) -
                Math.sqrt((x * (Math.pow(a, 3)))) - Math.log(Math.abs((a - 1.12 * x) / 4));
        System.out.println("Результат арифметического выражения равен: " + res);
    }

    public static void expression3() {
        double a = 1.21;
        double b = 0.371;

        double res = Math.tan(Math.pow((a + b), 2)) - Math.cbrt(a + 1.5) + (a * Math.pow(b, 5) -
                (b / Math.log(a + a)));
        System.out.println("Результат арифметического выражения равен: " + res);
    }

    public static void expression4() {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println(" Табулирование функции у = х^2 + 1");
        System.out.println("    на отрезке [A, B] с шагом Н");
        System.out.println("__________________________________");



    }
}


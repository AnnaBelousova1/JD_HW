package com.academy.belousova.lesson2;

import java.util.Scanner;

/* Создать программу, которая будет находить вещественные корни
квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
Посказка для вычисления корня квадратного используйте метод Math.sqrt(4).
 */

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Программа решает квадратное уравнение вида: ");
        System.out.println("ax² + bx + c = 0");
        System.out.println("Введите a, b и c: ");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Вычисление дискиминанта по формуле
        double D;
        D = b * b - 4 * a * c;

        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {      // если дискриминант меньше нуля
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}

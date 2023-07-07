package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = base * height / 2.0;
        System.out.println("Площадь фигуры - равна:");
        return area;
    }

    @Override
    public Shape describe() {
        System.out.println("Треугольник");

        System.out.println("Введите основание и высоту");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        Triangle triangle = new Triangle(base, height);
        return triangle;

    }
}

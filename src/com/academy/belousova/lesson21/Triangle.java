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
        return base * height / 2.0;
    }

    public static void describe() {
        System.out.println("Треугольник");

        System.out.println("Введите основание и высоту");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        Triangle triangle = new Triangle(base, height);
        ShapeFactory.getArea(triangle);

    }
}

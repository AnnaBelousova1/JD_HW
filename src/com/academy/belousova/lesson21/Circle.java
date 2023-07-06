package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void describe() {
        System.out.println("Круг");

        System.out.println("Введите радиус");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);
        ShapeFactory.getArea(circle);

    }
}

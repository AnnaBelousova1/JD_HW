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
        double area = Math.PI * radius * radius;
        System.out.println("Площадь фигуры - равна:");
        return area;
    }

    @Override
    public Shape describe() {
        System.out.println("Круг");

        System.out.println("Введите радиус");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        Circle circle = new Circle(radius);  //зачем ты создаешь новый объект? засетай поля в этот и верни this
        return circle;

    }
}

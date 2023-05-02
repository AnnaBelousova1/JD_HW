package com.academy.belousova.lesson6;

public class Circle implements Shape {
    final double PI = 3.14;
    private double r;       // Радиус круга
    private String name;

    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }

    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * PI * r;
    }

    public double getPI() {
        return PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

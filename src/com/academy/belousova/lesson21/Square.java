package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public static void describe() {
        System.out.println("Квадрат");

        System.out.println("Введите сторону");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        Square square = new Square(side);
        ShapeFactory.getArea(square);

    }
}

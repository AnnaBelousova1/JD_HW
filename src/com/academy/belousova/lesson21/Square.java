package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = side * side;
        System.out.println("Площадь фигуры - равна:");
        return area;
    }

    @Override
    public Shape describe() {
        System.out.println("Квадрат");

        System.out.println("Введите сторону");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        Square square = new Square(side);   //зачем ты создаешь новый объект? засетай поля в этот и верни this
        return square;
    }
}

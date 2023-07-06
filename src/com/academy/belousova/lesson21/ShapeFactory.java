package com.academy.belousova.lesson21;

import java.util.Scanner;

public class ShapeFactory {

    Shape getShape(ShapeType shapeType) {
        //     try {

        /*а почему бы у каждой фигуры не реализовать логику запроса данных о себе:
        добавить метод в интерфейс и у каждой фигуры определить свое поедение?
        тогда просто при помощи фабрики выбираешь фигуру, а в клиентском коде вызываешь два метода
        -получение данных от пользователя
        -расчет и вывод площади
         */
        switch (shapeType) {
            case CIRCLE -> {
                System.out.println("Введите радиус");
                Scanner scanner = new Scanner(System.in);
                int radius = scanner.nextInt();
                Circle circle = new Circle(radius);
                getArea(circle);
                return circle;
            }
            case SQUARE -> {
                System.out.println("Введите сторону");
                Scanner scanner = new Scanner(System.in);
                int side = scanner.nextInt();
                Square square = new Square(side);
                getArea(square);
                return square;
            }
            default -> {
                System.out.println("Введите основание и высоту");
                Scanner scanner = new Scanner(System.in);
                int base = scanner.nextInt();
                int height = scanner.nextInt();
                Triangle triangle = new Triangle(base, height);
                getArea(triangle);
                return triangle;
            }
        }
    }

    public double getArea(Shape shape) {
        System.out.println("Площадь фигуры - равна " + shape.getArea());
        return shape.getArea();
    }
}


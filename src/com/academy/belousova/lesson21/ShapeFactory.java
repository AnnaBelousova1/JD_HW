package com.academy.belousova.lesson21;

import java.util.Scanner;

public class ShapeFactory {

    public Shape getShape() {

        System.out.println("Введите 1-Трегольник, 2-Квадрат, 3-Круг");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Shape shape = null;
        int radius = 0;
        int side = 0;
        int base = 0;
        int height = 0;

        if (number == 1) {
            shape = new Triangle(base, height);
        } else if (number == 2) {
            shape = new Square(side);
        } else if (number == 3) {
            shape = new Circle(radius);
        } else {
            throw new NullPointerException("Вы ввели неверные данные");
        }
        return shape;
    }
}


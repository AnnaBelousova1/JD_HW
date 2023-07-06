package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws java.io.IOException {

        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println("Введите 1-Трегольник, 2-Квадрат, 3-Круг");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            shapeFactory.getShape(ShapeType.TRIANGLE);
        }
        else if (number == 2){
            shapeFactory.getShape(ShapeType.SQUARE);
        }
        else if (number == 3) {
            shapeFactory.getShape(ShapeType.CIRCLE);
        }
        else {
            System.out.println("Вы ввели неверные данные");
        }
    }
}

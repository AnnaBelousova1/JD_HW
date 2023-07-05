package com.academy.belousova.lesson21;

public class Task2 {
    public static void main(String[] args) throws java.io.IOException {
        ShapeFactory shapeFactory = new ShapeFactory();
        char choice, ignore;

        for (; ; ) {
            do {
                System.out.println("Справка:");
                System.out.println("1. Треугольник");
                System.out.println("2. Квадрат");
                System.out.println("3. Круг");
                System.out.println("Выберите (q to quit):");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '3' & choice != 'q');

            if (choice == 'q') break;

            System.out.println("\n");

            switch (choice) {
                case '1' -> {
                    System.out.println("Треугольник");
                    shapeFactory.getShape(ShapeType.TRIANGLE);
                }
                case '2' -> {
                    System.out.println("Квадрат");
                    shapeFactory.getShape(ShapeType.SQUARE);
                }
                case '3' -> {
                    System.out.println("Круг");
                    shapeFactory.getShape(ShapeType.CIRCLE);
                }
            }
            System.out.println();
        }
    }
}

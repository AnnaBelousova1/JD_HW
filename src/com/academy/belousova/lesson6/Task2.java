package com.academy.belousova.lesson6;

public class Task2 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 8, "Прямоугольник");
        Circle circle = new Circle(9, "Круг");
        Triangle triangle = new Triangle(3, 4, 5, "Треугольник");


        ShapeParameterPrinter shapeParameterPrinter = new ShapeParameterPrinter();
        shapeParameterPrinter.printArea(rectangle);
        shapeParameterPrinter.printPerimeter(rectangle);
        shapeParameterPrinter.printAll(rectangle);

        shapeParameterPrinter.printArea(circle);
        shapeParameterPrinter.printPerimeter(circle);
        shapeParameterPrinter.printAll(circle);

        shapeParameterPrinter.printArea(triangle);
        shapeParameterPrinter.printPerimeter(triangle);
        shapeParameterPrinter.printAll(triangle);

    }
}

package com.academy.belousova.lesson6;

public class ShapeParameterPrinter {

    public void printArea(Shape shape) {
        System.out.println("Площадь фигуры - " + shape.getName() + " - равна " + shape.area());
    }

    public void printPerimeter(Shape shape) {
        System.out.println("Периметр фигуры - " + shape.getName() + " - равен " + shape.perimeter());
    }

    public void printAll(Shape shape) {
        System.out.println("Площадь и Периметр фигуры - " + shape.getName() + " - равны " +
                shape.area() + "; " + shape.perimeter());
        System.out.println("_______________________________________________________________");
    }
}

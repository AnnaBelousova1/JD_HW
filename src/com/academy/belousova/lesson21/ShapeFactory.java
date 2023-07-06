package com.academy.belousova.lesson21;

public class ShapeFactory {

    void getShape(ShapeType shapeType) {

        switch (shapeType) {
            case CIRCLE -> {
                Circle.describe();
            }
            case SQUARE -> {
              Square.describe();
            }
            default -> {
              Triangle.describe();
            }
        }
    }

    public static double getArea(Shape shape) {
        System.out.println("Площадь фигуры - равна " + shape.getArea());
        return shape.getArea();
    }
}


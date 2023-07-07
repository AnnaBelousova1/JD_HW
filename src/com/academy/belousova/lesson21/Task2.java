package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println(shapeFactory.getShape().describe().getArea());
    }
}

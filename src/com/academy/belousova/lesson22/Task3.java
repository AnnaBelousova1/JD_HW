package com.academy.belousova.lesson22;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(5, 6);
        System.out.println("Первая матрица: " + Arrays.deepToString(matrix1.getMas()));

        Matrix matrix2 = new Matrix(5, 6);
        System.out.println("Вторая матрица: " + Arrays.deepToString(matrix2.getMas()));

        Matrix add = Matrix.add(matrix1, matrix2);
        if (add == null) {
            return;
        }
        System.out.println("Результат сложения: " + Arrays.deepToString(add.getMas()));

       Matrix multiply = Matrix.multiply(matrix1, matrix2);
        if (multiply == null) {
            return;
        }
        System.out.println("Результат умножения: " + Arrays.deepToString(multiply.getMas()));

        Matrix subtract = Matrix.subtract(matrix1, matrix2);
        if (subtract == null) {
            return;
        }
        System.out.println("Результат вычитания: " + Arrays.deepToString(subtract.getMas()));
    }
}

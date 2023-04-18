package com.academy.belousova.lesson3;

/*
Реализуйте метод перемножения матрицы на вектор. Метод должен принимать
2 параметра – массив и двумерный массив, а также должен осуществлять проверку
возможности умножения вектора на матрицу (число столбцов в матрице должно
совпадать с числом строк в векторе-столбце). Значения массива вектора и двумерного
массива матрицы проинициализируйте в методе main. Результат умножения выведите на экран.
 */

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[4];

        int[] vector = {5, 6, 8, 7};
        System.out.println("Вектор: ");
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Матрица: ");
        int[][] matrix = {
                {5, 8, 6, 4},
                {1, 9, 0, 3},
                {7, 4, 4, 5},
                {6, 7, 4, 0},
        };
        int i, j;

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");

            System.out.println();
        }

        System.out.println("Результат перемножения матрицы на вектор: ");

        for (i = 0; i < matrix.length; i++) {
            if (matrix[0].length != vector.length) {
                System.out.println("Эти матрицы нельзя перемножить!");
            }

            for (j = 0; j < matrix[i].length; j++) {
                array[i] += matrix[i][j] * vector[j];
            }
            System.out.print(array[i] + " ");
        }
    }
}


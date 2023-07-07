package com.academy.belousova.lesson22;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

//    Первая матрица: [[-3, -9, 5, -9, 8, -7], [-5, 5, 3, 6, 8, 7], [-10, 0, -2, -3, -10, -7], [7, -3, -9, 9, -1, 0], [-2, -10, 4, 7, -8, 9]]
//    Вторая матрица: [[-2, 0, 7, 4, 0, 1], [1, -6, 6, 0, 7, -10], [9, 9, 6, -4, 7, 2], [1, -1, -5, 2, 3, -3], [3, -3, 3, 5, -2, 1]]
//    Результат сложения: [[-5, -9, 12, -5, 8], [-4, -1, 9, 6, 15], [-1, 9, 4, -7, -3], [8, -4, -14, 11, 2], [1, -13, 7, 12, -10]]
//    Результат умножения: [[6, 0, 35, -36, 0], [-5, -30, 18, 0, 56], [-90, 0, -12, 12, -70], [7, 3, 45, 18, -3], [-6, 30, 12, 35, 16]]
//    Результат вычитания: [[-1, -9, -2, -13, 8], [-6, 11, -3, 6, 1], [-19, -9, -8, 1, -17], [6, -2, -4, 7, -4], [-5, -7, 1, 2, -6]]


    int[][] matrix1 = new int[][]{{-3, -9, 5, -9, 8, -7}, {-5, 5, 3, 6, 8, 7}, {-10, 0, -2, -3, -10, -7}, {7, -3, -9, 9, -1, 0}, {-2, -10, 4, 7, -8, 9}};
    int[][] matrix2 = new int[][]{{-2, 0, 7, 4, 0, 1}, {1, -6, 6, 0, 7, -10}, {9, 9, 6, -4, 7, 2}, {1, -1, -5, 2, 3, -3}, {3, -3, 3, 5, -2, 1}};
    int[][] mas = new int[5][5];


    @Test
    public void testAdd() {

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                mas[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(mas));

        int[][] expectedMatrix = {{-5, -9, 12, -5, 8}, {-4, -1, 9, 6, 15}, {-1, 9, 4, -7, -3}, {8, -4, -14, 11, 2}, {1, -13, 7, 12, -10}};
        System.out.println(Arrays.deepToString(expectedMatrix));

        int[][] actualResult = mas;
        assertArrayEquals(expectedMatrix, actualResult);

    }

    @Test
    public void testMultiply() {

        for (int k = 0; k < mas.length; k++) {
            for (int l = 0; l < mas[k].length; l++) {
                mas[k][l] = matrix1[k][l] * matrix2[k][l];
            }
        }
        System.out.println(Arrays.deepToString(mas));

        int[][] expectedMatrix = {{6, 0, 35, -36, 0}, {-5, -30, 18, 0, 56}, {-90, 0, -12, 12, -70}, {7, 3, 45, 18, -3}, {-6, 30, 12, 35, 16}};

        System.out.println(Arrays.deepToString(expectedMatrix));
        int[][] actualResult = mas;
        assertArrayEquals(expectedMatrix, actualResult);

    }


    @Test
    public void testSubtract() {

        for (int k = 0; k < mas.length; k++) {
            for (int l = 0; l < mas[k].length; l++) {
                mas[k][l] = matrix1[k][l] - matrix2[k][l];
            }
        }
        System.out.println(Arrays.deepToString(mas));

        int[][] expectedMatrix = {{-1, -9, -2, -13, 8}, {-6, 11, -3, 6, 1}, {-19, -9, -8, 1, -17}, {6, -2, -4, 7, -4}, {-5, -7, 1, 2, -6}};

        System.out.println(Arrays.deepToString(expectedMatrix));
        int[][] actualResult = mas;
        assertArrayEquals(expectedMatrix, actualResult);

    }

    @Test
    void testNullException() {

        Matrix matrix1 = new Matrix(0, 6);
        Matrix matrix2 = new Matrix(5, 6);

        assertThrows(NullPointerException.class,()-> Matrix.add(matrix1, matrix2));
    }

    @Test
    void testException() {

        Matrix matrix1 = new Matrix(5, 6);
        Matrix matrix2 = new Matrix(4, 6);

        assertThrows(ArrayIndexOutOfBoundsException.class,()-> Matrix.add(matrix1, matrix2));

    }

    @Override
    public String toString() {
        return "MatrixTest{" +
                "1=" + Arrays.toString(matrix1) +
                ", 2=" + Arrays.toString(matrix2) +
                '}';
    }
}
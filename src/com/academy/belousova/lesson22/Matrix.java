package com.academy.belousova.lesson22;

import java.util.Random;

public class Matrix {
    public int[][] mas;

    public Matrix(int i, int j) {
        mas = new int[i][j];
        Random y = new Random();
        for (i = 0; i < mas.length; i++) {
            for (j = 0; j < mas[i].length; j++) {
                mas[i][j] = y.nextInt(-10, 10);
            }
        }
    }

    public static Matrix add(Matrix i, Matrix j) {
        Matrix m = new Matrix(i.mas.length, j.mas.length);

        if (i.mas == null || i.mas.length == 0 || i.mas[0] == null || i.mas[0].length == 0) {
            throw new NullPointerException("Матрица не может быть нулевой!");


        }
        if (j.mas == null || j.mas.length == 0 || j.mas[0] == null || j.mas[0].length == 0) {
            throw new NullPointerException("Матрица не может быть нулевой!");

        }
        if (i.mas.length != j.mas.length || i.mas[0].length != j.mas[0].length) {
            throw new ArrayIndexOutOfBoundsException("Число строк/столбцов двух матриц не соответствует!\nОперация не возможна!");

        } else {
            for (int k = 0; k < m.mas.length; k++) {
                for (int l = 0; l < m.mas[k].length; l++) {
                    m.mas[k][l] = i.mas[k][l] + j.mas[k][l];
                }
            }
        }
        return m;
    }

    public static Matrix multiply(Matrix i, Matrix j) {
        Matrix m = new Matrix(i.mas.length, j.mas.length);

        if (i.mas == null || i.mas.length == 0 || i.mas[0] == null || i.mas[0].length == 0) {
            throw new NullPointerException("Матрица не может быть нулевой!");
        }
        if (j.mas == null || j.mas.length == 0 || j.mas[0] == null || j.mas[0].length == 0) {
            throw new NullPointerException("Матрица не может быть нулевой!");
        }
        if (i.mas.length != j.mas.length || i.mas[0].length != j.mas[0].length) {
            throw new ArrayIndexOutOfBoundsException("Число строк/столбцов двух матриц не соответствует!\nОперация не возможна!");
        } else {
            for (int k = 0; k < m.mas.length; k++) {
                for (int l = 0; l < m.mas[k].length; l++) {
                    m.mas[k][l] = i.mas[k][l] * j.mas[k][l];
                }
            }

        }
        return m;
    }

    public static Matrix subtract(Matrix i, Matrix j) {
        Matrix m = new Matrix(i.mas.length, j.mas.length);

        if (i.mas == null || i.mas.length == 0 || i.mas[0] == null || i.mas[0].length == 0) {
            throw new NullPointerException("Матрица не может быть нулевой!");
        }
        if (j.mas == null || j.mas.length == 0 || j.mas[0] == null || j.mas[0].length == 0) {
            throw new NullPointerException("Матрица не может быть нулевой!");
        }
        if (i.mas.length != j.mas.length || i.mas[0].length != j.mas[0].length) {
            throw new ArrayIndexOutOfBoundsException("Число строк/столбцов двух матриц не соответствует!\nОперация не возможна!");
        } else {
            for (int k = 0; k < m.mas.length; k++) {
                for (int l = 0; l < m.mas[k].length; l++) {
                    m.mas[k][l] = i.mas[k][l] - j.mas[k][l];
                }
            }
        }
        return m;
    }

    public int[][] getMas() {
        return mas;
    }

    public void setMas(int[][] mas) {
        this.mas = mas;
    }
}

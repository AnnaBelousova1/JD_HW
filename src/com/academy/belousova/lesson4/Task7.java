package com.academy.belousova.lesson4;

import java.text.DecimalFormat;

public class Task7 {
    public static void main(String[] args) {
        double z, n;
        double[] x = new double[]{5.33, 5.51, 5.69, 5.87, 6.05, 6.23, 6.41, 6.59, 6.77, 6.95, 7.13, 7.31, 7.49,
                7.67, 7.85, 8.03, 8.21, 8.39, 8.57, 8.75, 8.93, 9};

        for (int i = 0; i < x.length; i++) {
            z = Math.cbrt((Math.pow(x[i], 2) + 4.5));

            DecimalFormat dF = new DecimalFormat("#.###");
            System.out.print("A[" + i + "] = " + dF.format(z) + "\t ");

            if (i % 5 == 4) {
                System.out.print("\n");
            }
        }

        System.out.println();

        double[] y = new double[]{3.51, 3.69, 3.87, 4.05, 4.23, 4.41, 4.59, 4.77, 4.95, 5.13, 5.31, 5.49,
                5.67, 5.85, 6.03, 6.21, 6.39, 6.57, 6.75, 6.93, 7.05, 7.5};

        double mul = 1;
        n = y.length;
        for (int i = 0; i < y.length; i++) {
            mul = mul * y[i];
        }
        z = Math.pow(mul, 1 / n);

        DecimalFormat dF = new DecimalFormat("#.###");
        System.out.println("Среднее геометрическое нового массива = " + dF.format(z));
    }
}

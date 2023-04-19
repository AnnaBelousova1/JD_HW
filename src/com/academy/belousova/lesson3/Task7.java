package com.academy.belousova.lesson3;

/* Найти строку матрицы с максимальной суммой элементов.
Матрицу проинициализируйте в методе main. Выведите индекс строки на экран.
 */

public class Task7 {
    public static void main(String[] args) {

        int[][] arr = {
                {5, 8, 6, 4},
                {1, 9, 0, 3},
                {7, 4, 4, 5},
                {6, 7, 4, 0},
        };
        int max = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.print("\tСумма элементов строки: " + sum);

            System.out.println();

            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println("Индекс строки с максимальной суммой элементов: " + index);
    }
}



package com.academy.belousova.lesson3;

/*
Для того, чтобы ввести массив используйте уже написанный метод из предыдущего пункта.
 */

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int [Task5.printMax()];
        for (int number : array) {
            System.out.println(array);
        }
    }
}

package com.academy.belousova.lesson3;

/* Необходимо вывести на экран таблицу умножения на 5
(сделайте это в строку, через пробел)
 */

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Программа выводит на экран таблицу умножения на 5: ");

        for (int i = 1; i <= 10; i++)
            System.out.print(5 + "*" + i + "=" + 5 * i + " ");
    }
}


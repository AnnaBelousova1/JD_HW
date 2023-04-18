package com.academy.belousova.lesson2;

import java.util.Scanner;

/* FizzBuzz. Считайте число, введенное через консоль.
Если число кратно 3 программа должная вывести на консоль Fizz,
если кратно 5 - Buzz, если кратно и 3 и 5 – FizzBuzz.
 */

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Вы ввели число некратно 3 и 5.");
        }
    }
}






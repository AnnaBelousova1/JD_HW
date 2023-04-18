package com.academy.belousova.lesson3;

import java.util.Scanner;

/*
3.	Напишите программу, которая будет запрашивать у пользователя пароль до тех пор,
пока он не введет правильный пароль. Если пользователь вводит неправильный пароль,
программа должна выводить сообщение "Неверный пароль. Попробуйте еще раз".
 */

public class Task3 {
    public static void main(String[] args) {
        int pass = 255;

        System.out.println("Введите пароль: ");

        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();

        while (password != pass) {
            System.out.println("Неверный пароль! Попробуйте еще раз.");
            password = sc.nextInt();
        }
    }
}

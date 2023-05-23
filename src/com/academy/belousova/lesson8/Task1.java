package com.academy.belousova.lesson8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(print(s));
    }

    public static String print(String s) {
        if (s.startsWith("abc")) {
            return "www" + s.substring(3);
        }
        return s + "zzz";
    }
}
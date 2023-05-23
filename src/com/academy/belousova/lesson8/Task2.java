package com.academy.belousova.lesson8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        print(s);
    }

    public static void print (String s) {
        s = s.replaceAll("\\s+", " ");
        s= s.trim();
        System.out.println(s);
    }
}

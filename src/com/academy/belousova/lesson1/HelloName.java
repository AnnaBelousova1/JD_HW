package com.academy.belousova.lesson1;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String helloWithName = printHelloWithName(line);
        System.out.println(helloWithName);
    }

    public static String printHelloWithName(String parameter) {
        return "Hello " + parameter + "!";
    }
}


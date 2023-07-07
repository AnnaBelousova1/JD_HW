package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Drink tea;
        Drink coffee;

        System.out.println("Что вы будете пить 1.чай 2.кофе?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            tea = new MilkDecorator(new SugarDecorator(new SyrupDecorator(new Tea())));
            tea.make();

        }

        if (number == 2) {
            coffee = new MilkDecorator(new SugarDecorator(new SyrupDecorator(new Coffee())));
            coffee.make();

        }
    }
}


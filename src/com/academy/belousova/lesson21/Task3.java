package com.academy.belousova.lesson21;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Drink tea;
        Drink coffee;

        System.out.println("Что вы будете пить чай или кофе?");
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();

        if (s1.equals("чай")) {
            tea = new Tea();

            System.out.println("Чай без ингридиентов или с ингридиентами?");
            Scanner sc2 = new Scanner(System.in);
            String s2 = sc2.nextLine();

            if (s2.equals("без")) {
                tea.make();
            } else {

                System.out.println("Добавить молоко, сахар, сироп или все?");
                Scanner sc3 = new Scanner(System.in);
                String s3 = sc3.nextLine();

                if (s3.equals("молоко")) {
                    tea = new MilkDecorator(new Tea());
                    tea.make();
                }

                if (s3.equals("сахар")) {
                    tea = new SugarDecorator(new Tea());
                    tea.make();
                }

                if (s3.equals("сироп")) {
                    tea = new SyrupDecorator(new Tea());
                    tea.make();
                }

                if (s3.equals("молоко, сахар")) {
                    tea = new MilkDecorator(new SugarDecorator(new Tea()));
                    tea.make();
                }

                if (s3.equals("молоко, сироп")) {
                    tea = new MilkDecorator(new SyrupDecorator(new Tea()));
                    tea.make();
                }

                if (s3.equals("сахар, сироп")) {
                    tea = new SugarDecorator(new SyrupDecorator(new Tea()));
                    tea.make();
                }

                if (s3.equals("все")) {
                    tea = new MilkDecorator(new SugarDecorator(new SyrupDecorator(new Tea())));
                    tea.make();
                }
            }
        }

        if (s1.equals("кофе")) {
            coffee = new Coffee();

            System.out.println("Кофе без ингридиентов или с ингридиентами?");
            Scanner sc2 = new Scanner(System.in);
            String s2 = sc2.nextLine();

            if (s2.equals("без")) {
                coffee.make();

            } else {

                System.out.println("Добавить молоко, сахар, сироп или все?");
                Scanner sc3 = new Scanner(System.in);
                String s3 = sc3.nextLine();

                if (s3.equals("молоко")) {
                    coffee = new MilkDecorator(new Coffee());
                    coffee.make();
                }

                if (s3.equals("сахар")) {
                    coffee = new SugarDecorator(new Coffee());
                    coffee.make();
                }

                if (s3.equals("сироп")) {
                    coffee = new SyrupDecorator(new Coffee());
                    coffee.make();
                }

                if (s3.equals("молоко, сахар")) {
                    coffee = new MilkDecorator(new SugarDecorator(new Coffee()));
                    coffee.make();
                }

                if (s3.equals("молоко, сироп")) {
                    coffee = new MilkDecorator(new SyrupDecorator(new Coffee()));
                    coffee.make();
                }

                if (s3.equals("сахар, сироп")) {
                    coffee = new SugarDecorator(new SyrupDecorator(new Coffee()));
                    coffee.make();
                }

                if (s3.equals("все")) {
                    coffee = new MilkDecorator(new SugarDecorator(new SyrupDecorator(new Coffee())));
                    coffee.make();
                }
            }
        }
    }
}



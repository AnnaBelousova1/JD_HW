package com.academy.belousova.lesson20;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Введите Имя: ");
        Scanner sc1 = new Scanner(System.in);
        String name = sc1.next();

        System.out.println("Введите требуемый язык приветствия (en, ru или be): ");
        Scanner sc2 = new Scanner(System.in);
        String country = sc2.next();

        Locale locale = new Locale(country);

        String baseName = "com.academy.belousova.lesson20.localization.resourcebundle.resource.messages";
        ResourceBundle bundle = ResourceBundle.getBundle(baseName, locale);

        String greeting = bundle.getString("greeting");
        String farewell = bundle.getString("farewell");

            if (country.equalsIgnoreCase("en") || country.equalsIgnoreCase("be") ||
                    country.equalsIgnoreCase("ru")) {

                System.out.println(name + " " + greeting);
                System.out.println(name + " " + farewell);

            } else {

                Locale localeEn = new Locale("en");
                String base = "com.academy.belousova.lesson20.localization.resourcebundle.resource.messages";
                ResourceBundle bund = ResourceBundle.getBundle(base, localeEn);
                String greet = bund.getString("greeting");
                String fare = bund.getString("farewell");

                System.out.println(name + " " + greet);
                System.out.println(name + " " + fare);

        }
    }
}


package com.academy.belousova.lesson20;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Task3 {
    public static void main(String[] args) throws ParseException {

        Category category1 = new Category("Канцелярия");
        Category category2 = new Category("Женская одежда");
        Category category3 = new Category("Фрукты");


        Product pen = new Product("Ручка", 2500.78, 5);
        Product skirt = new Product("Юбка", 1200.56, 4);
        Product apple = new Product("Яблоки", 550.78, 3);

        category1.addProduct(pen);
        category2.addProduct(skirt);
        category3.addProduct(apple);

        Basket basket = new Basket();
        basket.addProduct(pen);
        basket.addProduct(skirt);
        basket.addProduct(apple);

        LocalDate date = LocalDate.of(2022, 5, 28);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatString = date.format(formatter);
        System.out.println("Дата: \t\t\t\t\t\t\t\t\t" + formatString);

        System.out.println("Продукты\tКатегория\t\t\tЦена\t\tРейтинг");
        System.out.println("___________________________________________________");


        double prise1 = pen.getPrice();
        double prise2 = skirt.getPrice();
        double prise3 = apple.getPrice();
        NumberFormat germanFormat = NumberFormat.getInstance(Locale.GERMANY);
        String germanFormattedNumber1 = germanFormat.format(prise1);
        String germanFormattedNumber2 = germanFormat.format(prise2);
        String germanFormattedNumber3 = germanFormat.format(prise3);


        System.out.println(pen.getName() + "\t\t" + category1.getName() + "\t\t\t" +
                germanFormattedNumber1 + " руб" + "\t" + pen.getRating());
        System.out.println(skirt.getName() + "\t\t" + category2.getName() + "\t\t" +
                germanFormattedNumber2 + " руб" + "\t" + skirt.getRating());
        System.out.println(apple.getName() + "\t\t" + category3.getName() + "\t\t\t\t" +
                germanFormattedNumber3 + "\t руб" + "\t" + apple.getRating());
        System.out.println("___________________________________________________");


        double sum = 0;
        for (Product product : basket.getProducts()) {
            sum = sum + product.getPrice();
        }

        double s = sum;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String formattedSum = currencyFormat.format(s);

        System.out.println("Итого: \t\t\t\t\t\t\t\t\t" + formattedSum );

    }
}
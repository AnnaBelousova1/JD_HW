package com.academy.belousova.lesson20;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) throws ParseException {

        isDateOdd("JANUARY 1 2000");
        isDateOdd("JANUARY 1 2020");
        isDateOdd("JANUARY 1 2022");

    }

    public static boolean isDateOdd(String date) {

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("MMMM d yyyy")
                .toFormatter(Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println("localDate: " + localDate);
        System.out.println("localDate.lengthOfYear(): " + localDate.lengthOfYear());

        if (localDate.lengthOfYear() % 2 == 0) {
            System.out.println(date + " = false\n");
            return false;
        } else {
            System.out.println(date + " = true\n");
            return true;
        }
    }
}




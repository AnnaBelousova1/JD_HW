package com.academy.belousova.lesson20;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Task1 {
    public static void main(String[] args) throws ParseException {

        isDateOdd("JANUARY 1 2000");
        isDateOdd("JANUARY 2 2020");
        isDateOdd("APRIL 6 2023");
        isDateOdd("JUNE 19 2022");
        isDateOdd("NOVEMBER 25 2021");

    }

    public static boolean isDateOdd(String date) {

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("MMMM d yyyy")
                .toFormatter(Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println("localDate: " + localDate);

        int dayOfYear = localDate.getDayOfYear();
        if (dayOfYear % 2 == 0){
            System.out.println("С начала года прошло " +  dayOfYear + " дн. (четное количество)");
            System.out.println(date + " = false\n");
            return true;
        } else {
            System.out.println("С начала года прошло " +  dayOfYear + " дн. (нечетное количество)");
            System.out.println(date + " = true\n");
            return false;
        }
    }
}




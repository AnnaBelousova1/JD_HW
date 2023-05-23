package com.academy.belousova.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String s = ("+54451123httr +554844544953 5454 +444659864785jhgf 20+548");
        number(s);
    }

    public static void number(String s) {
        Pattern pattern = Pattern.compile("\\+\\d{9,14}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            System.out.println("номер телефона: " + group);
        }
    }
}


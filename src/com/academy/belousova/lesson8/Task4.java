package com.academy.belousova.lesson8;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) {

        String s = ("Listen to the news from today and read the text at the same time." +
                "Listen to the news from today without reading the text.");

        countWord(s);
    }

    public static void countWord(String s) {
        Set<String> words = new HashSet<>();

        Pattern pattern = Pattern.compile("\\b(\\w+)\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();

            boolean add = words.add(group);
            if (add) {
                System.out.println(group);
            }
        }
        System.out.println("Количество уникальных слов: " + words.size());
    }
}
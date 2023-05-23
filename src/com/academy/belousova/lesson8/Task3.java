package com.academy.belousova.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task3 {
    public static final String s = """
            First of all let me introduce myself. My name is Igor and I am 12 years old. I am a pupil of the sixth
            form of a private school. I live in the residential area in the city. My family is neither large
            nor small. My parents have only three children including me. We live separate from grandparents.
            However, they often come to see us, therefore we are very happy.
                                        
            Thus, I have one elder brother and one younger sister. My brother is a little elder than I am – he is
            two years elder. My sister is five years younger than I am. My brother's name is Peter and my sister’s
            name is Tatiana. As you see, they are both schoolchildren. My brother attends the same secondary school as me.
            And my sister attends primary school with profound study of foreign languages.
                             
            We often quarrel and more often we make up. We have a very tight-knit family. My mother is very kind
            by nature, she always makes a compromise, but my dad is strict and he often punishes us for pranks.
                             
            My parents have been married for 20 years. Dad is a director, mother works as a designer. Dad has a
            full-time job, and the mother’s job is part-time. They love their work and never criticize their
            colleagues.
                             
            On weekends my brother and father do sports and go fishing. This time my mom and sister take a rest
            and become carried away with their girlish things. They often do hairstyles to each other and go
            shopping.
                """;


    public static void main(String[] args) {
        System.out.println(change(s));
        System.out.println("_________________________________________________________________________________");
        letters(s);

    }

    public static String change(String s) {
        char ch = '#';

        StringBuilder sb = new StringBuilder(s);
        String regex = "\\b\\w{4,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String word = matcher.group();
            System.out.printf("start: %d, end: %d, word: %s \n", start, end, word);

            sb.setCharAt(start + 3, ch);

            if ((end - start) > 6) {
                sb.setCharAt(start + 6, ch);
            }
            s = sb.toString();
        }
        return s;
    }

    public static void letters(String s) {
        String regex = "\\b(?i:[bcdfghjklmnpqrstvwxz])\\S*(?i:[aeiouy])\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            int start = matcher.start();
            String word = matcher.group();
            System.out.printf("start: %d, word: %s \n", start, word);
        }
    }
}





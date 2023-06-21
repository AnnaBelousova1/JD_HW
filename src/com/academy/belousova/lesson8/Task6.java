package com.academy.belousova.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String s = ("alex123_ufg@gmail.com11111119676dgdrghaergthhrtizlkfdnjkjslfjils41" +
                "111_!$%&+-.=?^^{}@gmail.comailto\\\\u003AjoseAAAPYT@gmail.com11111111111122" +
                "5632kgjytbadefr$\\<>[](),;\":...*1111>{}[]\"\"|,.ba111_!$%&+-.=?^^{}@gmail.com" +
                " порвв   ыпhjgrhghh@gmail.comlex..2013@gmail.comgdrgheryhalex@devcolibri54545454@gmail.com");
        emailValidator(s);
    }

    public static void emailValidator(String s) {
        Pattern pattern = Pattern.compile("[_\\w-_!$%&\\+\\-\\.=?^^{}]+(\\.[_\\w\\-]+)*@[\\w\\-]+(\\.[A-Za-z]{2,3})");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();

            if ((end - start) < 50) {
                System.out.println("валидный е-мейл: " + group);
            }
        }
    }
}
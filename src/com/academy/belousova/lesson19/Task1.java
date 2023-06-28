package com.academy.belousova.lesson19;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        Collection<String> col = Arrays.asList("new year, day", "find login", "something,do", "Jon");

        //1. узнать, содержит ли какая-нибудь из строк слово login:
        System.out.println("Example 1: ");

        System.out.println(col.stream()
                .filter((s) -> s.contains("login"))
                .collect(Collectors.toList()));


        //2. Поиск самой длинной строки:
        System.out.println("Example 2: ");

        // Преобразование каждой строки в длину
        Function<String, Integer> stringLengthFnc = String::length;
        List<Integer> stringLength = col.stream()
                .map(stringLengthFnc)
                .toList();
        System.out.println(stringLength);

        Optional<Integer> maxString = stringLength.stream()
                .max(Integer::compareTo);
        System.out.println(maxString.orElse(0));


        //3. Поиск самой короткой строки:
        System.out.println("Example 3: ");

        // Преобразование каждой строки в длину
        Function<String, Integer> stringLengthFn = String::length;
        List<Integer> stringLen = col.stream()
                .map(stringLengthFn)
                .toList();
        System.out.println(stringLen);

        Optional<Integer> minString = stringLen.stream()
                .min(Integer::compareTo);
        System.out.println(minString.orElse(0));


        //4. найти строки-слова (не содержат пробелов и знаков препинания)
        System.out.println("Example 4: ");

        System.out.println(col.stream()
                .filter((s) -> !s.contains(" "))
                .filter((s) -> !s.contains(","))
                .collect(Collectors.toList()));


        //5. Объединение элементов в строку:
        System.out.println("Example 5: ");

        String joinedCol = String.join(" + ", col);
        System.out.println(joinedCol);
    }
}

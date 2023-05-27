package com.academy.belousova.lesson12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(3, 4, 5, 6));

        /*
        В задании сказано: Создайте методы для определения пересечения множеств getCross и объединения множеств getUnion.
         */
        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);

        Set<Integer> result = new HashSet<>(setA);
        result.retainAll(setB);
        System.out.println("Пересечение: " + result);

        result.addAll(setA);
        result.addAll(setB);
        System.out.println("Объединение: " + result);

    }
}

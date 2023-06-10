package com.academy.belousova.lesson12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> setB = new TreeSet<>(Arrays.asList(3, 4, 5, 6));

        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);

        System.out.println("Пересечение: " + getCross(setA, setB));
        System.out.println("Объединение: " + getUnion(setA, setB));
    }
    public static <T> Set<T> getCross(Set<T> setA, Set<T> setB) {
        Set<T> setC = new HashSet<>(setA);
        setC.retainAll(setB);
        return setC;
    }

    public static <T> Set<T> getUnion(Set<T> setA, Set<T> setB) {
        Set<T> setC = new HashSet<>(setA);
        setC.addAll(setB);
        return setC;
    }
}

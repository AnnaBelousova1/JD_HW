package com.academy.belousova.lesson11;

import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set = new MySet<>();
        set.add("Welcome");
        set.add("To");
        set.add("4");
        set.add("Street");
        set.add("Home");

        System.out.println("size: " + set.size());
        System.out.println("set: " + set);
        System.out.println("______________________");

        System.out.println("results remove: " + set.remove("Street"));
        System.out.println("set: " + set);
        System.out.println("______________________");

        System.out.println("Is Two in set? " + set.contains("Two"));
        System.out.println("Is Home in set? " + set.contains("Home"));
        System.out.println("______________________");


        System.out.println("results isEmpty: " + set.isEmpty());
        System.out.println("set: " + set);
        System.out.println("______________________");

        Set<String> setA = new MySet<>();
        setA.add("1");
        setA.add("2");
        setA.add("3");
        System.out.println("setA: " + setA);
        System.out.println("results addAll: " + set.addAll(setA));
        System.out.println("set after operation: " + set);
        System.out.println("______________________");

        Set<String> set2 = new MySet<>();
        set2.add("Buy");
        set2.add("One");
        set2.add("Street");
        set2.add("56");
        set2.add("Home");

        System.out.println("set: " + set);
        System.out.println("set2: " + set2);
        System.out.println("results containsAll: " + set.containsAll(set2));
        System.out.println("______________________");

        Set<Integer> set3 = new MySet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(5);
        System.out.println("set3 before removeAll: " + set3);

        Set<Integer> set4 = new MySet<>();
        set4.add(1);
        set4.add(2);
        set4.add(3);
        System.out.println("set4 to be removed: " + set4);

        set3.removeAll(set4);
        System.out.println("set3 after removeAll operation: " + set3);
    }
}

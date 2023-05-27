package com.academy.belousova.lesson11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); //Почему HashSet? Конечно эти методы будут прекрасно работать, если вызвать их на классе, описанном в JDK :)
        set.add("Welcome");
        set.add("To");
        set.add("Home");
        set.add("Street");
        set.add("4");

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

        System.out.println("results addAll: " + Collections.addAll(set, "1", "2", "3"));
        System.out.println("set after operation: " + set);
        System.out.println("______________________");

        Set<String> set2 = new HashSet<>();
        set2.add("Buy");
        set2.add("One");
        set2.add("Street");
        set2.add("56");
        set2.add("Home");

        System.out.println("set: " + set);
        System.out.println("set2: " + set2);
        System.out.println("results containsAll: " + set.containsAll(set2));
        System.out.println("______________________");

        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(5);
        System.out.println("set3 before removeAll: " + set3);

        Set<Integer> set4 = new HashSet<>();
        set4.add(1);
        set4.add(2);
        set4.add(3);
        System.out.println("set4 to be removed: " + set4);

        set3.removeAll(set4);
        System.out.println("set3 after removeAll operation: " + set3);
    }
}

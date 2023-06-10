package com.academy.belousova.lesson11;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new MyList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("1011");
        list.add("1314");

        list.remove(1);
        String s = list.get(1);
        list.set(2, "1617");
        list.add(3, "1920");
//        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        List<String> list2 = new MyList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");

        System.out.println(list2);
        System.out.println(list.addAll(list2));
        System.out.println("list after operation: " + list);
    }
}
package com.academy.belousova.lesson11;

import java.util.Collections;
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

        boolean b = Collections.addAll(list, "1", "2", "3"); //addAll должен проверяться на твоем объкте list.addAll().
        System.out.println("result: " + b);
        System.out.println("list after operation: " + list);
    }
}

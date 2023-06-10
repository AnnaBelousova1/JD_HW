package com.academy.belousova.lesson12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите слова: ");
        while (true) {
            String s = scanner.nextLine();

            if (s.equalsIgnoreCase("end")) {
                break;
            } else {
                list.add(s);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list)
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        System.out.println(map);
    }
}

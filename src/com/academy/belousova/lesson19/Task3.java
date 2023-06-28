package com.academy.belousova.lesson19;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        System.out.println("myList " + myList);

        //1. Удалить все содержащие “3”
        System.out.println("Example 1: ");

        List<String> delList = myList.stream()
                .filter((s) -> !s.contains("3"))
                .toList();
        System.out.println(delList);


        //2. Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
        System.out.println("Example 2: ");

        List<String> sortedList = delList.stream()
                .sorted()
                .toList();
        System.out.println(sortedList);

        System.out.println("________________________");

        List<String> sortedList2 = sortedList.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedList2);


        //3. Отбросить первый и последний элемент
        System.out.println("Example 3: ");

        List<String> delete = sortedList2.stream()
                .skip(1)
                .limit(4)
                .toList();
        System.out.println(delete);


        //4. Привести в uppercase
        System.out.println("Example 4: ");

        List<String> upperCase = delete.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCase);


        //5. Выдать на печать результат
        System.out.println("Example 5: ");

        System.out.println(upperCase);


        //6. Напечатать количество оставшихся элементов
        System.out.println("Example 6: ");

        List<String> balance = myList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(balance);

        balance.removeAll(upperCase);
        System.out.println(balance);
    }
}

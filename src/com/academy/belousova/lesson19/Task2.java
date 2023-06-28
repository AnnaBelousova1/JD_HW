package com.academy.belousova.lesson19;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Task2 {
    public static void main(String[] args) {
        Collection<Integer> col = Arrays.asList(1, 5, 9, 4, 7, 10);

        //1. найти минимальное число
        System.out.println("Example 1: ");

        Optional<Integer> minNumber = col.stream()
                .min(Integer::compareTo);
        System.out.println(minNumber.orElse(0));


        //2. найти максимальное число
        System.out.println("Example 2: ");

        Optional<Integer> maxNumber = col.stream()
                .max(Integer::compareTo);
        System.out.println(maxNumber.orElse(0));


        //3. найти среднее арифметическое чисел
        System.out.println("Example 3: ");

        double average = col.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(average);


        //4. найти произведение всех чисел
        System.out.println("Example 4: ");

        BinaryOperator<Integer> mulOperator = (a, b) -> a * b;
        int mul = col.stream()
                .reduce(mulOperator)
                .orElse(0);
        System.out.println(mul);


        //5. найти сумму всех чисел
        System.out.println("Example 5: ");

        int sum = col.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);


        //6. найти сумму всех цифр
        System.out.println("Example 6: ");

        int sumDig = String.valueOf(col)
                .chars()
                .filter(Character::isDigit)
                .map(a -> Character.digit(a, 10))
                .sum();
        System.out.println(sumDig);
    }
}

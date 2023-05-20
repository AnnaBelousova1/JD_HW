package com.academy.belousova.lesson9;

import java.util.Objects;

public class Task3 {
    public static void main(String[] args) {
        GenCons<Integer> test1 = new GenCons<>(100);
        GenCons<Integer> test2 = new GenCons<>(100);
        System.out.println(test1.strEqual(test2.getVal()));

        GenCons<Float> test3 = new GenCons<>(123.5F);
        GenCons<Long> test4 = new GenCons<>(76L);
        System.out.println(test3.strEqual(Float.valueOf(test4.getVal())));

        GenCons<Double> test5 = new GenCons<>(10.25);
        GenCons<Double> test6 = new GenCons<>(18.45);
        System.out.println(test5.strEqual(test6.getVal()));

    }
}

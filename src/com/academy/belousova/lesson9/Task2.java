package com.academy.belousova.lesson9;

public class Task2 {

    public static void main(String[] args) {
        Pair<String, Integer> foo = new Pair<>("Alina", 98);

        System.out.println("Первый элемент: " + foo.getFirst());
        System.out.println("Второй элемент: " + foo.getSecond());
        System.out.println("_________________________");


        var bar = Pair.pair(foo);
        var baz = bar.swap();

        System.out.println("foo: " + foo);
        System.out.println("bar: " + bar);
        System.out.println("baz: " + baz);
        System.out.println("_________________________");

        Pair<Integer, Integer> foo2 = new Pair<>(23, 54);
        System.out.println("foo2: " + foo2);
        foo2.replaceFirst(30);
        System.out.println("foo2: " + foo2);
        System.out.println("_________________________");

        foo2.replaceSecond(64);
        System.out.println("foo2: " + foo2);

    }
}

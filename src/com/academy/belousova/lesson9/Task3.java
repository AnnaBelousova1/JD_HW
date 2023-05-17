package com.academy.belousova.lesson9;

public class Task3 {
    public static void main(String[] args) {
        GenCons test1 = new GenCons(100);
        Double test2 = 125.4;
        System.out.println(test1.strEqual(test2)); //реализация не верная. длина числа 100 - 3 символа, 125.4 - 5 символов. как тут может быть true?

        GenCons test3 = new GenCons(123.5F);
        Long test4 = 76L;
        System.out.println(test3.strEqual(test4));

    }
}

package com.academy.belousova.lesson9;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        GenericArray<Integer> integerGenericArray = new GenericArray<>(new Integer[]{12, 45, 84, 2, 0, 65});
        System.out.println(integerGenericArray.getArrayIndex(10));

        GenericArray<Long> longGenericArray = new GenericArray<>(new Long[]{526L, 52L, 486L, 7775L});
        System.out.println(longGenericArray.getArrayIndex(3));

    }
}



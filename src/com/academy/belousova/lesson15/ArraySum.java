package com.academy.belousova.lesson15;

import java.util.Arrays;

public class ArraySum implements Runnable {
    private int[] array;

    public ArraySum(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println("Сумма всех элементов массива " + Arrays.toString(getArray()) + " = " + sum(array));
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}

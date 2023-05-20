package com.academy.belousova.lesson9;

public class GenCons<T> {
    private T val;

    public <V extends Number> GenCons(T val) {
        this.val = val;
    }

    public <V extends Number> boolean strEqual(T value) {
        int str1 = val.toString().length();
        int str2 = value.toString().length();
        System.out.println(str1);
        System.out.println(str2);
        return str1 == str2;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}

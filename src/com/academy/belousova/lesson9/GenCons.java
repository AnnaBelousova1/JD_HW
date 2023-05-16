package com.academy.belousova.lesson9;

import com.academy.belousova.lesson7.Document;

import java.util.Objects;

public class GenCons {
    private double val;
    <T extends Number> GenCons(T arg) {
        val = arg.doubleValue();
    }

    public <T extends Number> boolean strEqual(T arg) {
        int str1 = Double.toString(val).length();
        int str2 = arg.toString().length();
        return str1 == str2;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }
}

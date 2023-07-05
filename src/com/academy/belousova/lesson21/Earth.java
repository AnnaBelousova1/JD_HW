package com.academy.belousova.lesson21;

public class Earth {
    private static Earth instance;
    public String value;

    private Earth(String value) {
        this.value = value;
    }

    public static Earth getInstance(String value) {
        if (instance == null) {
            synchronized (Earth.class) {
                if (instance == null) {
                    instance = new Earth(value);
                }
            }
        }
        return instance;
    }
}

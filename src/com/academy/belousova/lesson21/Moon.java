package com.academy.belousova.lesson21;

public class Moon {
    private static Moon instance;
    public String value;

    private Moon(String value) {
        this.value = value;
    }

    public static Moon getInstance(String value) {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Moon(value);
                }
            }
        }
        return instance;
    }
}

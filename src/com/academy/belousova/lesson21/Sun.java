package com.academy.belousova.lesson21;

public class Sun {
    private static Sun instance;
    public String value;

    private Sun(String value) {
        this.value = value;
    }

    public static Sun getInstance(String value) {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun(value);
                }
            }
        }
        return instance;
    }
}

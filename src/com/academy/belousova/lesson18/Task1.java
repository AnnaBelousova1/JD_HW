package com.academy.belousova.lesson18;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Task1 {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;

        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            if (!Modifier.isStatic(method.getModifiers())) {
                System.out.println(method.getName());
            }
        }
    }
}


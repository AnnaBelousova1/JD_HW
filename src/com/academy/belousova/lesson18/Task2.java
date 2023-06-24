package com.academy.belousova.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Math> mathClass = Math.class;
        printMath(mathClass);
    }

    public static void printMath(Class<Math> mathClass) {
        Field[] fields = mathClass.getDeclaredFields();
        System.out.println("Все публичные поля класса Math:");
        System.out.println("_______________________________");

        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(field.getModifiers())) {
                System.out.println(Modifier.toString(modifiers) + " " + field.getType() + " " + field.getName());
            }
        }

        System.out.println();

        Method[] methods = mathClass.getDeclaredMethods();
        System.out.println("и публичные методы стандартного класса Math:");
        System.out.println("____________________________________________");

        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println(Modifier.toString(modifiers) + " " + method.getReturnType() + " " +
                        method.getName() + " " + Arrays.toString(method.getParameterTypes()));
            }
        }
    }
}

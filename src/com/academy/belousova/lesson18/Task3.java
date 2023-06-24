package com.academy.belousova.lesson18;

import java.lang.reflect.*;
import java.util.LinkedList;

import static java.lang.System.out;

public class Task3 {
    private static final String fmt = "%24s: %s%n";

    public static void main(String[] args) {
        Class<LinkedList> linkedList = LinkedList.class;

        Field[] fields = linkedList.getDeclaredFields();
        out.println("Все поля класса LinkedList:");
        out.println("___________________________");

        for (Field field : fields) {
            out.format("%s%n", field.toGenericString());
            out.format(fmt, "ReturnType", field.getType());
            out.format(fmt, "GenericReturnType", field.getGenericType());
        }

        out.println();

        Class<? super LinkedList> superClass = linkedList.getSuperclass();
        out.println("Родительский класс LinkedList:");
        out.println("______________________________");
        out.println(superClass);

        out.println();

        Method[] methods = linkedList.getDeclaredMethods();
        out.println("Все методы класса LinkedList:");
        out.println("_____________________________");
        for (Method method : methods) {
            out.format("%s%n", method.toGenericString());
            out.format(fmt, "ReturnType", method.getReturnType());
            out.format(fmt, "GenericReturnType", method.getGenericReturnType());

            Class<?>[] pType = method.getParameterTypes();
            Type[] gpType = method.getGenericParameterTypes();
            for (int i = 0; i < pType.length; i++) {
                out.format(fmt, "ParameterType", pType[i]);
                out.format(fmt, "GenericParameterType", gpType[i]);
            }
        }

        out.println();

        Constructor<?>[] constructors = linkedList.getDeclaredConstructors();
        out.println("Конструкторы класса LinkedList:");
        out.println("_______________________________");

        for (Constructor<?> constructor : constructors) {
            out.format("%s%n", constructor.toGenericString());
            out.format("      [ synthetic=%-5b var_args=%-5b ]%n", constructor.isSynthetic(), constructor.isVarArgs());

            Class<?>[] pType = constructor.getParameterTypes();
            Type[] gpType = constructor.getGenericParameterTypes();
            for (int i = 0; i < pType.length; i++) {
                out.format(fmt, "ParameterType", pType[i]);
                out.format(fmt, "GenericParameterType", gpType[i]);
            }
        }

        out.println();

        Class<?>[] classes = linkedList.getDeclaredClasses();
        out.println("Информация о внутренних классах класса LinkedList:");
        out.println("__________________________________________________");

        for (Class<?> cls : classes) {
            if (!Modifier.isStatic(cls.getModifiers())) {
                out.format(fmt, "inner/внутренний class", cls);
            } else {
                out.format(fmt, "nested/вложенный class", cls);
            }
        }
    }
}

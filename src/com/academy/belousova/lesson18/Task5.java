package com.academy.belousova.lesson18;

import java.lang.reflect.Method;

public class Task5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> bean = Bean.class;

        @SuppressWarnings("deprecation")
        Object object = bean.newInstance();
        process(object);
    }

    public static void process(Object obj) {
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Param.class)) {
                Param annotation = method.getAnnotation(Param.class);
                int a = annotation.a();
                int b = annotation.b();

                try {
                    Object result = method.invoke(obj, a, b);
                    if (method.isAnnotationPresent(Param.class)) {
                        System.out.println("Result: " + result);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
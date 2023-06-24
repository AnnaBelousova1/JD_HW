package com.academy.belousova.lesson18;

public class CallOld {
    @SuppressWarnings("deprecation")
    public static void call() {
        TestAnnotation testAnnotation = new TestAnnotation();
        System.out.println(testAnnotation.old("Testing text"));
    }
}

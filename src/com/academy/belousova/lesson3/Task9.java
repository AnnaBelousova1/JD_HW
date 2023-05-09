package com.academy.belousova.lesson3;

/*
Еще раз выполните задачу 2. В непосредственно Вашем коде
не должно использоваться более 1 цикла.
 */

public class Task9 {
    public static void main(String[] args) {
        String str = "0123456789";

        for (int n = 1; n < 5; n++) {
            System.out.print(str.replaceAll("(.)", "$1".repeat(n)));
        }
    }
}

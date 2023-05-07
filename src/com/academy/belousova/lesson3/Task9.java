package com.academy.belousova.lesson3;

/*
Еще раз выполните задачу 2. В непосредственно Вашем коде
не должно использоваться более 1 цикла.
 */

public class Task9 {
    public static void main(String[] args) {
        String str = "0123456789";
        int n = 1;

        StringBuilder repeat = new StringBuilder();
        while (n < 5) {
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < n; j++) {
                    repeat.append(str.charAt(i));
                }
            }
            n++;
        }
        System.out.println(repeat);
    }
}


package com.academy.belousova.lesson18;

public class Bean {

    @Param(a = 7, b = 4)
    public double sum(int a, int b) {
        System.out.println("Method sum running");

        return a + b;
    }

    @Param(a = 1, b = 9)
    public double max(int a, int b) {
        System.out.println("Method max running");

        return Math.max(a, b);
    }

    @Param(a = 6, b = 2)
    public double min(int a, int b) {
        System.out.println("Method min running");

        return Math.min(a, b);
    }

    public double avg(int a, int b) {
        System.out.println("Method avg running");

        return (double) (a + b) / 2;
    }
}











// System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);
//        System.out.println("__________________________________________");



// if (a < b) {
//            return max;
//        } else {
//            return max;
//        }

// System.out.println("Максимальное число между " + a + " и " + b + " равно " + max);
// System.out.println("Максимальное число между " + a + " и " + b + " равно " + max);
//  System.out.println("______________________________________________________");



// System.out.println("Минимальное число между " + a + " и " + b + " равно " + min);
//   System.out.println("Минимальное число между " + a + " и " + b + " равно " + min);
// System.out.println("______________________________________________________");


//  System.out.println("Среднее арифметическое чисел " + a + " и " + b + " равно " + avg);
//        System.out.println("______________________________________________________");









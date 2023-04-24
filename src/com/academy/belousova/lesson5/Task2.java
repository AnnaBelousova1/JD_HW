package com.academy.belousova.lesson5;

public class Task2 {
    public static void main(String[] args) {
        int value = 2;
        Fraction fraction1 = new Fraction(4, 7);
        Fraction fraction2 = new Fraction(5, 9);

        fraction1.fraction();
        fraction2.fraction();

        System.out.println("Сумма двух дробей = " + fraction1.sum(fraction2));
        System.out.println("Умножение на число = " + fraction1.mul(value));
        System.out.println("Деление на число = " + fraction1.div(value));
    }
}

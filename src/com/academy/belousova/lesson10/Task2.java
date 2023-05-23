package com.academy.belousova.lesson10;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stop = "END";
        String s = "";
        double sum = 0;
        double sqrt;


        do {
            System.out.println("Введите данные: ");
            s = sc.nextLine();
            try {
                if (!s.equals(stop)) {
                    double i = Double.parseDouble(s);
                    System.out.println(i);

                    if (i > 0) {
                        sum += i;
                        sqrt = Math.sqrt(sum);

                        System.out.println("Сумма введеных данных равна: " + sum);
                        System.out.println("Корень суммы равен: " + sqrt);
                    }

                    if (i == 0) throw new ArithmeticException("Деление на 0.");
                    if (i < 0) throw new ArithmeticException("Невозможно извлечь корень.");
                }
            } catch (NumberFormatException | ArithmeticException e) {
                System.out.println("перехвачено исключение " + e.getClass());
            }

        } while (!s.equals(stop));
    }
}






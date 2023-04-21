package com.academy.belousova.lesson4;

/*
Напишите метод, сортирующий массив. Выберите любой понравившийся алгоритм.
(Постарайтесь не пользоваться подсказками из интернета)
 */
public class Task4 {
    public static void main(String[] args) {

        int[] array = {8, 5, 9, 65, 1, 0, 74, 96};

        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array) {
        boolean swap;
        int size = array.length - 1;
        do {
            swap = false;
            for (int i = 0; i < size; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    swap = true;
                }
            }
            size--;
        } while (swap);
    }
}
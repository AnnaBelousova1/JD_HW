package com.academy.belousova.lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Man viktor = new Man("Viktor", 25, "M", 85);
        Man jon = new Man("Jon", 34, "M", 75);
        Man linda = new Man("Linda", 18, "W", 45);


        Student luda = new Student("Luda", 25, "W", 45, 2023);
        Student bob = new Student("Bob", 45, "M", 75, 2000);
        Student rebecca = new Student("Rebecca", 35, "W", 65, 2017);
        Student[] students = {luda, bob, rebecca};


        bob.display();


        System.out.println("Введите год обучения студента ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        luda.getYear(year);


        Man newMan = (Student) rebecca;

    }
}
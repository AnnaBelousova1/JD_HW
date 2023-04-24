package com.academy.belousova.lesson5;

import java.util.Scanner;

public class StudentManager {
    public void main(String[] args) {

    }

    public void getCourse(Student[] students) {
        System.out.println("Введите курс от 1 до 5: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (Student student : students)
            if (student.getCourse() == num)
                System.out.println(student.getName() + " " + student.getFaculty() + " " + student.getGroup());
    }

    public void getYear(Student[] students) {
        System.out.println("Введите год рождения: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println("Списки студентов после заданного года: ");
        for (Student student : students)
            if (student.getYear() > year)
                System.out.println(student.getName() + " " + student.getYear() + " " + student.getFaculty());
    }
}

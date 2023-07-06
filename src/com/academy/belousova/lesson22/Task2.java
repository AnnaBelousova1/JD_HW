package com.academy.belousova.lesson22;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IllegalAccessException {
        Student anna = new Student(1, "Anna", "Экономика", 3, 4525, 1995);
        Student viktor = new Student(2, "Viktor", "Юриспрюденция", 3, 4654, 2000);
        Student viki = new Student(3, "Viki", "Информатика", 5, 4585, 1985);
        Student jon = new Student(4, "Jon", "Лингвистика", 2, 4412, 2007);
        Student elena = new Student(5, "Elena", "Экономика", 3, 4525, 1995);
        Student bill = new Student(6, "Bill", "Экономика", 3, 4525, 1996);
        Student mik = new Student(7, "Mik", "Иностранные языки", 5, 4116, 1987);
        Student dik = new Student(8, "Dik", "Экономика", 1, 4523, 1993);
        Student dima = new Student(9, "Dima", "Экономика", 3, 4525, 1995);
        Student hellen = new Student(10, "Hellen", "Информатика", 4, 4210, 1980);

       Student[] array = new Student[10];
        array[0] = anna;
        array[1] = viktor;
        array[2] = viki;
        array[3] = jon;
        array[4] = elena;
        array[5] = bill;
        array[6] = mik;
        array[7] = dik;
        array[8] = dima;
        array[9] = hellen;


        bill.hello();
        System.out.println("________________________________________");

        StudentManager studentManager = new StudentManager();

        System.out.println("Введите номер курса: ");
        Scanner sc = new Scanner(System.in);
        int course = sc.nextInt();
        System.out.println("Студенты с курса номер " + course + ": ");
        studentManager.getCourse(array, course);
        System.out.println("________________________________________");


        System.out.println("Введите год рождения: ");
        int year = sc.nextInt();
        System.out.println("Списки студентов после " + year + " года рождения: ");
        studentManager.getYear(array, year);

    }
}

package com.academy.belousova.lesson5;

import java.util.Scanner;

public class StudentManager {
    public void main(String[] args) { // зачем он тут? :)

    }

    public void getCourse(Student[] students) { // курс надо принять в качестве параметра. считать с консоли можно в main()
        System.out.println("Введите курс от 1 до 5: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (Student student : students)
            if (student.getCourse() == num)
                System.out.println(student.getName() + " " + student.getFaculty() + " " + student.getGroup());
    }

    public void getYear(Student[] students) { //то же, что и для курса.
        System.out.println("Введите год рождения: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println("Списки студентов после заданного года: ");
        for (Student student : students)
            if (student.getYear() > year)
                System.out.println(student.getName() + " " + student.getYear() + " " + student.getFaculty());
    }
}

/*
идея в том, что возможно клиентский код(тот, который вызывает эти методы)
захочет передать свои значения курса и года, а не читать их с консоли.
тогда придется переписывать методы. лучше принять значения в качестве параметра,
а вот уже значение этого параметра запросить у клиентского кода.
 */

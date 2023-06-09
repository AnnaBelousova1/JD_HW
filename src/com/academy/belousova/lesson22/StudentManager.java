package com.academy.belousova.lesson22;

public class StudentManager {
    public void getCourse(Student[] students, int course) {

        if (course < 1 || course > 5) {
            throw new IndexOutOfBoundsException("Такого курса не существует!");

        } else {

            for (Student student : students) {
                if (student.getCourse() == course) {
                    System.out.println(student.getName() + " " + student.getFaculty() + " " + student.getGroup());
                }
            }
        }
    }


    public void getYear(Student[] students, int year) {
        for (Student student : students) {
            if (student.getYear() > year) {
                System.out.println(student.getName() + " " + student.getYear() + " " + student.getFaculty());
            }
        }
    }
}


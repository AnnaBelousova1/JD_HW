package com.academy.belousova.lesson6;


public class Student extends Man {

    private int yearOfStudy;

    public Student() {

    }


    public Student(String name, int age, String sex, double weight, int yearOfStudy) {
        super(name, age, sex, weight);
        this.yearOfStudy = yearOfStudy;
    }

    public void getYear(int year) {
        if (this.getYearOfStudy() > year) {
            System.out.println("Год введен некорректно!");
        } else if (this.getYearOfStudy() < year) {
            System.out.println(year);
        }
    }


    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
}

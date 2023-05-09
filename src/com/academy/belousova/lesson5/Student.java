package com.academy.belousova.lesson5;

public class Student {
    private int id;
    private String name;
    private String faculty;
    private int course;
    private int group;
    private int year;

    public Student(int id, String name, String faculty, int course, int group, int year) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        if (course < 1 || course > 5) {
            System.out.println("Такого курса не существует!");
        } else {
            this.course = course;
        }
        this.group = group;
        this.year = year;
    }

    public void hello() {
        System.out.println("Привет. Меня зовут - " + getName());
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        if (course < 1 || course > 5) {
            System.out.println("Такого курса не существует!");
        } else {
            this.course = course;
        }
    }

    public int getGroup() {
        return this.group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

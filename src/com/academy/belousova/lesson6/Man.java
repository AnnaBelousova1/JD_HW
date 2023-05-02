package com.academy.belousova.lesson6;


public class Man {
    private String name;
    private int age;
    private String sex;
    private double weight;

    public Man() {

    }

    public Man(String name, int age, String sex, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public void display() {
        System.out.println("Имя: " + getName() + " Пол: " + getSex() + " Возраст: " +
                getAge() + " Вес: " + getWeight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

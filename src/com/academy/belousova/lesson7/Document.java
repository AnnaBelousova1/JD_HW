package com.academy.belousova.lesson7;

public class Document implements Printable, Cloneable, Comparable {
    String name;
    int number;

    public Document(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) { // а hashCode где? :)
        if (this == o) {
            return true;
        }
        Document d;
        if (!(o instanceof Document)) {
            return false;
        } else {
            d = (Document) o;
        }
        return this.number == d.number && this.name.equals(d.name);
    }

    @Override
    public int compareTo(Object o) {
        Document d;
        if (!(o instanceof Document)) {
            return -1;
        } else {
            d = (Document) o;
        }
        return number - d.number;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void print() {
        System.out.println("Документ отправлен на печать.");
    }

    public String toString() {
        return this.name + "-" + this.number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

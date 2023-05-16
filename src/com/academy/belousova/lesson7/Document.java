package com.academy.belousova.lesson7;

import java.util.Objects;

public class Document implements Printable, Cloneable, Comparable<Document> {
    private String name;
    private int number;
//    boolean relevance;

    public Document(String name, int number) {
        this.name = name;
        this.number = number;
//        this.relevance = relevance;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + number;
        result = result * prime + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) {
            return true;
        }
        Document d;
        if (!(o instanceof Document)) {
            return false;
        } else {
            d = (Document) o;
        }
        return this.number == d.number && Objects.equals(this.name, d.name);
    }

    @Override
    public int compareTo(Document o) {
        return this.number - o.number;
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

        //    public boolean isRelevance() {
//        return relevance;
//    }
//
//    public void setRelevance(boolean relevance) {
//        this.relevance = relevance;
//    }
    }
}

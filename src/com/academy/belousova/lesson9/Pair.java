package com.academy.belousova.lesson9;

public class Pair<T, V> {
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public void replaceFirst(T first) {
        setFirst(first);
        System.out.println("Заменяем первый элемент на новый: " + getFirst());
    }

    public void replaceSecond(V second) {
        setSecond(second);
        System.out.println("Заменяем второй элемент на новый: " + getSecond());
    }

    @Override
    public String toString() {
        return "Pair: first(" + first.getClass() + ")=" + first + "; second(" + second.getClass() + ")=" + second;
    }

    public static <T, V> Pair<V, T> pair(Pair<T, V> item) {
        return new Pair<>(item.second, item.first);
    }

    public Pair<V, T> swap() {
        return new Pair<>(this.second, this.first);
    }


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }
}

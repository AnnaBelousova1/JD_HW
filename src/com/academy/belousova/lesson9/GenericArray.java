package com.academy.belousova.lesson9;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getArrayIndex(int i) {
        if (i < 0 || i >= array.length) {
            return null;
        }
        return array[i];
    }

    public int getLength() {
        return array.length;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }
}


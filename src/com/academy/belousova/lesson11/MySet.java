package com.academy.belousova.lesson11;

import java.util.*;

/*
 Напишите класс MySet<T>, который реализует методы add(T e), remove(Object o),
 contains(Object o), size(), isEmpty(), addAll(List<?> c), containsAll(Collection<?> c),
 removeAll(Collection<?> c) , toString()  интерфейса Set<T> (реализация остальных – фиктивная).
 */

public class MySet<T> implements List<T> {

    private T[] elements = (T[]) new Object[]{};
    private int size;

    @Override
    // Добавляет элемент в множество, если его еще нет. Возвращает true,
    // если элемент успешно добавлен, и false, если элемент уже присутствовал в множестве.
    public boolean add(T t) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 3 / 2 + 1);
        }
        elements[size++] = t;
        return true;
    }

    private void shiftToLeft(int start) {
        size--;
        if (size <= 0) {
            return;
        }
        if (size != start) {
            System.arraycopy(elements, start + 1, elements, start, size - start);
        }
        elements[size] = null;
    }


    @Override
    // Удаляет элемент из множества, если он присутствует. Возвращает true,
    // если элемент был успешно удален, и false, если он не был найден.
    public boolean remove(Object o) {
        if ((size == 0)) {
            return false;
        }
        int i;
        for (i = 0; i < size; i++) {
            if (elements[i] == null && o == null) {
                break;
            }
            if ((elements[i] != null) && (elements[i].equals(o))) {
                break;
            }
        }
        if (i < size) {
            shiftToLeft(i);
            return true;
        }
        return false;
    }

    @Override
    // Проверяет, содержится ли элемент в множестве.
    // Возвращает true, если элемент присутствует, и false, если его нет.
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    // возвращает количество элементов в множестве.
    public int size() {
        return this.size;
    }

    @Override
    // Проверка наличия элементов. Возвращает true, если множество не содержит элементов,
    // и false, если множество содержит хотя бы один элемент.
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    // Добавляет все элементы из коллекции c в данную коллекцию.
    public boolean addAll(Collection<? extends T> c) {
        if (c == null) {
            return false;
        }
        if (c.isEmpty()) {
            return false;
        }
        for (Object element : c) {
            add((T) element);
        }
        return true;
    }

    @Override
    // Проверяет, содержит ли коллекция все элементы из заданной коллекции c.
    // Возвращает true, если все элементы содержатся в наборе.
    public boolean containsAll(Collection<?> c) {
        if (c == null) {
            return false;
        }
        if (c.size() == 0) {
            return true;
        }
        for (Object e : c) {
            if (contains(e)) {
                ;
            } else {
                return false;
            }
        }
        return true;
    }

    @Override
    // Удаляет из коллекции все элементы, содержащиеся в заданной коллекции c.
    public boolean removeAll(Collection<?> c) {
        if (c == null) {
            return false;
        }
        if ((c.size() == 0) || size == 0) {
            return false;
        }
        boolean modified = false;
        int i = 0;
        while (i < size) {
            if (c.contains(elements[i])) {
                shiftToLeft(i);
                modified = true;
            } else {
                i++;
            }
        }
        return modified;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String separator = "";
        for (int i = 0; i < size; i++) {
            sb.append(separator).append(elements[i]);
            separator = ", ";
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

package com.academy.belousova.lesson13;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) throws Notepad.DateIsNotPossibleException {
        Map<String, Notepad.Note> map= new TreeMap<>(); // в задании: Создайте класс Notepad(записная книжка), который хранит в себе отсортированный ассоциативный массив Map<String, Note>.
        //карта должна храниться в классе Notepad. тогда и сигнатуры методов совпадут с теми, что в задании
        map.put("10-05-2023", new Notepad.Note("Овечкин")); //конвертацией стринга в ноут тоже должен заниматься объект класса Notepad
        map.put("28-05-2023", new Notepad.Note("Петров"));
        map.put("13-05-2023", new Notepad.Note("Иванов"));
        map.put("03-05-2023", new Notepad.Note("Сидоров"));
        map.put("28-01-2022", new Notepad.Note("Сидоров")); // а если такую дату добавить, то правильно отсортируется?

        Notepad noteApp = new Notepad();
        noteApp.addNote("10-05-2023", "Иванов", map);
        noteApp.addNote("25-01-2023", "Сидоров", map);
        noteApp.addNote("25-01-2023", "Петров", map);
        noteApp.addNote("25-01-2023", "Петров", map); //я добавил дубликат, но исключение не возникло

        for (Map.Entry<String, Notepad.Note> next: map.entrySet()) {
            System.out.println(next.getKey() + " - " + next.getValue());
        }

        System.out.println(noteApp.getNote("28-05-2023", map));

        System.out.println(noteApp.getAllNotes(map));

    }
}

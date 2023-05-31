package com.academy.belousova.lesson13;

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) throws Notepad.DateIsNotPossibleException {
        Map<String, Notepad.Note> map= new TreeMap<>();
        map.put("10-05-2023", new Notepad.Note("Овечкин"));
        map.put("28-05-2023", new Notepad.Note("Петров"));
        map.put("13-05-2023", new Notepad.Note("Иванов"));
        map.put("03-05-2023", new Notepad.Note("Сидоров"));


        Notepad noteApp = new Notepad();
        noteApp.addNote("10-05-2023", "Иванов", map);
        noteApp.addNote("25-01-2023", "Сидоров", map);
        noteApp.addNote("25-01-2023", "Петров", map);

        for (Map.Entry<String, Notepad.Note> next: map.entrySet()) {
            System.out.println(next.getKey() + " - " + next.getValue());
        }

        System.out.println(noteApp.getNote("28-05-2023", map));

        System.out.println(noteApp.getAllNotes(map));

    }
}

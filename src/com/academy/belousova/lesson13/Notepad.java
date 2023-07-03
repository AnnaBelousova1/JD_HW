package com.academy.belousova.lesson13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Notepad {
    private String date;


    public Notepad(String date) { //конструктор описан, но нигде и ни откуда не вызывается
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
             Date dt = format.parse(this.date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.date = date;
    }

    public Notepad() {

    }

    public static class Note {

        private String surname;

        public Note(String surname) {
            this.surname = surname;
        }


        public Note(String date, String lastName) {

        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void add(Note note) {
        }

        @Override
        public String toString() {
            return this.surname;
        }
    }


    public void addNote(String date, String lastName, Map<String, Note> map) throws DateIsNotPossibleException {
        Note note = new Note(date, lastName);

        try {
            if (map.containsKey(date)) {
                throw new DateIsNotPossibleException();
            } else {
                note.add(note);
            }
        } catch (DateIsNotPossibleException e) {
            System.out.println("запись на эту дату невозможна");
        }
    }

    public Note getNote(String date, Map<String, Note> map) {
        return map.get(date);
    }

    public List<Note> getAllNotes(Map<String, Note> map) {
        List<Note> list = new ArrayList<>(map.values());
        Collections.reverse(list);
        return list;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    static class DateIsNotPossibleException extends Throwable {
        public DateIsNotPossibleException() {
            System.out.println("введите другую дату");
        }
    }
}

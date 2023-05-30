package com.academy.kopats.lesson13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Notepad {
    private String date;

    public Notepad() {
    }

    public Notepad(String date) {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd-MM-yyyy");
        try {
            Date docDate = format.parse(this.date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.date = date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void addNote(String date, String lastName, TreeMap<String, Note> noteMap) throws DateIsNotPossibleException {
        Note note = new Note(lastName);
        try {
            if (noteMap.containsKey(date)) {
                throw new DateIsNotPossibleException();
            } else {
                noteMap.put(date, note);
            }
        } catch (DateIsNotPossibleException e) {
            System.out.println("Запись на дату " + date + " невозможна");
            ;
        }
    }

    public Note getNote(String date, TreeMap<String, Note> noteMap) {
        return noteMap.get(date);
    }

    public List<Note> getAllNotes(TreeMap<String, Note> noteMap) {
        List<Note> list = new LinkedList<>(noteMap.values());
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


    static class Note {
        private String surname;

        public Note(String surname) {
            this.surname = surname;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return this.surname;
        }
    }
}
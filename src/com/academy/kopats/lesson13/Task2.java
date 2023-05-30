package com.academy.kopats.lesson13;

import java.util.*;

public class Task2 {
    public static void main(String[] args) throws DateIsNotPossibleException {
        TreeMap<String, Notepad.Note> notepad1 = new TreeMap<>();
        notepad1.put("29-05-2023", new Notepad.Note("Иванов"));
        notepad1.put("20-05-2023", new Notepad.Note("Петров"));
        notepad1.put("13-05-2023", new Notepad.Note("Смирнова"));
        notepad1.put("24-05-2023", new Notepad.Note("Поляк"));
        notepad1.put("05-05-2023", new Notepad.Note("Белова"));
        notepad1.put("11-05-2023", new Notepad.Note("Таранко"));

        Notepad notepad = new Notepad();
        notepad.addNote("15-05-2023", "Воробей", notepad1);
        notepad.addNote("18-05-2023", "Гертель", notepad1);
        for (Map.Entry<String, Notepad.Note> next : notepad1.entrySet()) {
            System.out.println(next.getKey() + " - " + next.getValue());
        }

       System.out.println(notepad.getNote("13-05-2023", notepad1));

        System.out.println(notepad.getAllNotes(notepad1));
    }
}

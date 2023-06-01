package com.academy.kopats.lesson13;

import java.util.*;

public class Task2 {
    public static void main(String[] args) throws DateIsNotPossibleException {
        TreeMap<String, Notepad.Note> notepad1 = new TreeMap<>(); // в задании: Создайте класс Notepad(записная книжка), который хранит в себе отсортированный ассоциативный массив Map<String, Note>.
        //карта должна храниться в классе Notepad. тогда и сигнатуры методов совпадут с теми, что в задании
        notepad1.put("29-05-2023", new Notepad.Note("Иванов")); //конвертацией стринга в ноут тоже должен заниматься объект класса Notepad
        notepad1.put("20-05-2023", new Notepad.Note("Петров"));
        notepad1.put("13-05-2023", new Notepad.Note("Смирнова"));
        notepad1.put("24-05-2023", new Notepad.Note("Поляк"));
        notepad1.put("05-05-2023", new Notepad.Note("Белова"));
        notepad1.put("11-05-2023", new Notepad.Note("Таранко"));
        notepad1.put("28-01-2022", new Notepad.Note("Сидоров")); // а если такую дату добавить, то правильно отсортируется?

        Notepad notepad = new Notepad();
        notepad.addNote("15-05-2023", "Воробей", notepad1);
        notepad.addNote("18-05-2023", "Гертель", notepad1);
        for (Map.Entry<String, Notepad.Note> next : notepad1.entrySet()) {
            System.out.println(next.getKey() + " - " + next.getValue());
        }

        notepad.addNote("15-05-2023", "Воробей", notepad1); //я добавил дубликат, но исключение не возникло

       System.out.println(notepad.getNote("13-05-2023", notepad1));

        System.out.println(notepad.getAllNotes(notepad1));
    }
}

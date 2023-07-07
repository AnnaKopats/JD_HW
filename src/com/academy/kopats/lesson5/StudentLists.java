package com.academy.kopats.lesson5;

import java.util.*;

public class StudentLists {


    public List<String> getCourse(Student[] students, int course) {
        if (course < 1 || course > 5) {
            throw new IndexOutOfBoundsException("Нет такого курса");
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse() == course) {

               list.add(students[i].getFullName());
               // System.out.println(students[i].getFullName() + " " + students[i].getCourse() + " курс");
            }
        }
        return list;
    }

    public List<String> getYear(Student[] students, int year) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if (students[i].getYearBirth() > year) {
               list.add(students[i].getFullName());
                // System.out.println(students[i].getFullName() + " " + students[i].getYearBirth() + " г.р.");
            }
        }
        return list;
    }

}

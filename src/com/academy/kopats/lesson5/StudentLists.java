package com.academy.kopats.lesson5;

import java.util.Scanner;

public class StudentLists {


    public void getCourse(Student[] students, int course) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse() == course) {
                System.out.println(students[i].getFullName() + " " + students[i].getCourse() + " курс");
            }
        }
    }

    public void getYear(Student[] students, int year) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getYearBirth() > year) {
                System.out.println(students[i].getFullName() + " " + students[i].getYearBirth() + " г.р.");
            }
            ;
        }
    }

}

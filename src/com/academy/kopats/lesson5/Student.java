package com.academy.kopats.lesson5;

import java.util.Scanner;

public class Student {
    private int id;
    private String fullName;
    private String faculty;
    private int course;
    private String group;
    private int yearBirth;

    public Student() {

    }

    public Student(int id, String fullName, String faculty, int course, String group, int yearBirth) {
        this.id = id;
        this.fullName = fullName;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.yearBirth = yearBirth;
    }

    public void studentHello() {
        System.out.println("Привет, меня зовут " + getFullName() + "!");
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        if (course <= 1 || course >= 5) {
            System.out.println("Нет такого курса");
        } else {
            this.course = course;
        }
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getYearBirth() {
        return this.yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }


}

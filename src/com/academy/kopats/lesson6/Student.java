package com.academy.kopats.lesson6;

public class Student extends Man {

    private int yearEducation;

    public Student() {

    }

    public Student(String name, int age, String gender, int weight, int yearEducation) {
        super(name, age, gender, weight);
        this.yearEducation = yearEducation;
    }

    public int getYearEducation() {
        return yearEducation;
    }

    public void setYearEducation(int yearEducation) {
        if (yearEducation < this.yearEducation) {
            System.out.println("Ошибка!!! Неверный год обучения!");
        } else {
            System.out.println(getName() + " " + yearEducation + " год обучения");
        }
    }
}

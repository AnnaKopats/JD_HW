package com.academy.kopats.lesson5;

public class StudentYearEdu extends Student { // мы на 5-ой лекции еще не проходили наследование. да и поля такого в задании нет
    private int yearEducation;

    public int getYearEducation() {
        return yearEducation;
    }

    public StudentYearEdu(int yearEducation) {
        this.yearEducation = yearEducation;
    }

    public void setYearEducation(int yearEducation) {
        this.yearEducation = yearEducation;
    }
}

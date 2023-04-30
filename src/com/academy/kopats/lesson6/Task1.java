package com.academy.kopats.lesson6;

public class Task1 {
    public static void main(String[] args) {
        Man man1 = new Man("Кот Филлип Генрихович", 21, "муж", 74);
        Man man2 = new Man("Лоев Игорь Максимович", 20, "муж", 65);
        Man man3 = new Man("Сазонов Илья Михайлович", 24, "муж", 79);
        Student student1 = new Student("Кириллов Андрей Викторович", 22, "муж", 68, 2013);
        Student student2 = new Student("Гаврилова Анастасия Дмитриевна", 20, "жен", 52, 2015);
        Student student3 = new Student("Шолохов Роберт Казимирович", 24, "муж", 70, 2011);

        student1.setYearEducation(2005);
        System.out.println("Меня зовут: " + student2.getName() + "! Мне " + student2.getAge() + " лет, пол: " + student2.getGender() + ". Год обучения: " + student2.getYearEducation());
        student1.setYearEducation(2012);

        Man man4 = new Student();
        man4 = student3;
    }
}
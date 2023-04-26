package com.academy.kopats.lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Student student1 = new Student(102261, "Миронов Андрей Иванович", "Информатика", 5, "IT-12", 2004);
        Student student2 = new Student(151126, "Самонтов Кирилл Алексеевич", "Математика", 3, "М-23", 2002);
        Student student3 = new Student(132698, "Ярош Ангелина Андреевна", "Филологический", 1, "ФИЛ-11", 2005);
        Student student4 = new Student(101233, "Яковлева Елена Ивановна", "Экономический", 5, "Э-22", 2000);
        Student student5 = new Student(196230, "Воробей Роман Романович", "Информатика", 2, "IT-12", 2004);
        Student student6 = new Student(121581, "Радионов Алексей Валентинович", "Математика", 4, "М-12", 2001);
        Student student7 = new Student(147546, "Таранко Наталья Петровна", "Филологический", 3, "ФИЛ-08", 2001);
        Student student8 = new Student(103185, "Гертель Ирина Николаевна", "Экономический", 5, "Э-10", 1999);
        Student student9 = new Student(155478, "Осипова Елена Григорьевна", "Информатика", 1, "IT-19", 2006);
        Student student10 = new Student(133644, "Коробов Михаил Альбертович", "Информатика", 4, "М-12", 2000);
        Student[] student = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        student5.studentHello();

        StudentLists studentLists = new StudentLists();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        System.out.println("Список студентов после " + year + " года рождения:");
        studentLists.getYear(student, year);
        System.out.println();

        System.out.println("Введите номер курса:");
        int course = scanner.nextInt();
        System.out.println("Список студентов " + course + " курса:");
        studentLists.getCourse(student, course);
    }
}

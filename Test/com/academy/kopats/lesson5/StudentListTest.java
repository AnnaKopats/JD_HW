package com.academy.kopats.lesson5;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentListTest {
    Student student1 = new Student(102261, "Миронов Андрей Иванович", "Информатика", 5, "IT-12", 2004);
    Student student2 = new Student(151126, "Самонтов Кирилл Алексеевич", "Математика", 3, "М-23", 2002);
    Student student3 = new Student(132698, "Ярош Ангелина Андреевна", "Филологический", 1, "ФИЛ-11", 2005);
    Student[] students = {student1, student2, student3};

    StudentLists studentLists = new StudentLists();

    @Test
    public void getCourseTest() {
        List<String> list = new ArrayList<>();
        list.add(student1.getFullName());
        assertEquals(list, studentLists.getCourse(students, 5));
    }

    @Test
    public void getYear() {
        List<String> list = new ArrayList<>();
        list.add(student1.getFullName());
        list.add(student3.getFullName());
        assertEquals(list, studentLists.getYear(students,2003));
    }
    @Test
    public void getCourseThrowTest() {
        assertThrows(IndexOutOfBoundsException.class,()-> studentLists.getCourse(students, 6));
    }
}

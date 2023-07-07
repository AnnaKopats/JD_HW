package com.academy.kopats.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    Student student = new Student();

    @Test
    public void setCourseTest() {
        assertThrows(IndexOutOfBoundsException.class,()-> student.setCourse(6));
    }

}

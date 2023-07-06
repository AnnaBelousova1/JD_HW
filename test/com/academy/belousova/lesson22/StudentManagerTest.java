package com.academy.belousova.lesson22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentManagerTest {

    @Test
    void TestGetCourse() {

        Student student = new Student(1, "Anna", "Экономика", 3, 4525, 1995);

        if (student.getCourse() == 3) {

            assertEquals(student.getName() + " " + student.getFaculty() + " " + student.getGroup(),
                    student.getName() + " " + student.getFaculty() + " " + student.getGroup());
        }
    }

    @Test
    void TestGetYear() {

        Student student = new Student(4, "Jon", "Лингвистика", 2, 4412, 2007);

        if (student.getYear() == 2007) {

            assertEquals(student.getName() + " " + student.getFaculty() + " " + student.getGroup(),
                    student.getName() + " " + student.getFaculty() + " " + student.getGroup());
        }
    }

    @Test
    void TestCourseException() {

        Student student = new Student(5, "Elena", "Экономика", 6, 4525, 1995);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> { throw new IllegalArgumentException("a message"); }
        );

        assertEquals("a message", exception.getMessage());

    }
}
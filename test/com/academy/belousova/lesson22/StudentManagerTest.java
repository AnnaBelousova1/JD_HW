package com.academy.belousova.lesson22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentManagerTest {

    @Test
    void TestGetCourse() { //названия методов в Java пишутся с маленькой буквы

        Student student = new Student(1, "Anna", "Экономика", 3, 4525, 1995);

        if (student.getCourse() == 3) {

            /*
            конечно у тебя этот тест пройдет, что бы ты не делала, потому что и в ожидаемом и в актальном одни и те же значения

            и да, гораздо правильнее написать несколько ассертов, их может быть хоть 20, но не клеить через строчку
            ниже приведу как это можно было сделать

            и название метода можно поменять просто как testStudentEntity, к примеру.
             */

            assertEquals(1, student.getId());
            assertEquals("Anna", student.getName());
            assertEquals("Экономика", student.getName());
            assertEquals(3, student.getCourse());
            assertEquals(4525, student.getGroup());
            assertEquals(1995, student.getYear());
//            assertEquals(student.getName() + " " + student.getFaculty() + " " + student.getGroup(),
//                    student.getName() + " " + student.getFaculty() + " " + student.getGroup());
        }
    }

    @Test
    void TestGetYear() {

        Student student = new Student(4, "Jon", "Лингвистика", 2, 4412, 2007);

        if (student.getYear() == 2007) {
/*
в предыдущем пункте уже расписал
 */
            assertEquals(student.getName() + " " + student.getFaculty() + " " + student.getGroup(),
                    student.getName() + " " + student.getFaculty() + " " + student.getGroup());
        }
    }

    @Test
    void TestCourseException() {

        Student student = new Student(5, "Elena", "Экономика", 6, 4525, 1995);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> { throw new IllegalArgumentException("a message"); } //то же, что и везде
        );

        assertEquals("a message", exception.getMessage());

    }
}
package com.academy.belousova.lesson22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentManagerTest {

    @Test
    void testStudentEntity() {

        Student student = new Student(1, "Anna", "Экономика", 3, 4525, 1995);
        Student student1 = new Student(5, "Elena", "Экономика", 2, 4525, 1995);
        Student student2 = new Student(6, "Bill", "Экономика", 3, 4525, 1996);

            assertEquals(1, student.getId());
            assertEquals("Anna", student.getName());
            assertEquals("Экономика", student.getFaculty());
            assertEquals(3, student.getCourse());
            assertEquals(4525, student.getGroup());
            assertEquals(1995, student.getYear());

            assertEquals(5, student1.getId());
            assertEquals("Elena", student1.getName());

            assertEquals(4525, student2.getGroup());
            assertEquals(1996, student2.getYear());

    }

    @Test
    void testEntity() {

        Student student = new Student(7, "Mik", "Иностранные языки", 5, 4116, 1987);
        Student student1 = new Student(8, "Dik", "Экономика", 1, 4523, 1993);
        Student student2 = new Student(9, "Dima", "Экономика", 3, 4525, 1995);


        assertEquals(7, student.getId());
        assertEquals("Mik", student.getName());
        assertEquals("Иностранные языки", student.getFaculty());
        assertEquals(5, student.getCourse());
        assertEquals(4116, student.getGroup());
        assertEquals(1987, student.getYear());

        assertEquals(8, student1.getId());
        assertEquals("Dik", student1.getName());

        assertEquals(4525, student2.getGroup());
        assertEquals(1995, student2.getYear());

    }

    @Test
    void testCourseException() {

        Student student = new Student(5, "Elena", "Экономика", 3, 4525, 1995);
        Student student0 = new Student(7, "Mik", "Иностранные языки", 3, 4116, 1987);
        Student student1 = new Student(8, "Dik", "Экономика", 1, 4523, 1993);
        Student student2 = new Student(9, "Dima", "Экономика", 3, 4525, 1995);

        assertThrows(IndexOutOfBoundsException.class,()-> student.setCourse(6));
        assertThrows(IndexOutOfBoundsException.class,()-> student1.setCourse(8));

    }
}
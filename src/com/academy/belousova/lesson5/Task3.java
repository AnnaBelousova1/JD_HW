package com.academy.belousova.lesson5;

public class Task3 {
    public static void main(String[] args) {
        Student anna = new Student(1, "Anna", "Экономика", 3, 4525, 1995);
        Student viktor = new Student(2, "Viktor", "Юриспрюденция", 3, 4654, 1998);
        Student viki = new Student(3, "Viki", "Информатика", 5, 4585, 1985);
        Student jon = new Student(4, "Jon", "Лингвистика", 2, 4412, 1999);
        Student elena = new Student(5, "Elena", "Экономика", 3, 4525, 1995);
        Student bill = new Student(6, "Bill", "Экономика", 3, 4525, 1996);
        Student mik = new Student(7, "Mik", "Иностранные языки", 5, 4116, 1987);
        Student dik = new Student(8, "Dik", "Экономика", 1, 4523, 1993);
        Student dima = new Student(9, "Dima", "Экономика", 3, 4525, 1995);
        Student hellen = new Student(10, "Hellen", "Информатика", 4, 4210, 1980);

        Student[] array = new Student[10];
        array[0] = anna;
        array[1] = viktor;
        array[2] = viki;
        array[3] = jon;
        array[4] = elena;
        array[5] = bill;
        array[6] = mik;
        array[7] = dik;
        array[8] = dima;
        array[9] = hellen;


        StudentManager studentManager = new StudentManager();
        studentManager.getCourse(array);
        studentManager.getYear(array);
    }
}

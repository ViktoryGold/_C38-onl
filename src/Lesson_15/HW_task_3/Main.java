package Lesson_15.HW_task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student_1 = new Student("Анна Иванова", "ИВТ-11", 2);
        student_1.addGrade("Математика", 5);
        student_1.addGrade("Физика", 4);
        student_1.addGrade("Химия", 5);

        Student student_2 = new Student("Олег Петров", "ИВТ-12", 3);
        student_2.addGrade("Программирование", 2);
        student_2.addGrade("Базы данных", 2);

        Student student_3 = new Student("Марина Ласточкина", "ИВТ-11", 2);
        student_3.addGrade("Математика", 4);
        student_3.addGrade("Английский", 5);
        student_3.addGrade("История", 4);

        Student student_4 = new Student("Борис Фёдоров", "ИВТ-13", 1);
        student_4.addGrade("Физика", 4);
        student_4.addGrade("Химия", 2);

        students.add(student_1);
        students.add(student_2);
        students.add(student_3);
        students.add(student_4);

        System.out.println("Исходные студенты:");
        for (Student s : students) {
            System.out.println(s);
        }
        StudentManager.printStudents(students, 2);
        StudentManager.processStudents(students);
        System.out.println("\nИтоговый список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }
        StudentManager.printStudents(students, 3);
    }
}

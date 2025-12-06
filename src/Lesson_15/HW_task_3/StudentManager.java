package Lesson_15.HW_task_3;

import java.util.List;

public class StudentManager {
    public static void processStudents(List<Student> students) {
        System.out.println("\n--- Обработка студентов ---");

        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            double avgGrade = student.getAverageGrade();

            if (avgGrade < 3.0) {
                System.out.printf("Удаляем: %s (средний балл: %.2f)\n",
                        student.getName(), avgGrade);
                students.remove(i);
            } else {
                int newCourse = student.getCourse() + 1;
                System.out.printf("Переводим: %s с курса %d на курс %d (средний балл: %.2f)\n",
                        student.getName(), student.getCourse(), newCourse, avgGrade);
                student.setCourse(newCourse);
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.printf("\nСтуденты на курсе %d:\n", course);

        boolean found = false;
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("На курсе нет студентов.");
        }
    }
}

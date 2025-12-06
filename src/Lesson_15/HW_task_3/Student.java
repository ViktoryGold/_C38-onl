package Lesson_15.HW_task_3;

import java.util.*;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades;

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void addGrade(String subject, int grade) {
        if (grade >= 2 && grade <= 5) {
            grades.put(subject, grade);
        } else {
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        }
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        return grades.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return String.format("Student{name = '%s', group = '%s', course = '%s', avgGrade = %2f}",
                name, group, course, getAverageGrade());
    }
}

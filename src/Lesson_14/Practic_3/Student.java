package Lesson_14.Practic_3;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private  double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student \nname = '" + name + "', \nage = " + age + ", \ngrade = " + grade;
    }
}

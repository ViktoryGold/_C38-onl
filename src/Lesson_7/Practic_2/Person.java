package Lesson_7.Practic_2;

public class Person {
    public String name;
    int age;
    private String gender;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

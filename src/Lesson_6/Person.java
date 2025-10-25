package Lesson_6;

public class Person {
    private String fullName;
    private int age;

    public Person(){
        fullName = "Ярославская Марина Андреевна";
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void talk(String text){
        System.out.println(fullName + " talk " + text);
    }
    public void move(){
        System.out.println(fullName + " walk");

    }
}

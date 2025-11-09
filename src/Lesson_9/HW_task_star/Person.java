package Lesson_9.HW_task_star;

public class Person implements Cloneable{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

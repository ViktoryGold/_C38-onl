package Lesson_8.HW_task_star;

public class Dog extends Animal{
    String name;

    private Dog(){
        System.out.println("Привет!");
    }
    public Dog(String name){
        this();
        this.name = name;
    }
}

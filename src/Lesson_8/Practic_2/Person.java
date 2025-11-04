package Lesson_8.Practic_2;

public class Person {
    final static String name;

    static {
        name = "Bob";
    }

    public static void getName(){
        System.out.println(name);
    }
}

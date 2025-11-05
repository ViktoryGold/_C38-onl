package Lesson_8.Practic_2;

public class Person {
    final static String NAME;

    static {
        NAME = "Bob";
    }

    public static void getName(){
        System.out.println(NAME);
    }
}

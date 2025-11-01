package Lesson_7.Practic_2;

public class Test {
    public static void main(String[] args){
        Person next = new Person();
        next.name = "Neo";
        next.age = 27;
        next.setGender("male");
        System.out.println(next.getAge());
        System.out.println(next.getName());
        System.out.println(next.getGender());
    }
}

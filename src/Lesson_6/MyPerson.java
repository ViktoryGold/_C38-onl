package Lesson_6;

public class MyPerson {
    public static void main(String[] args){
        //createPerson();

    }
    public static void createPerson(){
        Person marina = new Person();
        marina.move();
        marina.talk("привет!");

        Person oleg = new Person("Романов Олег Владимирович",42);

        oleg.talk(" привет!");
        oleg.move();



    }
}

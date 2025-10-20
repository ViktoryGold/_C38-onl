package Lesson_6;

public class MyPerson {
    public static void main(String[] args){
        //createPerson();

    }
    public static void createPerson(){
        Person marina = new Person();

        marina.fullName = "Абрамова Марина Алексеевна";
        marina.age = 27;

        marina.talk(" talk");
        marina.move();
    }
}

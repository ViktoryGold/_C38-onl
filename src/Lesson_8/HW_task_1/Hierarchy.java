package Lesson_8.HW_task_1;

public class Hierarchy {
    public static void main(String[] args){
        Animal animal = new Animal();

        animal.voice();
        animal.eat("food");

        Dog dog = new Dog();

        dog.voice();
        dog.eat("Meat");

        Tiger tiger = new Tiger();

        tiger.voice();
        tiger.eat("Grass");

        Rabbit rabbit = new Rabbit();

        rabbit.voice();
        rabbit.eat("Mushrooms");
    }
}

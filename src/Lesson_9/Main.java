package Lesson_9;

import Lesson_9.HW_task_1.Accountant;
import Lesson_9.HW_task_1.Director;
import Lesson_9.HW_task_1.Worker;
import Lesson_9.HW_task_2.Circle;
import Lesson_9.HW_task_2.Figure;
import Lesson_9.HW_task_2.Rectangle;
import Lesson_9.HW_task_2.Triangle;
import Lesson_9.HW_task_star.Person;
import Lesson_9.Practic_1.Cat;
import Lesson_9.Practic_1.Dog;
import Lesson_9.Practic_2.Hp;
import Lesson_9.Practic_2.Mac;

public class Main {
    public static void main(String[] args){
        //createAnimals();
        //createComp();
        //callJobTitle();
        //createFigures();
        //createSurfaceClone();
    }
    public static void createAnimals(){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.doVoice();
        cat.doVoice();
    }
    public static void createComp(){
        Hp hp = new Hp();
        Mac mac = new Mac();
        hp.getClassName();
        mac.getClassName();
    }
    public static void callJobTitle(){
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        director.getName();
        worker.getName();
        accountant.getName();
    }
    public static void createFigures(){
        Figure[] figures = new Figure[5];
        Triangle t = new Triangle(6,8,2,5,7);
        figures[0] = t;
        Circle c = new Circle(6,7,6);
        figures[1] = c;
        Triangle tr = new Triangle(65,12,48,4,5);
        figures[2] = tr;
        Rectangle r = new Rectangle(9,8,4,6);
        figures[3] = r;
        Circle ce = new Circle(90,78,6);
        figures[4] = ce;

        System.out.println(t.getPerimeter() + c.getPerimeter() + tr.getPerimeter() +
                r.getPerimeter() + ce.getPerimeter());
    }
    public static void createSurfaceClone(){
        try {
            Person person_1 = new Person("Ольга", 32);
            Person person_2 = (Person) person_1.clone();

            System.out.println("Оригинал: " + person_1.name + ", " + person_1.age);
            System.out.println("Клон: " + person_2.name + ", " + person_2.age);

            person_2.name = "Эльза";
            System.out.println("После изменения клона:");
            System.out.println("Оригинал: " + person_1.name);
            System.out.println("Клон: " + person_2.name);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}

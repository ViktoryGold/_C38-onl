package Lesson_8.HW_task_1;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat"){
            System.out.println("Собака любит мясо!");
        } else if (food == "Grass"){
            System.out.println("Трава ей не понравится!");
        } else {
            System.out.println("Это не лучшее решение");
        }
    }
}

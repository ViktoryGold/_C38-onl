package Lesson_8.HW_task_1;

public class Tiger extends Animal{

    @Override
    public void voice() {
        System.out.println("Тигр рычит");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat"){
            System.out.println("Тигр обожает мясо!");
        } else if (food == "Grass"){
            System.out.println("Трава ему безразлична!");
        } else {
            System.out.println("Голодный тигр очень опасен!");
        }
    }
}

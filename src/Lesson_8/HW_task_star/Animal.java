package Lesson_8.HW_task_star;

public class Animal {
    String food;

    public void setFood(String food) {
        this.food = food;
    }

    public void voice(){
        System.out.println("Животные произносят различные звуки");
    }
    public void eat(String food){
        System.out.println("Животные едят разнообразную еду");
    }
}

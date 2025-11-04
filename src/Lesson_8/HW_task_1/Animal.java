package Lesson_8.HW_task_1;

public class Animal {
    String food;

    public void setFood(String food) {
        this.food = food;
    }

    public void voice(){
        System.out.println("Животные могут издавать разные звуки");
    }
    public void eat(String food){
        System.out.println("Животные питаются растениями, " +
                "грибами или другими животными");
    }
}

package Lesson_7.HW_task_1;

public class Surgeon extends Doctors{
    public Surgeon(){
       super();
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println("I am surgeon!\nThe surgeon cuts.");
    }
}

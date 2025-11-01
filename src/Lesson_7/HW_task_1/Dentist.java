package Lesson_7.HW_task_1;

public class Dentist extends Doctors{
    public Dentist(){
        super();
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println("I am dentist!\nThe dentist treats teeth.");
    }
}

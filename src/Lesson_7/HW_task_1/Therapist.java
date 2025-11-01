package Lesson_7.HW_task_1;

public class Therapist extends Doctors{
    public Therapist(){
        super();
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println("I am therapist!\nThe therapist conducts an examination and diagnosis.");
    }

    public void appointDoctor(int p){
        if (p == 1){
            Surgeon surgeon = new Surgeon();
            surgeon.treat();
        } else if (p == 2){
            Dentist dentist = new Dentist();
            dentist.treat();
        } else {
            this.treat();
        }
    }
}

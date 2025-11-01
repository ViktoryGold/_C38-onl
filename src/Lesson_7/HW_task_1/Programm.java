package Lesson_7.HW_task_1;

public class Programm {
    public static void main(String[] args){
        Patient patient = new Patient();
        patient.treatmentPlan = 2;
        Therapist therapist = new Therapist();
        therapist.appointDoctor(patient.treatmentPlan);


    }
}

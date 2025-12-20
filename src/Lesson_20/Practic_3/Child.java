package Lesson_20.Practic_3;

public class Child implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Child: " + i);
        }
    }
}

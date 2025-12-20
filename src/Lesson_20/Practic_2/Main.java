package Lesson_20.Practic_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поток main начинает свою работу");
        Thread child = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Child: " + i);
                }
            }
        });
        child.start();
        try {
            child.join();
            System.out.println("Поток main завершает свою работу");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
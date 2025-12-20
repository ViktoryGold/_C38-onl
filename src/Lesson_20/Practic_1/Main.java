package Lesson_20.Practic_1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поток main начинает свою работу");
        Thread child = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Child: " + i);
                    if (i == 100) {
                        System.out.println("Поток main завершает свою работу");
                    }
                }
            }
        });
        child.start();

    }
}

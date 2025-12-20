package Lesson_20.Practic_3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток main начинает свою работу");
        Thread child = new Thread(new Child());
        child.start();
        child.join();
        System.out.println("Поток main завершает свою работу");
    }
}

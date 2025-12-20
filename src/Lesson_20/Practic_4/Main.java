package Lesson_20.Practic_4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new CounterThread(c));
            threads[i].start();
        }
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Итоговое значение count: " + c.getCount());
    }
}

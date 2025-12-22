package Lesson_20.HW_task_star;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<String> shelf;

    public Consumer(BlockingQueue<String> shelf, String name) {
        this.shelf = shelf;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= ShopModel.TOTAL_PROD; i++) {
                String item = shelf.take();
                System.out.println(Thread.currentThread().getName() +
                        " Покупатель купил: " + item);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

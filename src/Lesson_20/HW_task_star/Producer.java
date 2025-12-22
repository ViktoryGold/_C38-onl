package Lesson_20.HW_task_star;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<String> shelf;

    public Producer(BlockingQueue<String> shelf, String name) {
        this.shelf = shelf;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= ShopModel.TOTAL_PROD; i++) {
                String item = "товар-" + i;
                shelf.put(item);
                System.out.println(Thread.currentThread().getName() +
                        " Производитель произвёл и отправил в магазин: " + item);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

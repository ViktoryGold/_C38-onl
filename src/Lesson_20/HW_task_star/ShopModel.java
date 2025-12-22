package Lesson_20.HW_task_star;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ShopModel {
    private static final int MAX_ON_SHELF = 3;
    protected static final int TOTAL_PROD = 5;

    public static void main(String[] args) {
        BlockingQueue<String> shelf = new ArrayBlockingQueue<>(MAX_ON_SHELF);

        Thread producer = new Thread(new Producer(shelf, "Производитель"));
        Thread consumer = new Thread(new Consumer(shelf, "Покупатель"));

        producer.start();
        consumer.start();
    }
}

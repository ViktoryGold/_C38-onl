package Lesson_20.HW_task_2;

public class MultiSortDemo {
    public static void main(String[] args) throws InterruptedException {
        int[] data = {54, 43, 3, 11, 0, 7, 19, 25};

        InsertionSortTread t1 = new InsertionSortTread(data.clone(), "Insertion");
        SelectionSortThread t2 = new SelectionSortThread(data.clone(), "Selection");
        BubbleSortThread t3 = new BubbleSortThread(data.clone(), "Bubble");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        t1.printRusult();
        t2.printResult();
        t3.printResult();
    }
}

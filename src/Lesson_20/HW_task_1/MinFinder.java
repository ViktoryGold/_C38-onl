package Lesson_20.HW_task_1;

public class MinFinder extends Thread {
    private final int[] arr;
    private int min = Integer.MAX_VALUE;

    public MinFinder(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int v : arr) {
            if (v < min) {
                min = v;
            }
        }
    }

    public int getMin() {
        return min;
    }
}

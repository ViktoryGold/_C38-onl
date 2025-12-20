package Lesson_20.HW_task_1;

public class MaxFinder extends Thread {
    private final int[] arr;
    private int max = Integer.MIN_VALUE;

    public MaxFinder(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int v : arr) {
            if (v > max) {
                max = v;
            }
        }
    }

    public int getMax() {
        return max;
    }
}

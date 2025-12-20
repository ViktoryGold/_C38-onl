package Lesson_20.HW_task_2;

import java.util.Arrays;

public class BubbleSortThread extends Thread {
    private final int[] arr;

    public BubbleSortThread(int[] a, String name) {
        super(name);
        this.arr = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    void printResult() {
        System.out.println(getName() + " : " + Arrays.toString(arr));
    }
}

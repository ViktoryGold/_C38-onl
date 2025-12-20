package Lesson_20.HW_task_2;

import java.util.Arrays;

public class SelectionSortThread extends Thread {
    private final int[] arr;

    public SelectionSortThread(int[] a, String name) {
        super(name);
        this.arr = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
    }
    void printResult() {
        System.out.println(getName() + " : " + Arrays.toString(arr));
    }
}

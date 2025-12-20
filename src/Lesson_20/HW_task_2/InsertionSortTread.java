package Lesson_20.HW_task_2;

import java.util.Arrays;

public class InsertionSortTread extends Thread {
    private final int[] arr;

    public InsertionSortTread(int[] a, String name) {
        super(name);
        this.arr = a;
    }

    @Override
    public void run() {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    void printRusult() {
        System.out.println(getName() + " : " + Arrays.toString(arr));
    }
}

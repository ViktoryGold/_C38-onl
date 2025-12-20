package Lesson_20.HW_task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Размер массива: ");
        int n = scanner.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Значение[" + i + "] = ");
            data[i] = scanner.nextInt();
        }

        MaxFinder maxT = new MaxFinder(data);
        MinFinder minT = new MinFinder(data);
        maxT.start();
        minT.start();

        maxT.join();
        minT.join();

        System.out.println("MAX = " + maxT.getMax());
        System.out.println("MIN = " + minT.getMin());
    }
}

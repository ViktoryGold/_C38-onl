package Lesson_17.HW_task_2;

import java.util.function.*;

public class PositiveNumbersFilter {
    public static void main(String[] args) {
        int[] numbers = {-9, 2, 5, -1, 0, 78, -9, 65};
        Predicate<Integer> isPositive = x -> x > 0;
        for (int number : numbers) {
            if (isPositive.test(number)) {
                System.out.println(number);
            }
        }
    }
}

package Lesson_18.HW_task_1;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6));
        int sum = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма чётных уникальных элементов: " + sum);
    }
}

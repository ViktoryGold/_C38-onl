package Lesson_18.HW_task_star;

import java.util.*;

public class DataProcessingExample {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        data.put(1, "Анна");
        data.put(2, "Борис");
        data.put(3, "Вера");
        data.put(5, "Глеб");
        data.put(8, "Дарья");
        data.put(9, "Иван");
        data.put(10, "Катя");
        data.put(13, "Лев");

        Set<Integer> allowedIds = Set.of(1,2,5,8,9,13);

        List<String> result = data.entrySet().stream()
                .filter(entry -> allowedIds.contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 == 1)
                .map(name -> new StringBuilder(name).reverse().toString())
                .toList();

        System.out.println("Перевёрнутые имена(с нечётной длиной, id в [1,2,5,8,9,13]): " + result);

    }
}

package Lesson_16.HW_task_1;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        String[] input = {"ананас", "яблоко", "ананас", "банан", "апельсин"};

        Map<String, Boolean> map = getDuplicateMap(input);

        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
    public static Map<String, Boolean> getDuplicateMap(String[] strings) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String string : strings) {
            frequencyMap.put(string, frequencyMap.getOrDefault(string, 0) + 1);
        }

        Map<String, Boolean> resultMap = new HashMap<>();
        for (String key : frequencyMap.keySet()) {
            resultMap.put(key, frequencyMap.get(key) >= 2);
        }
        return resultMap;
    }
}

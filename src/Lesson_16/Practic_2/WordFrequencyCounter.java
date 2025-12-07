package Lesson_16.Practic_2;

import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("Частота встречаемости слов:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue() + " раз");
        }
        scanner.close();
    }
}

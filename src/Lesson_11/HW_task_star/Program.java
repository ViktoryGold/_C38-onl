package Lesson_11.HW_task_star;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите строку:");
        String string = scanner.nextLine().trim();

        if (string.isEmpty()) {
            System.out.println("Строка пустая");
            return;
        }
        String[] words = string.split("[ ,]");
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordList.add(word);
            }
        }
        if (wordList.isEmpty()) {
            System.out.println("В строке нет слов");
            return;
        }
        System.out.println("\nСлова в строке:");
        for (int i=0; i < wordList.size(); i++) {
            System.out.println((i+1) + ": " + wordList.get(i));
        }

        System.out.println("\nВведите номер слова или само слово: ");
        String choice = scanner.nextLine().trim();
        String targetWord = null;

        try {
            int index = Integer.parseInt(choice) - 1;
            if (index >= 0 && index < wordList.size()) {
                targetWord = wordList.get(index);
            } else {
                System.out.println("Нет слова с таким номером");
                return;
            }
        }
        catch (NumberFormatException e) {
            if (wordList.contains(choice)) {
                targetWord = choice;
            } else {
                System.out.println("Такое слово не найдено в строке");
                return;
            }
        }
        boolean isPalindrome = isPalindrome(targetWord);
        System.out.println(
                "\'" + targetWord + "\" - " +
                        (isPalindrome ? "палиндром" : "не палиндром") +
                ".");
        scanner.close();
    }

    private static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        String cleaned = word.toLowerCase(Locale.ROOT);
        StringBuilder reversed = new StringBuilder(cleaned).reverse();
        return cleaned.equals(reversed.toString());
    }
}

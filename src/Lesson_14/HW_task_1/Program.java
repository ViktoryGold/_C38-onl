package Lesson_14.HW_task_1;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        String inputFile = "src/Lesson_14/HW_task_1/text.txt";
        String outputFile = "src/Lesson_14/HW_task_1/longest_word.txt";

        try {
            String content = readFile(inputFile);
            String longestWord = findLongestWord(content);
            writeFile(outputFile, longestWord);
            System.out.println("Самое длинное слово: " + longestWord);
            System.out.println("Сохранено в файл: " + outputFile);
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    private static String readFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        }
    }
    private static String findLongestWord(String text) {
        String[] words = text.split("[^a-zA-Z]+");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest.isEmpty() ? "Нет слов" : longest;
    }
    private static void writeFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

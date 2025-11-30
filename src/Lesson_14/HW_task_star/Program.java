package Lesson_14.HW_task_star;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //String inputFile = "src/Lesson_14/HW_task_star/input.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String inputFile = scanner.nextLine();
        String validFile = "src/Lesson_14/HW_task_star/valid.txt";
        String invalidFile = "src/Lesson_14/HW_task_star/invalid.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFile));
             BufferedWriter validWriter = Files.newBufferedWriter(Paths.get(validFile));
             BufferedWriter invalidWriter = Files.newBufferedWriter(Paths.get(invalidFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String trimmedLine = line.trim();
                if (isValidDocumentNumber(trimmedLine)) {
                    validWriter.write(trimmedLine);
                    validWriter.newLine();
                } else {
                    String reason = getInvalidReason(trimmedLine);
                    invalidWriter.write(trimmedLine + " - " + reason);
                    invalidWriter.newLine();
                }
            }
            System.out.println("Проверка завершена. Результаты в файлах valid.txt и invalid.txt");
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
    private static boolean isValidDocumentNumber(String number) {
        if (number == null || number.length() != 15) {
            return false;
        }
        return (number.matches("^docnum.{9}")
                || (number.matches("^contract.{7}")));
    }
    private static String getInvalidReason(String number) {
        if (number == null || number.isEmpty()) {
            return "Пустая строка";
        }
        if (number.length() != 15) {
            return "Длина не равна 15 символам";
        }
        if (!number.matches("^docnum")
                || (!number.matches("^contract"))) {
            return "Не начинается с определённых слов";
        }
        return "Неизвестная ошибка";
    }
}

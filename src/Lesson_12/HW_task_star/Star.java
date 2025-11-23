package Lesson_12.HW_task_star;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Star {
    public static void main(String[] args) {
        String text = "Договор № 1423-1512-51 от 04.07.2023." +
                "также Договор № 1423-9087-00 от 10.12.2025." +
                "Телефон +(45)5674321 и email: teachmeskills@gmail.com";
        List<String> documentNumbers = exstractDocumentNumbers(text);
        List<String> phoneNumbers = exstractPhoneNumbers(text);
        List<String> emailNumbers = exstractEmailNumbers(text);

        System.out.println("Найденные номера документов: ");
        documentNumbers.forEach(System.out::println);

        System.out.println("Найденные номера телефонов: ");
        phoneNumbers.forEach(System.out::println);

        System.out.println("Найденные электронные почты: ");
        emailNumbers.forEach(System.out::println);
    }
    private static List<String> exstractDocumentNumbers(String text) {
        List<String> results = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d{1,4}([\\-\\s]\\d{1,4})[\\-\\s]\\d{1,2}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String match = matcher.group().replaceAll("[\\s\\-]", "");
            if (match.matches("\\d{6,12}")) {
                results.add(matcher.group());
            }
        }
        return results;
    }
    private static List<String> exstractPhoneNumbers(String text) {
        List<String> results = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\+\\((\\d{2})\\)\\d{7}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            results.add(matcher.group());
        }
        return results;
    }
    private static List<String> exstractEmailNumbers(String text) {
        List<String> results = new ArrayList<>();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            results.add(matcher.group());
        }
        return results;
    }
}

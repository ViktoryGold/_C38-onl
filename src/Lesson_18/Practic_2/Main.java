package Lesson_18.Practic_2;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Апельсин", "Банан", "арбуз", "Ананас", "Груша", "Абрикос");

        words.stream()
                .filter(word -> word.toUpperCase(Locale.ROOT).startsWith("А"))
                .forEach(System.out::println);
    }
}

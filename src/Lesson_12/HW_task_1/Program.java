package Lesson_12.HW_task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        outputAbbreviations();

    }
    public static void outputAbbreviations() {
        System.out.println("Введите пожалуйста текст: ");
        String y = new String(getInput().nextLine());
        Pattern pattern = Pattern.compile("([А-Я]\\.){2,6}|[А-Я]{2,6}|" +
                "([A-Z]\\.){2,6}|[A-Z]{2,6}");
        Matcher matcher = pattern.matcher(y);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static Scanner getInput() {
        return new Scanner(System.in);
    }
}

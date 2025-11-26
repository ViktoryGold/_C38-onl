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
        String y = getInput().nextLine();
        Pattern pattern = Pattern.compile("(\\b[A-ZА-Я]{2,5}\\b)", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(y);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
    public static Scanner getInput() {
        return new Scanner(System.in);
    }
}

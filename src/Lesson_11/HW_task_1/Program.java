package Lesson_11.HW_task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста 3 слова:");
        String[] str = new String[3];
        for (int i=0; i<3; i++) {
            str[i] = scanner.nextLine();
        }
        String shortest = str[0];
        String longest = str[0];
        if (str[1].length() < shortest.length()) {
            shortest = str[1];
        }
        if (str[1].length() > longest.length()) {
            longest = str[1];
        }
        if (str[2].length() < shortest.length()) {
            shortest = str[2];
        }
        if (str[2].length() > longest.length()) {
            longest = str[2];
        }
        System.out.printf("Самое короткое слово: %s, самое длинное слово: %s", shortest, longest);
    }
}

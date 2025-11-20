package Lesson_11.HW_task_4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста 3 слова:");

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String result = null;
        int i = 0;

        if (uniqueChars(str1)) {
            result = str1;
            i++;
        } else if (uniqueChars(str2)) {
            result = str2;
            i++;
        } else if (uniqueChars(str3)) {
            result = str3;
            i++;
        }
        System.out.println("Слово - " + result.toUpperCase(Locale.ROOT) + " под номером " + i + "является первым из трёх " +
                "состоящим из различных символов");
    }
    private static boolean uniqueChars(String s) {
        HashSet<Character> charSet = new HashSet<>();
        for (char g : s.toCharArray()) {
            if (charSet.contains(g)) {
                return false;
            }
            charSet.add(g);
        }
        return true;
    }
}

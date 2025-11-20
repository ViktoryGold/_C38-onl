package Lesson_11.HW_task_2;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста 3 слова:");
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = scanner.nextLine();
        }
        Arrays.sort(str,(a, b) -> a.length() - b.length());
        for (String string : str) {
            System.out.println(string + "[" + string.length() + "]");
        }
    }
}

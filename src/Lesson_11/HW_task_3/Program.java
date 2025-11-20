package Lesson_11.HW_task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста 3 слова:");
        String[] str = new String[3];
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            str[i] = scanner.nextLine();
            sum += str[i].length();
        }
        double averageLength = sum/str.length;
        System.out.println("Средняя длина слов = " + averageLength);
        int counter = 0;
        for (String string : str) {
            if (string.length() < averageLength) {
                System.out.println(string + "[" +string.length() + "]");
                counter++;
            }
        }
        if (counter < 1){
            System.out.println("Длина всех слов больше средней!");
        }
    }
}

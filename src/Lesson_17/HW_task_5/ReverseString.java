package Lesson_17.HW_task_5;

import java.util.Scanner;
import java.util.function.Supplier;

public class ReverseString {
    public static void main(String[] args) {
        reverseSupplier();
    }
    public static void reverseSupplier () {
        Supplier<String> revers = () -> {
            System.out.println("Введите строку: ");
            String string = input().nextLine();
            return new StringBuilder(string).reverse().toString();
        };
        String reversed = revers.get();
        System.out.println("Перевёрнутая строка: " + reversed);
    }
    public static Scanner input() {
        return new Scanner(System.in);
    }
}

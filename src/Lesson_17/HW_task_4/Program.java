package Lesson_17.HW_task_4;

import java.util.Scanner;
import java.util.function.Consumer;

public class Program {
    private static final double EXCHANGE_RATE = 0.35;
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста сумму для конвертации:");
        String input = getInput().nextLine() + " BYN";

        currencyConverter(input);
    }
    public static void currencyConverter(String str) {
        Consumer<String> convert = (String input) -> {
            try {
                String[] parts = input.trim().split("\\s+");
                if (parts.length != 2 || parts[1].equalsIgnoreCase("BYN")) {
                    System.err.println("Не верный формат");
                    return;
                }
                double amount = Double.parseDouble(parts[0]);
                double amountBYN = amount * EXCHANGE_RATE;
                System.out.printf("%.2f BYN = %.1f USD%n", amount, amountBYN);
            } catch (NumberFormatException e) {
                System.err.println("Сначала надо ввести число");
            }
        };
        convert.accept(str + "$");
    }
    public static Scanner getInput() {
        return new Scanner(System.in);
    }
}

package Lesson_17.HW_task_3;

import java.util.Scanner;
import java.util.function.Function;

public class Converter {
    private static final double EXCHANGE_RATE = 0.35;
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста сумму для конвертации:");
        String input = getInput().nextLine() + " BYN";

        currencyConverter(input);
    }
    public static void currencyConverter(String str) {
        Function<String, Double> convertToUSD = (String input) -> {
            String[] parts = input.trim().split("\\s+");
            try {
                double amountBYN = Double.parseDouble(parts[0]);
                return amountBYN * EXCHANGE_RATE;
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Сначала надо ввести число", e);
            }
        };
        System.out.println(convertToUSD.apply(str) + "$");
    }
    public static Scanner getInput() {
        return new Scanner(System.in);
    }
}

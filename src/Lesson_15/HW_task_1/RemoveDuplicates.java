package Lesson_15.HW_task_1;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел: ");
        String input = scanner.nextLine();

        String[] parts = input.trim().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            try {
                numbers.add(Integer.parseInt(part));
            } catch (NumberFormatException e) {
                System.out.println("Предупреждение: '" + part + "' - не число, пропускаем.");
            }
        }
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        System.out.println("Числа без повторов:");
        System.out.println(uniqueNumbers);

        scanner.close();
    }

}

package Lesson_17.HW_task_1;

import java.time.LocalDate;
import java.time.format.*;
import java.util.Scanner;

public class DatePlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста дату рождения в формате (дд-мм-гггг):");
        String input = scanner.nextLine();
        DateTimeFormatter formateDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate birthday = LocalDate.parse(input, formateDate);
            LocalDate date = birthday.plusYears(100);
            String result = date.format(formateDate);
            System.out.println("Вам исполнится 100 лет: " + result);
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неверный формат даты!");
        }
        scanner.close();
    }
}

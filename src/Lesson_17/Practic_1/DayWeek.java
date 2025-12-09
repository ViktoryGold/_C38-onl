package Lesson_17.Practic_1;

import java.time.LocalDate;
import java.time.format.*;
import java.util.Scanner;

public class DayWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста дату в формате (дд.мм.гггг): ");
        String dateInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(dateInput, formatter);

        String day = date.getDayOfWeek().getDisplayName(TextStyle.FULL, java.util.Locale.forLanguageTag("ru"));
        System.out.println("День недели: " + day);
        scanner.close();
    }
}

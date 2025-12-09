package Lesson_17.Practic_2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class NextDay {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formatDate = nextTuesday.format(formatter);

        System.out.println("Следующий вторник: " + formatDate);
    }
}

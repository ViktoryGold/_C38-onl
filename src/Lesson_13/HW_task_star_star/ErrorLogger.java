package Lesson_13.HW_task_star_star;

import java.io.FileWriter;
import java.io.IOException;

public class ErrorLogger {
    public static void logError(String errorMessage) {
        try (FileWriter writer = new FileWriter("src/Lesson_13/HW_task_star_star/exeptions.txt", true)){
            writer.write(errorMessage + "\n");
        } catch (IOException e) {
            System.out.println("Не удалось записать в лог: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logError("Ошибка: " + e.toString());
        }

    }
}

package Lesson_13.HW_task_star_star;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;

public class MyExeptions {
    public static void main(String[] args) throws IOException {
        int num_1 = new Scanner(System.in).nextInt();
        int num_2 = new Scanner(System.in).nextInt();
        try {
            System.out.println(num_1 / num_2);
        } catch (ArithmeticException e) {
            getExceptions("Ошибка: " + e.getMessage());
        }
    }
    public static void getExceptions(String error) throws IOException {
        try (FileWriter writer = new FileWriter("src/Lesson_13/HW_task_star_star/exeptions.txt",
                true)) {
             writer.write(new Date() + "MISTAKE. EXCEPTION SAYS: " + error + "\n");
        } catch (IOException e) {
            System.out.println("Не удалось записать в лог: " + e.getMessage());
        }
    }
}

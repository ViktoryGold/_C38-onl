package Lesson_14.Practic_1;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        String consoleLine = scanner().nextLine();

        try (FileOutputStream fos = new FileOutputStream("src/Lesson_14/Practic_1/file.txt")) {
            fos.write(consoleLine.getBytes(StandardCharsets.UTF_8));
            System.out.println("\nСтрока записана!");
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream("src/Lesson_14/Practic_1/file.txt")) {
            byte[] data = fis.readAllBytes();
            String content = new String(data);
            System.out.println("\nСодержимое файла:");
            System.out.println(content.replace(' ', '_'));
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner().close();
    }
    public static Scanner scanner() {
        return new Scanner(System.in);
    }
}

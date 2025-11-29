package Lesson_14.Practic_2;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        String phraseLatin = "Cognosce te ipsum";

        try (FileWriter fileWriter = new FileWriter("src/Lesson_14/Practic_2/Latino.txt")) {
            fileWriter.write(phraseLatin);
            System.out.println("Текст записан");
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
        try (FileReader fileReader = new FileReader("src/Lesson_14/Practic_2/Latino.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Содержимое файла:");
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

package Lesson_15.HW_task_star_star_star;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Нет переданных параметров.");
            return;
        }
        Terminal terminal = new Terminal(args);
        System.out.println("Создан объект: " + terminal);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("terminal.ser"))) {
            oos.writeObject(terminal);
            System.out.println("Объект успешно сериализован в файл terminal.ser");
        } catch (IOException e) {
            System.out.println("Ошибка при сериализации: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("terminal.ser"))) {
            Terminal restored = (Terminal) ois.readObject();
            System.out.println("Десериализованный объект: " + restored);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}

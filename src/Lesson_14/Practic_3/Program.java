package Lesson_14.Practic_3;

import java.io.*;

public class Program {
    public static void main(String[] args) {
        Student student = new Student("Ольга", 23, 6.6);

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/Lesson_14/Practic_3/student.dat"))) {
            oos.writeObject(student);
            System.out.println("Объект сериализован и сохранён в файл");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/Lesson_14/Practic_3/student.dat"))) {
            Student studentD = (Student) ois.readObject();
            System.out.println("Десериализованный объект: " + studentD);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
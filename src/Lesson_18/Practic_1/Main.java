package Lesson_18.Practic_1;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Optional<User> user = Optional.empty();
        //user = Optional.of(new User("Дима"));
        String userName;

        if (user.isPresent()) {
            System.out.println("Введите имя пользователя: ");
            userName = scanner.nextLine();
            user.get().setName(userName);
        } else {
            userName = "DEFAULT";
        }
        System.out.println("Имя пользователя: " + userName);
        scanner.close();
    }
}

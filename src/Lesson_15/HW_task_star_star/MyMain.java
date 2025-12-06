package Lesson_15.HW_task_star_star;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        verification();
    }
    public static void verification() {
        try {
            System.out.println("Пожалуйста, введите ваш логин: ");
            String login = new Scanner(System.in).nextLine();
            System.out.println("Пожалуйста, введите ваш пароль: ");
            String password = new Scanner(System.in).nextLine();

            initializeException(login, password);
            System.out.println("Добро пожаловать!");
        } catch (UserPassException e) {
            System.err.println("Ошибка: " + e.getMessage() + " (код: " + e.getCode() + ")");
        }
    }
    public static void initializeException(String log, String pass) throws UserPassException {
        if (!log.contains(" ")) {
            if (log.length() < 20) {
                if (!log.equals("wers") || !pass.equals("1234")) {
                    throw new UserPassException("Error", "GOODBYE! WRONG DATA!!");
                }
            }
        }
    }
}

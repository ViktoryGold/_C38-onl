package Lesson_14.HW_task_star_star;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        verification();

    }
    public static void verification() {
        try {
            System.out.println("Please, enter your USERNAME: ");
            String userName = new Scanner(System.in).nextLine();
            System.out.println("Please, enter your PASSWORD: ");
            String password = new Scanner((System.in)).nextLine();
            initializeException(userName,password);
        } catch (UserPassException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static void initializeException(String name, String password) throws UserPassException {
        String userN = "wers";
        String pass = "34er5";
        if (!userN.equals(name)) {
            throw new UserPassException("Неверный логин");
        } else if (!pass.equals(password)) {
            throw new UserPassException("Неверный пароль");
        } else {
            System.out.println("Доступ разрешён!");
        }
    }
}

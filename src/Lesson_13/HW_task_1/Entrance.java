package Lesson_13.HW_task_1;

public class Entrance {
    public static boolean entranceAccount(String login,
                                       String password, String confirmPassword)
                                       throws WrongLoginException, WrongPasswordException {
        if (login.length() > 19 || login.contains(" ")) {
            throw new WrongLoginException("Логин не должен содержать больше 19 символов " +
                    "и не может содержать пробелы.");
        } else if (password.length() > 19 || password.contains(" ")
                || (!password.matches(".*\\d.*")) || (!password.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароль не должен содержать больше 19 символов, " +
                    "не может содержать пробелы, должен содержать хотя бы одну цифру." +
                    "Поля: \"password и confirmPassword\" должны совпадать.");
        }
        return true;
    }
}

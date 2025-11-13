package Lesson_10.HW_task_1;

public class Program {
    public static void main(String[] args) {
        createUser();
    }
    public static void createUser() {
        User user = new User();
        user.setId(6799L);
        user.setUserName("garry");
        user.setPassword("qwerty56");
        user.setFirstName("Garry");
        user.setLastName("Ford");
        user.setRole("admin");

        User user1 = new User();
        user.setId(6799L);
        user.setUserName("garry");
        user.setPassword("qwerty56");
        user.setFirstName("Garry");
        user.setLastName("Ford");
        user.setRole("admin");

        System.out.println(user);
        System.out.println("Полное имя: " + user.getFullName());
        System.out.println("Активен: " + user.isActive());

        System.out.println(user.equals(user1));
    }
}

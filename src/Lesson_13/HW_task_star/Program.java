package Lesson_13.HW_task_star;

public class Program {
    public static void main(String[] args) {
        try {
            System.out.println("Блок \"try\"");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Блок \"catch\"");;
        } finally {
            System.out.println("Блок \"finally\"");
        }
    }
}

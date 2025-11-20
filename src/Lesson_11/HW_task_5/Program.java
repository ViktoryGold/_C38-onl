package Lesson_11.HW_task_5;

public class Program {
    public static void main(String[] args) {
        String string = "Hello";
        StringBuilder result = new StringBuilder();

        for (char s : string.toCharArray()) {
            result.append(s).append(s);
        }
        System.out.println(result.toString());
    }
}

package Lesson_14.HW_task_star_star;

public class Test {
    public static void main(String[] args) {
        String line = "contract123n786";
        if (line.matches("^docnum.{9}") || (line.matches("^contract.{7}"))) {
            System.out.println("Yes");
        } else {
            System.out.println("X");
        }
    }
}

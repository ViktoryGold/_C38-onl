package Lesson_13.Practic_1;

public class Program {
    public static void main(String[] args) {
        createArray();

    }
    public static void createArray() {
        int[] array = new int[3];
        try {
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Описание ошибки: " + e.getMessage());
        }
    }
}

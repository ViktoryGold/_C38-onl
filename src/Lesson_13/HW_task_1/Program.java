package Lesson_13.HW_task_1;

public class Program {
    public static void main(String[] args) throws WrongLoginException,
                                                  WrongPasswordException {
        entryAcc();

    }
    public static boolean entryAcc() {
        try {
            Entrance.entranceAccount("erty789", "6jk", "6jk6");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());;
            return false;
        }
        return true;
    }
}

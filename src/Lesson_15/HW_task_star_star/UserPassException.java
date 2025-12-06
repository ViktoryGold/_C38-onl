package Lesson_15.HW_task_star_star;

public class UserPassException extends Exception{
    private final String code;

    public UserPassException(String code, String message) {
        super(message);
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}

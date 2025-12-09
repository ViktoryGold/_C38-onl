package Lesson_17.HW_task_star;

public record NumberProcessor<T extends Number>(T value) {

    public void processInteger(Integer intValue) {
        System.out.println("Обработано целое число: " + intValue);
    }

    public void processNonInteger(Number nonIntValue) {
        double doubleValue = nonIntValue.doubleValue();
        System.out.println("Обработано не целое число: " + doubleValue);
    }
}

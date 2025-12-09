package Lesson_17.HW_task_star;

public class Program {
    public static void main(String[] args) {
        NumberProcessor<Integer> intProcessor = new NumberProcessor<>(42);
        intProcessor.processInteger(100);
        System.out.println("Текущее значение: " + intProcessor.value());

        NumberProcessor<Double> doubleProcessor = new NumberProcessor<>(3.14);
        doubleProcessor.processNonInteger(2.71);
        System.out.println("Текущее значение: " + doubleProcessor.value());

        NumberProcessor<Float> floatProcessor = new NumberProcessor<>(1.5f);
        floatProcessor.processNonInteger(0.75f);
        System.out.println("Текущее значение: " + floatProcessor.value());
    }
}

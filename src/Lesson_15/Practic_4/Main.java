package Lesson_15.Practic_4;

public class Main {
    public static void main(String[] args) {
        Storage<String> stringStorage = new Storage<>();
        System.out.println("1. Storage<String> (конструктор по умолчанию):");
        System.out.println(stringStorage);

        stringStorage.setValue("Привет, дженерики!");
        System.out.println("После setValue():\n" + stringStorage);
        System.out.println("getValue(): " + stringStorage.getValue());

        System.out.println();

        Storage<Integer> intStorage = new Storage<>(42);
        System.out.println("2. Storage<Integer> (конструктор с параметром):");
        System.out.println("getValue(): " + intStorage.getValue());

        intStorage.setValue(100);
        System.out.println("После изменения через setValue(100):\n" + intStorage);
        System.out.println("getValue(): " + intStorage.getValue());

        System.out.println();

        Storage<Double> doubleStorage = new Storage<>(3.14);
        System.out.println("3. Storage<Double> (конструктор с параметром):");
        System.out.println(doubleStorage);

        doubleStorage.setValue(2.718);
        System.out.println("После изменения через setValue(2.718):\n" + doubleStorage);
        System.out.println("getValue(): " + doubleStorage.getValue());
    }
}

package Lesson_15.HW_task_star;

public class Main {
    public static void main(String[] args) {
        DynamicArray<String> stringList = new DynamicArray<>(5);
        stringList.add("Яблоко");
        stringList.add("Банан");
        stringList.add("Вишня");

        System.out.println("Строки (начальный размер 5): " + stringList);

        DynamicArray<Integer> numberList = new DynamicArray<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(300);

        System.out.println("Числа (по умолчанию): " + numberList);

        System.out.println("\nИтерация по строкам:");
        for (String s : stringList) {
            System.out.println("- " + s);
        }
        System.out.println("\nПоиск 'Банан': индекс = " + stringList.indexOf("Банан"));
        stringList.remove(1);
        System.out.println("После удаления 'Банан': " + stringList);

        System.out.println("Размер: " + stringList.size());
        System.out.println("Пусто?" + stringList.isEmpty());

        stringList.clear();
        System.out.println("После очистки: " + stringList);
        System.out.println("Теперь пусто? " + stringList.isEmpty());
    }
}

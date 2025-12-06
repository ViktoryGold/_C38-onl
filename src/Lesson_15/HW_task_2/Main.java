package Lesson_15.HW_task_2;

public class Main {
    public static void main(String[] args) {
        AnimalCollection zoo = new AnimalCollection();

        System.out.println("Добавляем животных:");
        zoo.addAnimal("Лев");
        zoo.addAnimal("Тигр");
        zoo.addAnimal("Слон");
        zoo.printAll();

        System.out.println();

        System.out.println("Есть ли 'Слон' в коллекции? " + zoo.containsAnimal("Слон"));
        System.out.println("Есть ли 'Жираф' в коллекции? " + zoo.containsAnimal("Жираф"));
        System.out.println();

        System.out.println("Удаляем животных:");
        String removed = zoo.removeAnimal();
        System.out.println("Удалено: " + removed);
        zoo.printAll();

        removed = zoo.removeAnimal();
        System.out.println("Удалено: " + removed);
        zoo.printAll();
        System.out.println();

        System.out.println("Добавляем 'Жирафа':");
        zoo.addAnimal("Жираф");
        zoo.printAll();

        System.out.println("Размер коллекции: " + zoo.size());

        zoo.clear();
        System.out.println("После очистки:");
        zoo.printAll();
        System.out.println("Размер коллекции: " + zoo.size());
    }
}

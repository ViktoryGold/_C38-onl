package Lesson_15.Practic_2;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList countries = new DoublyLinkedList();

        countries.addFirst("Россия");
        countries.addFirst("США");
        countries.addFirst("Япония");
        countries.addLast("Китай");
        countries.addLast("Франция");

        countries.displayForward();
        countries.displayBackward();
        String removedFirst = countries.removeFirst();
        System.out.println("Удалён первый элемент: " + removedFirst);
        String removedLast = countries.removeLast();
        System.out.println("Удалён последний элемент: " + removedLast);
        System.out.println("После удаления:");
        countries.displayForward();
        System.out.println("Первый элемент списка: " + countries.getFirst());
        System.out.println("Последний элемент списка: " + countries.getLast());
    }
}

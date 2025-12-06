package Lesson_15.HW_task_2;

import java.util.*;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        if (animal != null && !animal.trim().isEmpty()) {
            animals.addFirst(animal.trim());
        } else {
            System.out.println("Ошибка: нельзя добавить пустое название животного.");
        }
    }
    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста, удалять нечего.");
            return null;
        }
        return animals.removeLast();
    }
    public boolean containsAnimal(String animal) {
        return animal != null && animals.contains(animal.trim());
    }
    public int size() {
        return animals.size();
    }
    public void clear() {
        animals.clear();
    }
    public void printAll() {
        System.out.println("Текущие животные в коллекции: " + animals);
    }
}

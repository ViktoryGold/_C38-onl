package Lesson_15.Practic_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Person person_1 = new Person("Ольга", 32);
        Person person_2 = new Person("Марина", 26);
        Person person_3 = new Person("Эльвина", 18);

        people.add(person_1);
        people.add(person_2);
        people.add(person_3);

        System.out.println("Список людей:");
        for (Person person : people) {
            System.out.println(person);
        }
        people.remove(person_1);
        people.remove(person_3);
        System.out.println("\nПосле удаления:");

        for (Person person : people) {
            System.out.println(person);
        }
        boolean containsRemaining = people.contains(person_2);
        System.out.println("\nСодержит ли коллекция оставшийся объект (Марина)? " + containsRemaining);
        Person checkPerson = new Person("Марина", 26);
        boolean containsByValue = people.contains(checkPerson);
        System.out.println("Содержит ли коллекция объект с теми же данными (Марина, 26)? " + containsByValue);
    }
}

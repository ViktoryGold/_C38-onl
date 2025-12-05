package Lesson_15.Practic_1;

import java.util.*;

public class WorldCountries {
    public static void main(String[] args) {
        createCountry();
    }
    public static void createCountry(){
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Россия","Москва","Евразия"));
        countries.add(new Country("Испания","Мадрид","Европа"));
        countries.add(new Country("Китай","Пекин","Азия"));

        for (Country country : countries) {
            System.out.println(country);
        }
        actionsArray(countries);
    }
    public static void actionsArray(List<Country> input) {
        input.set(1,new Country("Франция","Париж","Европа"));
        System.out.println("После замены:\n" + input);
        System.out.println("Удаляем элемент:\n" + input.get(1));
        input.remove(1);
        System.out.println("После удаления по индексу:\n" + input);
        Country China = input.get(1);
        boolean result = input.remove(China);
        if (result) {
            System.out.println("Успешно удалено!");
        }
        else {
            System.out.println("Объект для удаления не найден");
        }
        System.out.println("После удаления по значению:\n" + input);
        Country Russia = input.getFirst();
        int index = input.indexOf(Russia);
        System.out.println("Россия находится в списке под индексом: " + index);
        boolean isChina = input.contains(China);
        boolean isRussia = input.contains(Russia);
        if (isChina) {
            System.out.println("Eсть в списке");
        } else {
            System.out.println("Нет в списке");
        }
    }
}

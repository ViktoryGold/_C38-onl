package Lesson_16.Practic_1;

import java.util.*;

public class CardBalance {
    public static void main(String[] args) {
        HashMap<String, Double> cardBalance = new HashMap<>();

        cardBalance.put("3454-1234-8976-8765", 7000.00);
        cardBalance.put("3454-1094-8976-8765", 5640.95);
        cardBalance.put("3454-1234-8976-8095", 0.00);

        System.out.println("Добавили карты:");
        printAllEntries(cardBalance);

        cardBalance.remove("3454-1094-8976-8765");
        cardBalance.remove("3454-1234-8976-8095");

        System.out.println("Удалили карты:");
        printAllEntries(cardBalance);

        String searchKey = "3454-1234-8976-8765";
        if (cardBalance.containsKey(searchKey)) {
            System.out.println("Баланс карты " + searchKey + ": " +
                    cardBalance.get(searchKey) + "руб.");
        } else {
            System.out.println("Карта " + searchKey + " не найдена.");
        }
        Set<String> allKeys = cardBalance.keySet();
        System.out.println("Список всех номеров карт:");
        for (String key : allKeys) {
            System.out.println(key);
        }
        System.out.println("Список всех балансов:");
        for (Double balance : cardBalance.values()) {
            System.out.println(balance + "руб.");
        }
        if (!cardBalance.isEmpty()) {
            System.out.println("В коллекции есть элементы!");
        } else {
            System.out.println("Коллекция пуста!");
        }
    }
    public static void printAllEntries(HashMap<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Карта: " + entry.getKey() +
                    ", баланс: " + entry.getValue() + "руб.");
        }
    }
}

package HomeWork_Zarubina;

import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args){
        //getSeason();
        //printNumbers();
        //printEvenNum();
        //checkNumber();
        //determineTemperature();
        //getSquare();
        //getSequence();
        //getNumber();
    }
    //Ввести в консоли любое число от 1 до 12. В зависимости от введенного числа вывести в
    //Консоль соответствующую пору года по номеру месяца. При возможности использовать switch
    public static void getSeason(){
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите любую цифру от 1 до 12: ");
        int number = newScanner.nextInt();
        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println("Вы ввели цифру: " + number + " Сейчас зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Вы ввели цифру: " + number + " Сейчас весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Вы ввели цифру: " + number + " Сейчас лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Вы ввели цифру: " + number + " Сейчас осень!");
                break;
        }
    }
    //используя, while вывести все числа от 0 до 25 в одну строку через пробел
    public static void printNumbers(){
        int x = 0;
        System.out.println("Ряд чисел:");
        while (x <= 25){
            System.out.print(x + " ");
            x++;
        }
        System.out.print("\n");
        System.out.println("-".repeat(33));
    }
    //Используя for вывести каждое чётное число от 2 до 20 включительно и больше 10
    public static void printEvenNum(){
        System.out.println("Ряд чётных чисел:");
        for (int n = 2; (n <= 20); n += 2){
            if (n > 10) {
                System.out.println(n + "_");
            }
        }
    }
    //Напишите программу, которая будет принимать на вход число из консоли и на выход
    //будет выведить сообщение чётное число или нет. Для определения чётности числа используйте
    //операцию получения остатка от деления (операция выглядит так: '% 2')
    public static void checkNumber(){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите число:");
        int enterNumber = newScanner.nextInt();
        int n = enterNumber%2;
        if (n <= 0) {
            System.out.println("Вы ввели число " + enterNumber + " которое является чётным!");
        } else {
            System.out.println("Вы ввели число " + enterNumber + " которое является НЕ чётным!");
        }
    }
    //Для введённого числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold»
    public static void determineTemperature(){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Какая сегодня температура? Введите число:");
        int t = newScanner.nextInt();
        if (t > -5){
            System.out.println("Warm");
        } else if (-5 >= t && (t > -20)){
            System.out.println("Normal");
        } else if (-20 >= t){
            System.out.println("Cold");
        }
    }
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    public static void getSquare(){
        double v = 10;
        int powNumber = 2;
        while (v<21){
            System.out.println(Math.pow(v,powNumber));
            v++;
        }
    }
    //Необходимо, чтобы программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void getSequence(){
        int m = 7;
        while (m<=98) {
            System.out.print(m + " ");
            m += 7;
        }
    }
    //*
    // Напишите программу, где пользователь вводит любое целое положительное число. А
    //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //ввести некорректные данные
    public static void getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число: ");
        int z = scanner.nextInt();
        if (z >= 0){
            for (int w = 1, q = 1; q < z; q++) {
                w += q;
                System.out.println(w);
            }
        }
        else {
            System.out.println("Вы ввели число не удовлетворяющее условиям ввода");
        }
    }
}

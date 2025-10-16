package HomeWork_Zarubina;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
        //getRandomNum();
        //getArray();
        //getMasDouble();
        //workArray();
        //getQuantity();
        //changeLocation();
        getSequence();
        //test();
    }
    // Сгенерировать 5 случайных чисел. Каждое возвести в квадрат
    //и вывести в консоль.
    public static void getRandomNum(){
        Random r = new Random();
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(Math.pow(r.nextInt(1,99),2));
         }
    }
    // Создать массив фруктов и заполнить его 4-мя произвольными фруктами.
    //Вывести в консоль второй и четвёртый.
    //Вывести в консоль длину массива.
    //Третий фрукт заменить на иной.
    //Проверить результат в консоли.
    public static void getArray(){
        String[] fruits = new String[]{"Груша", "Яблоко", "Апельсин", "Маракуйя"};
        System.out.println("Второе и четвёртое значение массива:");
        for (int counter = 0; counter < fruits.length; counter++){
            if (counter == 0  || counter == 2){
             continue;
            }
            System.out.println("Индекс №" + counter + ": " + fruits[counter]);
        }
        System.out.println("Длина массива - " + fruits.length + " позиции");
        int count = 0;
        while (count < fruits.length){
            if (count == 2) {
                fruits[2] = "Лимон";
                System.out.println("Изменённый фрукт: " + fruits[2]);
            }
            count++;
        }
    }
    // Создать пустой массив типа double с названием masDouble такого размера,
    //который пользователь вводит с клавиатуры.
    //Заполнить masDouble рандомными числами, используя Math.random() и вывести его в консоль.
    //Каждый чётный элемент masDouble возвести в квадрат.
    //Вывести массив в прямом и обратном порядке.
    public static void getMasDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int n = scanner.nextInt();
        Double[] masDouble = new Double[n];
        System.out.println("Создан массив masDouble с количеством элементов: " + n);
        for (int counter = 0; counter < n; counter++){
            masDouble[counter] = Math.random();
            System.out.println("Идекс № " + counter + ": " + masDouble[counter]*100);
            masDouble[counter] = masDouble[counter]*100;
        }
        int index = 0;
        System.out.println("Чётные числа в квадрате: ");
        while (index < masDouble.length){
            double  f = masDouble[index];
            int r = (int) f;
            if ((r%2) < 1){
                System.out.println( + Math.pow(r,2));
            }
            index++;
        }
        System.out.println("Перевёрнутый массив:");
        int r = masDouble.length;
        do {
            r--;
            System.out.println(masDouble[r]);
        } while (r > 0);
    }
    // Пользователь с клавиатуры вводит размер массива(простое целое число).
    //Заполнение используя либо Math.random() либо каждый элемент массива вводится пользователем вручную.
    //Найти минимальный-максимальный элементы и вывести в консоль.
    //Найти индексы минимального и максимального элементов и вывести в консоль.
    public static void workArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int g = scanner.nextInt();
        int[] numb = new int[g];
        int counter = 0;
        int x;
        System.out.println("Необходимо последовательно ввести " + g + " любых положительных числа:");
        while (counter < numb.length){
            System.out.println("Введите число: ");
            if ((x = scanner.nextInt()) < 0 ){
                System.out.println("Введённое число не является положительным," +
                        " повторите ввод: ");
                continue;
            };
            numb[counter] = x;
            counter++;
        }
        System.out.println("Прямой порядок:");
        for (int index = 0; index < numb.length; index++){
            System.out.println(numb[index]);
        }
        System.out.println("Обратный порядок:");
        for (int index = numb.length-1; index >= 0; index--){
            System.out.println(numb[index]);
        }
        Arrays.sort(numb);
        System.out.println("Отсортированный порядок:");
        int t = 0;
        while (t < numb.length){
            System.out.println(numb[t]);
            t++;
        }
        String min = "минимальное значение массива = ";
        String max = "МАКСИМАЛЬНОЕ значение массива = ";
        for (int index = 0; index < numb.length; index++){
            if (index == 0){
            System.out.println(min + numb[index] + ", индекс № " + index);
            }
            if (index == numb.length-1){
                System.out.println(max + numb[index] + ", индекс № " + index);
            }
        }
    }
    // Пользователь с клавиатуры вводит размер массива(простое целое число).
    //Заполнение используя либо Math.random() либо каждый элемент массива вводится пользователем вручную.
    //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.
    public static void getQuantity(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int g = scanner.nextInt();
        double[] numb = new double[g];
        int counter = 0;
        for (int index = 0; index < numb.length; index++){
            numb[index] = Math.random() * 100;
            numb[index] = (int) numb[index];
            if (numb[index] == 0){
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Нулевые элементы отсутствуют!");
        }else {
            System.out.println("Количество нулевых элементов = " + counter);
        }
    }
    // Пользователь с клавиатуры вводит размер массива(простое целое число).
    //Заполнение используя либо Math.random() либо каждый элемент массива вводится пользователем вручную.
    //Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
    public static void changeLocation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int g = scanner.nextInt();
        int[] numb = new int[g];
        int counter = 0;
        int x;
        System.out.println("Необходимо последовательно ввести " + g + " любых положительных числа:");
        while (counter < numb.length){
            System.out.println("Введите число: ");
            if ((x = scanner.nextInt()) < 0){
                System.out.println("Введённое число не является положительным," +
                        " повторите ввод: ");
                continue;
            };
            numb[counter] = x;
            counter++;
        }
        int u = numb.length-1;
        System.out.println("Первоначальный порядок массива: ");
        System.out.println(Arrays.toString(numb));
        for (int index = 0; index <= u; index++){
            int temp = numb[u];
            numb[u] = numb[index];
            numb[index] = temp;
            u--;
        }
        System.out.println("Изменён порядок элементов массива:");
        System.out.println(Arrays.toString(numb));
    }
    // Пользователь с клавиатуры вводит размер массива(простое целое число).
    //Заполнение используя либо Math.random() либо каждый элемент массива вводится пользователем вручную.
    //Проверить, является ли массив возрастающей последовательностью
    //(каждое следующее число больше предыдущего)
    public static void getSequence(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int g = scanner.nextInt();
        int[] numb = new int[g];
        int counter = 0;
        int x;
        System.out.println("Необходимо последовательно ввести " + g + " любых положительных числа:");
        while (counter < numb.length){
            System.out.println("Введите число: ");
            if ((x = scanner.nextInt()) < 0){
                System.out.println("Введённое число не является положительным," +
                        " повторите ввод: ");
                continue;
            };
            numb[counter] = x;
            counter++;
        }
        int count = 0;
        int seq = numb.length-1;
        for (int index = 0; index < numb.length; index++){
            if (numb[index] != numb[seq]){
               if (numb[index] < numb[index + 1]){
                    count++;
               } else {
                   break;
               }
            } else {
                count++;
            }
            System.out.println(numb[index]);
        }
        if (count == numb.length){
            System.out.println("Массив " + Arrays.toString(numb) +
                    " является возрастающей последовательностью!");
        } else {
            System.out.println("Нет, массив" + Arrays.toString(numb) +
                    " не является возрастающей последовательностью");
        }
    }
    // * Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999).
    //Задача добавить единицу к этому "числу" и на выходе получить исправленный
    // массив. Массив не содержит нуля в начале, кроме самого числа 0.
    public static void test(){
        //int[] gen = new int[]{1,2,3};
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int g = scanner.nextInt();
        int[] numb = new int[g];
        int counter = 0;
        System.out.println("Необходимо последовательно ввести " + g + " любых положительных числа:");
        while (counter < numb.length){
            System.out.println("Введите число: ");
            if ((x = scanner.nextInt()) < 0){
                System.out.println("Введённое число не является положительным," +
                        " повторите ввод: ");
                continue;
            };
            numb[counter] = x;
            counter++;
        }
        System.out.println(Arrays.toString(numb));

    }
}

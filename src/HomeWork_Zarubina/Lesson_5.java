package HomeWork_Zarubina;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson_5 {
    public static void main(String[] args){
        //fillArray();
        //getArrayTooth();
        //getDiagonal();
        //getMultidimensionalArray();
        //getChessboard();
        //getSnake();
    }
    // Создайте двумерный массив и заполните его псевдослучайными числами
    //с помощью класса Random.
    //Найдите максимальное значение в созданном 2-мерном массиве.
    public static void fillArray(){
        Random unix = new Random();
        double[][] array = new double[2][2];
        double max = 0.0;
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array.length; col++){
                array[row][col] = unix.nextDouble(100);
            }
        }
        System.out.println(Arrays.deepToString(array));
        for (double[] row : array){
            for (double col : row){
                max = Math.max(max, col);
            }
        }
        System.out.println("Максимальное значение: " + max);
    }
    // Создать зубчатый n-мерный массив(от 3 уровней).
    //Посчитать количество ячеек в нём.
    public static void getArrayTooth(){
        int[][] ter = new int[5][];
        ter[0] = new int[4];
        ter[1] = new int[8];
        ter[2] = new int[6];
        ter[3] = new int[3];
        ter[4] = new int[9];
        int i = 0;
        for (int row = 0; row < ter.length; row++){
            for (int col = 0; col < ter[row].length; col++){
                i++;
            }
        }
        System.out.println("Создан многомерный зубчатый " + (ter.length) +  "-уровневый массив: \n"
                + Arrays.deepToString(ter));
        System.out.println("Количество ячеек = " + i);


    }
    // Найдите сумму элементов на главной диагонали.
    public static void getDiagonal(){
        int n = 5;
        int m = 5;
        int[][] array = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                array[i][j] = random.nextInt(100);
            }
        }
        long sum = 0;
        System.out.println("Получили массив: \n" + Arrays.deepToString(array));
        System.out.println("Элементы главной диагонали: ");
        int length = array.length-1;
        for (int i = length; i >= 0; i--){
            System.out.print(array[i][i] + " ");
            System.out.println((sum += array[i][i]));
        }
        System.out.println("Сумма элементов главной диагонали = " + sum);
        System.out.print("\n" +sum);
        System.out.println("Элементы побочной диагонали: ");
        for (int i = 0; i <= length; i++){
            System.out.print(array[i][i] + " ");
            System.out.println((sum += array[i][i]));
        }
        System.out.println("Сумма элементов побочной диагонали = " + sum);
        System.out.print("\n");
        System.out.println(Arrays.deepToString(array));
    }
    // Создать двумерный массив, заполнить его случайными числами.
    //Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //Найти сумму всех получившихся элементов и вывести в консоль.
    public static void getMultidimensionalArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число: ");
        int x = scanner.nextInt();
        Random random = new Random();
        long sum = 0;
        int[][] multiArray = new int[3][2];
        for (int row = 0; row <= multiArray.length-1; row++){
            for (int col = 0; col <= multiArray[row].length-1; col++){
                System.out.print(multiArray[row][col] = random.nextInt(100));
                System.out.print(col + "\t");
                System.out.println(" = " + (multiArray[row][col] += x));
                System.out.println("Сумма: " + (sum += multiArray[row][col]));
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(multiArray));
    }
    // Создать программу для раскладки шахматной доски с помощью цикла.
    //Создать двумерный массив String 8x8. С помощью циклов задать элементам
    //массива значения B(Black) или W(White).
    public static void getChessboard(){
        String[][] ches = new String[8][8];
        String W = new String();
        String B = new String();
        for (int row = 0; row <= ches.length-1; row++){
            for (int col = 0; col <= ches[row].length-1; col++){
                if (row%2 != 0 && col%2 != 0 || row%2 == 0 && col%2 == 0){
                    ches[row][col] = "W";
                }
                if (row%2 != 0 && col%2 == 0 || row%2 == 0 && col%2 != 0){
                    ches[row][col] = "B";
                }
            }
        }
        System.out.println(Arrays.deepToString(ches));
        for (int row = 0; row <= ches.length-1; row++) {
            for (int col = 0; col <= ches[row].length - 1; col++) {
                System.out.print(ches[col][row] + "\t");
            }
            System.out.println();
        }
    }
    // * Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой.
    //Программа получает на вход два числа n и m.
    //Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3 символа.
    public static void getSnake(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int n = scanner.nextInt();
        long sum = 1;
        System.out.println("Введите второе число: ");
        int m = scanner.nextInt();
        int[][] snake = new int[n][m];
        for (int row = 0; row <= snake.length-1; row++){
            for (int col = 0; col <= snake[row].length-1; col++){
                snake[row][col] = 0;
            }
        }
        for (int row = 0; row <= snake.length-1; row++) {
            for (int col = 0; col <= snake.length - 1; col++) {
                int i = row + 1;
                int y = col + 1;
                snake[row][col] = ((i - 1) * n + y) * (i%2) + (i * n + 1 - y) * ((i + 1)%2);
            }
        }
        for (int row = 0; row <= snake.length-1; row++) {
            for (int col = 0; col <= snake.length - 1; col++) {
                System.out.print(snake[col][row] + "\t");
            }
            System.out.println();
        }
    }
}

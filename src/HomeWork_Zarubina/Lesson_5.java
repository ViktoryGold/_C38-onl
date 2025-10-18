package HomeWork_Zarubina;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Lesson_5 {
    public static void main(String[] args) {
        //fillArray();
        //getArrayTooth();
        //getDiagonal();
        getMultidimensionalArray();

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
}

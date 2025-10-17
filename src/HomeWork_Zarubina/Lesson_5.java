package HomeWork_Zarubina;

import java.util.Arrays;
import java.util.Queue;
import java.util.Random;

public class Lesson_5 {
    public static void main(String[] args) {
        fillArray();

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
}

package Lesson_6;

public class Calculator {
    public double weight;
    public int cost;
    public String color;
    public int sum;
    public int minus;
    public double division;
    public int multiplication;

    public void getSum(int firstNumber, int secondNumber){
        sum = firstNumber + secondNumber;
        System.out.println("Result is: ");
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }
    public void getMinus(int firstNumber, int secondNumber){
        minus = firstNumber - secondNumber;
        System.out.println("Result is: ");
        System.out.println(firstNumber + " - " + secondNumber + " = " + minus);
    }
    public void getDivision(int firstNumber, int secondNumber){
        division = (double) firstNumber / secondNumber;
        System.out.println("Result is: ");
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
    public void getMultiplication(int firstNumber, int secondNumber){
        multiplication = firstNumber * secondNumber;
        System.out.println("Result is: ");
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
    }

    public void getInform(){
        System.out.println("A calculator object is created:");
        System.out.println("\tweight: " + weight);
        System.out.println("\tcost: " + cost);
        System.out.println("\tcolor: " + color);
    }
}

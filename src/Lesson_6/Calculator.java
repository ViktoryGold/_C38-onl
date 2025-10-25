package Lesson_6;

public class Calculator {
    private double weight;
    private int cost;
    private String color;
    private int sum;
    private int minus;
    private double division;
    private int multiplication;

    public Calculator(){
    }

    public Calculator(double weight, int cost, String color){
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public void setVar(double w, int c, String col){
        weight = w;
        cost = c;
        color = col;
    }
   @Override public String toString(){
        return "A calculator object is created: \n" +
                "\tweight: " + weight + "\n" +
                "\tcost: " + cost + "\n" +
                "\tcolor: " + color;
   }
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
}



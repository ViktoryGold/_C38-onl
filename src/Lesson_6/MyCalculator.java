package Lesson_6;

public class MyCalculator {
    public static void main(String[] args){
        //createCalculator();

    }
    public static void createCalculator(){
        Calculator asus = new Calculator();

        asus.weight = 123.03;
        asus.cost = 2600;
        asus.color = "blue";

        asus.getInform();

        System.out.println("-".repeat(55));

        asus.getSum(3,4);
        asus.getMinus(2,1);
        asus.getDivision(6,2);
        asus.getMultiplication(5,3);

    }
}

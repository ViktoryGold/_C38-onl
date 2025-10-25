package Lesson_6;

public class MyCalculator {
    public static void main(String[] args){
        //createCalculator();

    }
    public static void createCalculator(){
        Calculator asus = new Calculator();
        asus.setVar(128,4500,"Blue");
        Calculator lenovo = new Calculator(234,5640,"Black");

        System.out.println(asus);
        System.out.println(lenovo);

        System.out.println("-".repeat(55));

        asus.getSum(3,4);
        asus.getMinus(2,1);
        asus.getDivision(6,2);
        asus.getMultiplication(5,3);

    }
}

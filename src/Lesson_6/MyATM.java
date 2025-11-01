package Lesson_6;

public class MyATM {
    public static void main(String[] args){
        //createATM();
    }
    public static void createATM(){
        ATM vega = new ATM(10,2,3);
        vega.addMoney(1,1,1);
        vega.minusMoney(750);
        System.out.println();

    }
}

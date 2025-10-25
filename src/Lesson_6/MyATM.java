package Lesson_6;

public class MyATM {
    public static void main(String[] args){
        createATM();
    }
    public static void createATM(){
        ATM vega = new ATM(1,2,1);
        vega.addMoney(1,5,2);
        vega.minusMoney(171, 2,3,1);
        System.out.println();

    }
}

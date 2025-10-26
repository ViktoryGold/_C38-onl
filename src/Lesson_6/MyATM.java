package Lesson_6;

public class MyATM {
    public static void main(String[] args){
        createATM();
    }
    public static void createATM(){
        ATM vega = new ATM(1,0,3);
        vega.addMoney(0,0,2);
        vega.minusMoney(430);
        System.out.println();

    }
}

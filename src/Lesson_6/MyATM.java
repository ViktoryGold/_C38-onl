package Lesson_6;

public class MyATM {
    public static void main(String[] args){
        createATM();
    }
    public static void createATM(){
        ATM vega = new ATM(2,2,3);
        vega.addMoney(2,0,2);
        vega.minusMoney(630);
        System.out.println();

    }
}

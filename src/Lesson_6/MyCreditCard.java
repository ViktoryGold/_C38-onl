package Lesson_6;

public class MyCreditCard {
    public static void main(String[] args){
        //createCreditCard();
    }
    public static void createCreditCard(){
        CreditCard saber = new CreditCard();
        saber.setVar("BY566890975432",450_000);

        CreditCard oral = new CreditCard();
        oral.setVar("BY567543224032",200_000);

        CreditCard vtb = new CreditCard();
        vtb.setVar("BY761290975987",1_000_000);

        saber.getCalculateAmount(39);
        System.out.println(saber);

        oral.getCalculateAmount(450_000);
        System.out.println(oral);

        vtb.getWithdrawAmount(555_000);
        System.out.println(vtb);
    }
}




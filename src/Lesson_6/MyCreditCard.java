package Lesson_6;

public class MyCreditCard {
    public static void main(String[] args){
        createCreditCard();

    }
    public static void createCreditCard(){
        CreditCard sber = new CreditCard();

        sber.accountNumber = "BY566890975432";
        sber.currentAmount = 450_000;

        CreditCard yral = new CreditCard();

        yral.accountNumber = "BY567543224032";
        yral.currentAmount = 200_000;

        CreditCard vtb = new CreditCard();

        vtb.accountNumber = "BY761290975987";
        vtb.currentAmount =1_000_000;

        sber.calculateAmount(39);
        sber.currentInformation();

        yral.calculateAmount(450_000);
        yral.currentInformation();

        vtb.withdrawAmount(555_000);
        vtb.currentInformation();
    }
}

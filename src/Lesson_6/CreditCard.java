package Lesson_6;

public class CreditCard {
    private String accountNumber;
    private double currentAmount;

    public void setVar(String accNum, double curAm){
        accountNumber = accNum;
        currentAmount = curAm;
    }
    public CreditCard(){

    }

    public  void getCalculateAmount(double money){
        currentAmount += money;
        System.out.println("На ваш счёт поступило " + money);
    }

    public void getWithdrawAmount(double money){
        currentAmount -= money;
        System.out.println("С вашего счёта списали " + money);
    }

    @Override public String toString(){
        return "На вашем счету " + accountNumber +
                " - " + currentAmount;
    }
}

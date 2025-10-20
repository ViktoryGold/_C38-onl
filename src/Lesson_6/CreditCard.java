package Lesson_6;

public class CreditCard {
    public String accountNumber;
    public double currentAmount;

    public void calculateAmount(double money){
        currentAmount += money;
        System.out.println("На ваш счёт поступила сумма " + money);

    }
    public void withdrawAmount(double money){
        currentAmount -= money;
        System.out.println("С вашего счёта списали " + money);

    }
    public void currentInformation(){
        System.out.println("На вашем счету " + currentAmount);

    }
}

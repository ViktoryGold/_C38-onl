package Lesson_6;

public class ATM {
    int banknote_20 = 20;
    int banknote_50 = 50;
    int banknote_100 = 100;
    int bankAccount;

    public ATM(int a, int b, int c){
        banknote_20 *= a;
        banknote_50 *= b;
        banknote_100 *= c;
        bankAccount = banknote_20 + banknote_50 + banknote_100;
        System.out.println("Количество банкнот: ");
        System.out.println("Номиналом 20 рублей: " + a + " - " + banknote_20);
        System.out.println("Номиналом 50 рублей: " + b + " - " + banknote_50);
        System.out.println("Номиналом 100 рублей: " + c + " - " + banknote_100);
        System.out.println("На вашем счету: " + bankAccount);
    }

    public void addMoney(int a, int b, int c){
        banknote_20 *= a;
        banknote_50 *= b;
        banknote_100 *= c;
        bankAccount = banknote_20 + banknote_50 + banknote_100;
        System.out.println("Количество банкнот: ");
        System.out.println("Номиналом 20 рублей: " + a + " - " + banknote_20);
        System.out.println("Номиналом 50 рублей: " + b + " - " + banknote_50);
        System.out.println("Номиналом 100 рублей: " + c + " - " + banknote_100);
        System.out.println("На вашем счету: " + bankAccount);
    }
    public void info(int a, int b, int c){

    }
    public void minusMoney(int money, int a, int b, int c){
        boolean i = true;
        money = a + b + c;
        if (bankAccount >= money) {
            bankAccount -= money;
            info(a,b,c);
        } else {
            i = false;
        }
    }
}


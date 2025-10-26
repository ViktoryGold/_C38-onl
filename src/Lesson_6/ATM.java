package Lesson_6;

public class ATM {
    int banknote_20 = 20;
    int banknote_50 = 50;
    int banknote_100 = 100;
    int bankAccount;

    public int getBankAccount(int a, int b, int c) {
        System.out.println("Количество банкнот: ");
        System.out.println("Номиналом 20 рублей: " + a + " - " + banknote_20);
        System.out.println("Номиналом 50 рублей: " + b + " - " + banknote_50);
        System.out.println("Номиналом 100 рублей: " + c + " - " + banknote_100);
        System.out.println("На вашем счету: " + bankAccount);
        return bankAccount;
    }

    public ATM(int a, int b, int c){
        banknote_20 *= a;
        banknote_50 *= b;
        banknote_100 *= c;
        bankAccount = banknote_20 + banknote_50 + banknote_100;
        getBankAccount(a, b, c);
    }

    public void addMoney(int a, int b, int c){
        banknote_20 += (a * 20);
        banknote_50 += (b * 50);
        banknote_100 += (c * 100);
        bankAccount = banknote_20 + banknote_50 + banknote_100;
        getBankAccount(a, b, c);
    }

    public void minusMoney(int money){
        boolean i = true;
        int value = money;
        int c = 0;
        int b = 0;
        int d = 0;
        int a = 0;
        int ar = 0;
        int br = 0;
        int cr = 0;
        if (bankAccount >= money){
            c = (int) money / 100;
            System.out.print("Выдано количество ");
            if ((c * 100) >= banknote_100){
                money -= banknote_100;
                bankAccount -= banknote_100;
                ar = banknote_100;
                System.out.println("банкнот номиналом 100: " + banknote_100/100);
                banknote_100 = 0;
                if (money > 0){
                    b = (int) money / 50;
                    if ((b * 50) >= banknote_50){
                        money -= banknote_50;
                        bankAccount -= banknote_50;
                        br = banknote_50;
                        System.out.println("банкнот номиналом 50: " + banknote_50/50);
                        banknote_50 = 0;
                        if (money > 0) {
                            a = (int) money / 20;
                            if ((a * 20) >= banknote_20) {
                                money -= banknote_20;
                                bankAccount -= banknote_20;
                                cr = banknote_20;
                                System.out.println("банкнот номиналом 20: " + banknote_20/20);
                                banknote_20 = 0;
                            } else {
                                int index = 0;
                                d = banknote_20/20;
                                while ((d > 0) && (money > 19)){
                                    banknote_20 = banknote_20 - 20;
                                    money -= 20;
                                    index++;
                                    d--;
                                }
                                cr = index * 20;
                                bankAccount -= cr;
                                System.out.println("банкнот номиналом 20: " + index);
                            }
                        }
                    } else {
                        int index = 0;
                        d = banknote_50/50;
                        while ((d > 0) && (money > 49)){
                            banknote_50 = banknote_50 - 50;
                            money -= 50;
                            index++;
                            d--;
                        }
                        br = index * 50;
                        bankAccount -= br;
                        System.out.println("банкнот номиналом 50: " + index);
                        if (money > 0) {
                            a = (int) money / 20;
                            if ((a * 20) >= banknote_20) {
                                money -= banknote_20;
                                bankAccount -= banknote_20;
                                cr = banknote_20;
                                System.out.println("банкнот номиналом 20: " + banknote_20/20);
                                banknote_20 = 0;
                            } else {
                                index = 0;
                                d = banknote_20/20;
                                while ((d > 0) && (money > 19)){
                                    banknote_20 = banknote_20 - 20;
                                    money -= 20;
                                    index++;
                                    d--;
                                }
                                cr = index * 20;
                                bankAccount -= cr;
                                System.out.println("банкнот номиналом 20: " + index);
                            }
                        }
                    }
                }
            } else {
                int index = 0;
                d = banknote_100/100;
                while ((c > 0) && (money > 99)){
                    banknote_100 = banknote_100 - 100;
                    money -= 100;
                    index++;
                    d--;
                }
                ar = index * 100;
                bankAccount -= ar;
                System.out.println("банкнот номиналом 100: " + index);
                if (money > 0){
                    b = (int) money / 50;
                    if ((b * 50) >= banknote_50){
                        money -= banknote_50;
                        bankAccount -= banknote_50;
                        br = banknote_50;
                        System.out.println("банкнот номиналом 50: " + banknote_50/50);
                        banknote_50 = 0;
                        if (money > 0) {
                            a = (int) money / 20;
                            if ((a * 20) >= banknote_20) {
                                money -= banknote_20;
                                bankAccount -= banknote_20;
                                cr = banknote_20;
                                System.out.println("банкнот номиналом 20: " + banknote_20/20);
                                banknote_20 = 0;
                            } else {
                                index = 0;
                                d = banknote_20/20;
                                while ((d > 0) && (money > 19)){
                                    banknote_20 = banknote_20 - 20;
                                    money -= 20;
                                    index++;
                                    d--;
                                }
                                cr = index * 20;
                                bankAccount -= cr;
                                System.out.println("банкнот номиналом 20: " + index);
                            }
                        }
                    } else {
                        index = 0;
                        d = banknote_50/50;
                        while ((d > 0) && (money > 49)){
                            banknote_50 = banknote_50 - 50;
                            money -= 50;
                            index++;
                            d--;
                        }
                        br = index * 50;
                        bankAccount -= br;
                        System.out.println("банкнот номиналом 50: " + index);
                        if (money > 0) {
                            a = (int) money / 20;
                            if ((a * 20) >= banknote_20) {
                                money -= banknote_20;
                                bankAccount -= banknote_20;
                                cr = banknote_20;
                                System.out.println("банкнот номиналом 20: " + banknote_20/20);
                                banknote_20 = 0;
                            } else {
                                index = 0;
                                d = banknote_20/20;
                                while ((d > 0) && (money > 19)){
                                    banknote_20 = banknote_20 - 20;
                                    money -= 20;
                                    index++;
                                    d--;
                                }
                                cr = index * 20;
                                bankAccount -= cr;
                                System.out.println("банкнот номиналом 20: " + index);
                            }
                        }
                    }
                }
            }
            inform(value, ar, br, cr, money);
        } else {
            i = false;
            inform(value, ar, br, cr, money);
        }
    }

    public void inform(int val, int a, int b, int c, int mon){
        System.out.println("Был запрос на сумму: " + val);
        System.out.println("Выдано: " + (a + b + c));
        System.out.println("Остаток не выданных средств: " + mon);
        System.out.println("Остаток на карте: " + bankAccount);
    }
}


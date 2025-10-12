package HomeWork_Zarubina;

public class Lesson_1{
    public static void main(String[] args){
        System.out.println("Привет, мир!");
        createInitials();
        getAge();
        calculationValue();
        getSum();
        getNum();
        getRound();
        getDevision();
        changeVariables();
        difficultReplacement();
    }
    public static void createInitials(){
        String name = "Виктория";
        String surname = "Зарубина";
        System.out.print("Меня зовут " + name + " " + surname + ".");
    }
    public static void getAge(){
        int age = 43;
        System.out.println(" Мне " + age + " года.");
    }
    public static void calculationValue(){
        double a;
        int b = 15;
        int c = 45;
        a = 4 * (b + c - 1)/2;
        System.out.println("Значение по формуле: " + a);
    }
    public static void getSum(){
        int n = 26;
        int c = n%10;
        int b = (n - c)/10;
        System.out.println(b + c + " (" + b + " + " + c +")");
    }
    public static void getNum(){
        int n = 126;
        int c = n%100;
        int b = (n-c)/100;
        int r = c%10;
        int d = (c-b)/10;
        int v = b + d + r;
        System.out.println(v + " (" + b + " + " + d + " + " + r + ")");
    }
    public static void getRound(){
        double n = 6.786;
        int g = (int) n;
        System.out.println("Преобразование дробного числа " + n + " в целое " + g);
    }
    public static void getDevision(){
        int q = 21;
        int w = 8;
        int x = q/w;
        int u = q%w;
        System.out.println("Результат деления " + x + " и остаток " + u);
    }
    public static void changeVariables(){
        int a = 1;
        int b = 2;
        int c = a;
        a = b;
        b = c;
        System.out.println("Значения переменных: а=" + a + ", b=" + b);
    }
    public static void difficultReplacement(){
        int a = 1;
        int b = 2;
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println("Сложный вариант решения*");
        System.out.println("Значения переменных: а=" + a + ", b=" + b);
    }
}

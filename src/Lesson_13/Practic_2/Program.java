package Lesson_13.Practic_2;

public class Program {
    public static void main(String[] args) {
        createPerson();

    }
    public static void createPerson() {
        try {
            Person den = new Person(21);
            System.out.println("Создан " + den);
            Person gleb = new Person(101);
            System.out.println("Создан " + gleb);
        } catch (MyException e) {
            System.out.println("Человек не создан. " +
                    "Возраст не соответствует. " + e.getMessage());
        }
    }
}

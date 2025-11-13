package Lesson_10.Practic_1;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        createObj();

    }
    public static void createObj() throws CloneNotSupportedException {
        Person fred = new Person("Fred", 48,56000, new Cat("Myrka"));
        System.out.println(fred.hashCode());
        System.out.println(fred);
        Person fredClone = fred.clone();
        fredClone.name = "Bred";
        fredClone.setAge(12);
        fredClone.setSalary(6500);
        fredClone.setCat(new Cat("Deby"));
        System.out.println(fredClone);
        System.out.println(fred.equals(fredClone));
    }
}

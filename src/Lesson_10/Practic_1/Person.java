package Lesson_10.Practic_1;

public class Person implements Cloneable{
    public String name;
    private int age;
    private double salary;
    Cat cat;

   public Person(String name, int age, double salary, Cat cat) {
       this.name = name;
       this.age = age;
       this.salary = salary;
       this.cat = cat;
   }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public int hashCode() {
        return 7 * name.hashCode();
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public String toString() {
        return "Person: " + name + "\n" +
                "\t\tage: " + age + "\n" +
                "\t\tsalary: " + salary + "\n" +
                "\t\tcat: " + cat.name;
    }
}

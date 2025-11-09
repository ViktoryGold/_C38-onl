package Lesson_9.HW_task_star_star;

public class Person implements Cloneable{
    String name;
    Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Person cloned = (Person) super.clone();
        cloned.address = (Address) this.address.clone();
        return cloned;
    }
}

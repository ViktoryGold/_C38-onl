package Lesson_9.HW_task_star_star;

public class Address implements Cloneable{
    String city;

    public Address(String city){
        this.city = city;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

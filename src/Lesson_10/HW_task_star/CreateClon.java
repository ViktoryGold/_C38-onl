package Lesson_10.HW_task_star;

import Lesson_10.HW_task_1.User;

public class CreateClon {
    public static void main(String[] args)throws CloneNotSupportedException {
        create();

    }
    public static void create()throws CloneNotSupportedException {
        Address address = new Address("Derebasovskay", "Moskow");
        User user = new User();
        user.setId(98567L);
        user.setUserName("eddy");
        user.setPassword("qwerty98");
        user.setFirstName("Eddy");
        user.setLastName("Megan");
        user.setRole("admin");

        User shallow = user.clone();
        shallow.setUserName("Rick");
        User deep = user.deepClone();
        deep.setRole("viewer");

        typeClone(user.getId(), deep);
    }
    public static void typeClone(long i, User deep){
        System.out.println(deep);
    }
}

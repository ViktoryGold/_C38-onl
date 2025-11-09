package Lesson_9.HW_task_star_star;

public class Program {
    public static void main(String[] args){
        createDeepClone();
    }
    public static void createDeepClone(){
        try {
            Person p_1 = new Person("Милана", new Address("Изюм"));
            Person p_2 = (Person) p_1.clone();

            System.out.println("Оригинал: " + p_1.name + ", " + p_1.address);
            System.out.println("Клон: " + p_2.name + ", " + p_2.address);

            p_2.address = new Address("Сочи");
            System.out.println("После изменений:");
            System.out.println("Оригинал: " + p_1.address);
            System.out.println("Клон: " + p_2.address);
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }





    };
}

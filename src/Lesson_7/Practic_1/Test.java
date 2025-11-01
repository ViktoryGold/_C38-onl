package Lesson_7.Practic_1;

public class Test {
    public static void main(String[] args){
        House house = new House("House");
        Garage garage = new Garage("Garage");
        System.out.println(house.getType());
        System.out.println(garage.getType());
    }
}

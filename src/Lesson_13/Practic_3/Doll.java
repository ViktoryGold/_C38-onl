package Lesson_13.Practic_3;

public class Doll {
    public void getPrice(int price) {
        try {
            if (price < 0) {
                throw new MyException("Цена не может быть отрицательной!");
            }
            System.out.println("Цена: " + price);
        } catch (MyException e) {
            System.out.println("Ошибка ввода цены: " + e.getMessage());
        }
    }
}

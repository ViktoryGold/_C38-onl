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
    public void parceDivide(String serialNumber, int divisor) {
        try {
            int number = Integer.parseInt(serialNumber);
            int result = number / divisor;
            System.out.println("Результат деления: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Описание ошибки: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Описание ошибки: " + e.getMessage());
        }
    }
    public void multipleException(String serialNumber, int accessories) {
        try {
            int number = Integer.parseInt(serialNumber);
            System.out.println("Введён серийный номер: " + number);
            String[] array = {"платье", "сумочка", "туфли"};
            System.out.println("Выбранный аксессуар: " + array[accessories]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Описание ошибки: " + e.getClass().getSimpleName() +
                    " - " + e.getMessage());
        }
    }
    public void readData(boolean simulateError) {
        boolean resourceOpened = false;
        try {
            resourceOpened = true;
            System.out.println("Читаем инструкцию...");
            if (simulateError) {
                throw new RuntimeException("Произошла ошибка при чтении инструкции");
            }
            System.out.println("Инструкция успешно прочитана.");
        } catch (RuntimeException e) {
            System.out.println("Ошибка во время чтения: " + e.getMessage());
        } finally {
            if (resourceOpened) {
                System.out.println("Ресурс закрыт.");
            }
        }
    }
}

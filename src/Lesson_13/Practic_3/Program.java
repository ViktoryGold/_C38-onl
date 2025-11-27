package Lesson_13.Practic_3;

public class Program {
    public static void main(String[] args) {
        createDoll();
    }
    public static void createDoll() {
        Doll barby = new Doll();

        barby.getPrice(-9);
        barby.parceDivide("45", 0);
        barby.multipleException("12ш", 5);
        barby.readData(false);
    }

}

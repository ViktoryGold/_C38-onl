package Lesson_17.Practic_4;

public class LambdaExample {
    public static void main(String[] args) {
        CompareLogic logic = (a, b) -> {
            if (a < b) {
                return a;
            } else if (a > b) {
                return b;
            } else {
                return 0;
            }
        };
        System.out.println(logic.decide(8,9));
        System.out.println(logic.decide(67,23));
        System.out.println(logic.decide(55,55));
    }
}

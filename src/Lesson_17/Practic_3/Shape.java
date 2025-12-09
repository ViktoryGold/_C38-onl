package Lesson_17.Practic_3;

public class Shape {
    public static void main(String[] args) {
        IShape square = (a, b) -> a * b;
        IShape triangle = (a, h) -> 0.5 * a * h;

        int side_a = 6;
        int side_b = 6;
        int base = 5;
        int height = 3;

        double squareArea = square.getSquare(side_a, side_b);
        double triangleArea = triangle.getSquare(base, height);
        System.out.println("Площадь квадрата: " + squareArea);
        System.out.println("Площадь треугольника: " + triangleArea);
    }
}

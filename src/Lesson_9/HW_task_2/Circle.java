package Lesson_9.HW_task_2;

public class Circle extends Figure{
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    double getSquare() {
        return radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * Math.PI * 2;
    }
}

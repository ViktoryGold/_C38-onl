package Lesson_9.HW_task_2;

public class Rectangle extends Figure{
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double getSquare() {
        return this.width + this.height;
    }

    @Override
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }
}

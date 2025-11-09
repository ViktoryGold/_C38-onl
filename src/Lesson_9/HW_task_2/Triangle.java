package Lesson_9.HW_task_2;

public class Triangle extends Figure{
    int a;
    int b;
    int c;
    double p = getSemiperimeter();

    public Triangle(int x, int y, int a, int b, int c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getSemiperimeter(){
        return (double) (a + b + c) / 2;
    }

    @Override
    double getSquare() {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

package Lesson_9.HW_task_2;

public abstract class Figure {
    int x;
    int y;

    Figure(int x, int y){
        this.x = x;
        this.y = y;
    }
    abstract double getSquare();
    abstract double getPerimeter();
}

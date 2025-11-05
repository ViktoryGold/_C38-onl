package Lesson_8.task_star_star;

public class Cooler {
    private final String type;
    private final double power;
    private final double speed;

    public Cooler(String type, double power, double speed){
        this.type = type;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\t\tType: " + "\n" +
                "\t\tPower: " + "\n" +
                "\t\tSpeed: " + speed;
    }
}

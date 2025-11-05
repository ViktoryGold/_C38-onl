package Lesson_8.task_star_star;

public class HDD {
    private final String model;
    private final String type;
    private final double capacity;

    public HDD(String model, String type, double capacity){
        this.model = model;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "\t\tModel: " + type + "\n" +
                "\t\tType: " + type + "\n" +
                "\t\tCapacity: " + capacity;
    }
}

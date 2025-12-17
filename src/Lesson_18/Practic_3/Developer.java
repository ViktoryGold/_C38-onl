package Lesson_18.Practic_3;

public class Developer {
    private int id;
    private String name;

    public Developer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Developer:\n" +
                "\t\tid = " + id + "\n" +
                "\t\tname = " + name;
    }
}

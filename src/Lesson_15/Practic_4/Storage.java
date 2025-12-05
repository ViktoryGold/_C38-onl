package Lesson_15.Practic_4;

public class Storage<T> {
    private T value;

    public Storage() {
        this.value = null;
    }
    public Storage (T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Storage:\n" +
                "\tvalue = " + value;
    }
}

package Lesson_15.HW_task_star_star_star;

import java.io.Serializable;
import java.util.Arrays;

public class Terminal implements Serializable {
    private String[] parameters;

    private int count;

    public Terminal(String[] params) {
        this.parameters = params;
        this.count = params.length;
    }

    public String[] getParameters() {
        return parameters;
    }
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "parameters=" + Arrays.toString(parameters) +
                ", count=" + count + '}';
    }
}

package Lesson_8.task_star_star;

import java.util.concurrent.atomic.AtomicLong;

public class DebuggableClass {
    private static final AtomicLong ID_GENARATOR = new AtomicLong();
    private final long instanceld = ID_GENARATOR.incrementAndGet();
    private String name;

    @Override
    public String toString() {
        return "DebuggableClass{" +
                "instanceld = " + instanceld +
                ", name = " + name + "\"" +
                ", identityHash = " + Integer.toHexString(System.identityHashCode(this)) +
                "}";
    }
}

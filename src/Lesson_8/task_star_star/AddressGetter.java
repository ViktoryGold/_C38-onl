package Lesson_8.task_star_star;

import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class AddressGetter {
    @Override
    public String toString() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);
            long objectAddress = unsafe.getInt(this, 8L);
            return "ObjectAddress: " + objectAddress;
        } catch (Exception e) {
            e.printStackTrace();
            return "Error getting address";
        }
    }
}

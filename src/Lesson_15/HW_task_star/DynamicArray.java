package Lesson_15.HW_task_star;

import java.util.*;
import static java.lang.reflect.Array.*;

public class DynamicArray<T> implements Iterable<T> {
    private T[] elements;
    private int size;
    private final int initialCapacity;

    public DynamicArray(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Начальный размер должен быть > 0");
        }
        this.initialCapacity = initialCapacity;
        this.elements = (T[]) new Object[initialCapacity];
        this.size = 0;
    }
    public DynamicArray() {
        this(10);
    }
    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Нет такого индекса");;
        }
        for (int i = index; i < size-1; i++) {
            elements[i] = elements[i+1];
        }
        System.out.println("Элемент успешно удалён.");
        elements[--size] = null;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс " + index + " вне диапазона [0, " + (size - 1) + "]");
        }
        return elements[index];
    }
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(element, elements[i])) {
                return i;
            }
        }
        return -1;
    }
    public boolean contains(T element) {
        return indexOf(element) != -1;
    }
    public int size() {
        return size;
    }
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private void ensureCapacity() {
        if (size >= elements.length) {
            int newCapacity = elements.length * 2;
            elements = (T[]) newInstance(elements.getClass().getComponentType(), newCapacity);
            System.arraycopy(elements,0, elements,0, size);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elements[currentIndex++];
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

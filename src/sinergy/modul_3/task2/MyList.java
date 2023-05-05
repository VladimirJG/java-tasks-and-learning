package sinergy.modul_3.task2;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class MyList<T> extends AbstractList<T> {
    private int size;
    private static final int DEFAULT_CAPACITY = 12;
    private Object elements[];

    MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        elements = new Object[capacity];
    }


    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index = " + index + ", " + "Size = " + size);
        }
        return (T) elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, T element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index = " + index + ", " + "Size = " + size);
        }
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index = " + index + ", " + "Size = " + size);
        }
        Object item = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (T) item;
    }

    private void ensureCapacity() {
        int newSize = elements.length + elements.length / 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public static void main(String[] args) {
        List<Integer> list = new MyList<>();
        System.out.println(list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }
}
//ни ... не понятно, но очень интересно.
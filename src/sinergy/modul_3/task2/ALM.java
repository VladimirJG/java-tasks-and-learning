package sinergy.modul_3.task2;

import java.util.AbstractList;
import java.util.Arrays;

public class ALM<T> extends AbstractList<T> {
    private int DEFAULT_CAPACITY = 15;
    private Object[] elementData;
    private int size = 0;

    public ALM() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ALM(int capacity) {
        elementData = new Object[capacity];
    }


    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Вводимое значение " + index + " не входит в размер массива");
        }
        return (T) elementData[index];
    }

    @Override
    public int size() {
        return size;
    }

    private void resizing() {
        int newSize = elementData.length + elementData.length / 2;
        elementData = Arrays.copyOf(elementData, newSize);
    }

    @Override
    public void add(int index, T element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Вводимое значение " + index + " не входит в размер массива");
        }
        if (index == elementData.length) {
            resizing();
        }
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        T symbol = get(index);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        return symbol;
    }
}

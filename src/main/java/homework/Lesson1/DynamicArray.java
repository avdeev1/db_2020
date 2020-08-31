package homework.Lesson1;

import java.util.Arrays;

class DynamicArray<T> implements DynamicGenericArray<T> {
    private final int DEFAULT_INITIAL_CAPACITY = 10;

    private int initialSize;
    private int size = 0;
    private Object[] list;

    public DynamicArray() {
        this.initialSize = this.DEFAULT_INITIAL_CAPACITY;
        list = new Object[this.initialSize];
    }

    public DynamicArray(final int initialSize) {
        this.initialSize = initialSize;
        list = new Object[this.initialSize];
    }

    private void checkSize() {
        if (this.size >= this.list.length - 1) {
            this.initialSize *= 1.5;
            Object[] newList = new Object[this.initialSize];
            System.arraycopy(this.list, 0, newList, 0, this.list.length);
            this.list = newList;
        }
    }

    private int indexOf(Object value) {
        for (int i = 0; i < this.size; i++) {
            if (this.list[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < this.size) {
            return (T) this.list[index];
        } else {
            throw new ArrayIndexOutOfBoundsException("Ooops");
        }
    }

    @Override
    public void add(T value) {
        this.list[size++] = value;
        this.checkSize();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(T value) {
        return this.indexOf(value) >= 0;
    }

    @Override
    public T pop() {
        T result = (T) this.list[size - 1];
        this.list[size - 1] = null;
        this.size--;

        return result;
    }

    @Override
    public String toString() {
        Object[] listToPrint = new Object[this.size];
        System.arraycopy(this.list, 0, listToPrint, 0, this.size);
        return Arrays.toString(listToPrint);
    }
}
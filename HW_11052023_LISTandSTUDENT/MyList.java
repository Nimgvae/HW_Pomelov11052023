package HW_11052023_LISTandSTUDENT;

import java.util.Arrays;
import java.util.Collection;

public class MyList<T> {
    private T[] array;
    private int size;

    public MyList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public void add(T item) {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = item;
    }
    public int size() {
        return size;
    }
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }
    @Override
    public String toString() {
        return "MyList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }


}

package homework.Lesson1;

/**
 * @author Ivan Avdeev
 */


//todo write an implementation of this interface

public interface DynamicGenericArray<T> {
    T get(int index);

    T pop();

    void add(T value);  //todo add value to the end of this data structure

    int size();

    boolean isEmpty();

    boolean contains(T value);
}

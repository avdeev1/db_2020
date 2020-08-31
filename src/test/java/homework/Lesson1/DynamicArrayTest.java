package homework.Lesson1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DynamicArrayTest {

    @Test
    public void get() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("Hello");
        dynamicArray.add("world");

        Assert.assertEquals(dynamicArray.get(0), "Hello");
        Assert.assertEquals(dynamicArray.get(1), "world");
    }

    @Test
    public void add() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        Assert.assertEquals(dynamicArray.get(0), Integer.valueOf(1));
        Assert.assertEquals(dynamicArray.get(1), Integer.valueOf(2));
        Assert.assertEquals(dynamicArray.get(2), Integer.valueOf(3));
    }

    @Test
    public void size() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        Assert.assertEquals(dynamicArray.size(), 3);
    }

    @Test
    public void isEmpty() {
        DynamicArray dynamicArray = new DynamicArray(1000);
        Assert.assertEquals(true, dynamicArray.isEmpty());
    }

    @Test
    public void contains() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        assertTrue(dynamicArray.contains(1));
        assertFalse(dynamicArray.contains(4));
    }

    @Test
    public void pop() {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        Assert.assertEquals(Integer.valueOf(3), dynamicArray.pop());
    }
}
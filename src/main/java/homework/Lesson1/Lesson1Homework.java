package homework.Lesson1;

public class Lesson1Homework {
    public static void main(String[] args) {
        DynamicArray<String> dynamicArray1 = new DynamicArray<>();
        dynamicArray1.add("Hello");
        dynamicArray1.add("world!");

        System.out.println(dynamicArray1.contains("Hello"));
        System.out.println(dynamicArray1.contains("hello"));
        System.out.println(dynamicArray1.get(0));

    }
}
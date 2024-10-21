package collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class MaxValueWithComparator {
    public static void main(String[] args) {
        // Create a map with integer keys and string values
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(5, "Banana");
        map.put(2, "Orange");
        map.put(8, "Pineapple");
        map.put(6, "Grapes");


        System.out.println("max length:"+Collections.max(map.values(), Comparator.comparingInt(String::length)));
    }
}

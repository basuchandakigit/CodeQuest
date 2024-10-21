package collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxInMapExample {
    public static void main(String[] args) {
        // Create a map with integer keys and values
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(5, "Banana");
        map.put(2, "Orange");
        map.put(8, "Pineapple");
        map.put(6, "Grapes");

        // Find the maximum key using Collections.max() on the keySet
        Integer maxKey = Collections.max(map.keySet());

        // Find the maximum value using Collections.max() on the values collection
        String maxValue = Collections.max(map.values());

        // Display the results
        System.out.println("Map: " + map);
        System.out.println("Maximum Key: " + maxKey);
        System.out.println("Maximum Value: " + maxValue);
    }
}

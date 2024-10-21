package HCL;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class LargestValueInMap {

    public static void main(String[] args) {
        // Creating a Map with some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 15);

        // Finding the largest value using predefined methods
        int maxValue = Collections.max(map.values());

        // Printing the largest value
        System.out.println("The largest value in the map is: " + maxValue);
    }
}

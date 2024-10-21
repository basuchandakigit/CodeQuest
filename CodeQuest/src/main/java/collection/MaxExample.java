package collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class MaxExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(45);
        numbers.add(32);
        numbers.add(19);
        numbers.add(77);

        // Find the maximum element using Collections.max()
        int maxNumber = Collections.max(numbers);
        int a = Collections.min(numbers);

        // Display the maximum element
        System.out.println("List of numbers: " + a);
        System.out.println("Maximum number: " + maxNumber);
    }
}

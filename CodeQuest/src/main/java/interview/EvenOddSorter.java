package interview;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenOddSorter {
    public static void main(String[] args) {
        String input = "347251908";
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Separate even and odd numbers
        for (char c : input.toCharArray()) {
            int num = Character.getNumericValue(c);
            if (num % 2 == 0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }

        // Sort even numbers in ascending order
        Collections.sort(evenNumbers);

        // Sort odd numbers in descending order
        Collections.sort(oddNumbers, Collections.reverseOrder());

        // Merge them alternately
        StringBuilder result = new StringBuilder();
        int evenIndex = 0, oddIndex = 0;
        while (evenIndex < evenNumbers.size() || oddIndex < oddNumbers.size()) {
            if (evenIndex < evenNumbers.size()) {
                result.append(evenNumbers.get(evenIndex++));
            }
            if (oddIndex < oddNumbers.size()) {
                result.append(oddNumbers.get(oddIndex++));
            }
        }

        System.out.println("Output: " + result.toString());
    }
}

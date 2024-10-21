import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = n - arr[i];
            if (map.containsKey(complement)) {
                return new int[] {complement, arr[i]};
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 18};
        int n = 18;
        int[] result = findTwoSum(arr, n);
        System.out.println("Elements: " + result[0] + ", " + result[1]);
    }
}

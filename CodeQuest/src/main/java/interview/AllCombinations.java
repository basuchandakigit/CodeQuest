package interview;

import java.util.ArrayList;
import java.util.List;

public class AllCombinations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = getAllCombinations(arr);
        System.out.println(result);
    }

    public static List<List<Integer>> getAllCombinations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> combination = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    combination.add(arr[j]);
                }
            }
            result.add(combination);
        }
        return result;
    }
}

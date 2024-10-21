package interview;

import java.util.HashSet;

public class FindPairsWithSum {
	public static void main(String[] args) {
		int[] array = {3,5,1,8};
		int k = 4;
		findPairs(array, k);
	}

	public static void findPairs(int[] array, int k) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			int complement = k - array[i];
			if (set.contains(complement)) {
				System.out.println("(" + array[i] + ", " + complement + ")");
			}
			set.add(array[i]);
		}
		System.out.println(set.size()-1);
	}
}

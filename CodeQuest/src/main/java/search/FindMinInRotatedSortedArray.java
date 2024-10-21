package search;
public class FindMinInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            System.out.println(mid);
            // If the mid element is greater than the high element, the minimum is in the right part
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // Otherwise, the minimum is in the left part including mid
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {7,8,9,10,11,12,13,1,2,3,4,5};
        
        System.out.println("The minimum element is " + findMin(nums));
    }
}

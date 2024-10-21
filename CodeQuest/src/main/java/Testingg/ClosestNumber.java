package Testingg;
public class ClosestNumber {
    public static int findClosest(int[] arr, int target) {
        int closest = arr[0];
        int minDiff = Math.abs(closest - target);

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - target);

            if (diff < minDiff) {
                closest = arr[i];
                minDiff = diff;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,9, 13};
        int target = 5;
        System.out.println("The closest number to " + target + " is " + findClosest(arr, target));
    }
}

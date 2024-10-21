package interview;

public class Close {

    public static int findClosest(int[] arr, int target) {
        int closest = arr[0];
        for (int num : arr) {
            if ((num - target) < (closest - target)) {
                closest = num;
            }
        }
        return closest;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {20,30,88,92,105,200};
	        int target = 4;
	        System.out.println(findClosest(arr, target)); 

}
}

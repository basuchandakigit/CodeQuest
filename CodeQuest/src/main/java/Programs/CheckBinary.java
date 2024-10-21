package Programs;

public class CheckBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=0101;
    System.out.println(isBinary(i));
	}
	  public static boolean isBinary(int number) {
	        // Convert the integer to a string
	        String numStr = String.valueOf(number);

	        // Check each character to see if it's either '0' or '1'
	        for (char c : numStr.toCharArray()) {
	            if (c != '0' && c != '1') {
	                return false;
	            }
	        }

	        return true;
	    }

}

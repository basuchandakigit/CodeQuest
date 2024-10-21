package Programs;

import java.util.Arrays;

public class TestInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s1="risten";
		 String s2="silent";
		 
		 if(s1.length()==s2.length())
		 {
			char arr1[]=s1.toCharArray();
			char arr2[]=s2.toCharArray();
			 Arrays.sort(arr1);
		     Arrays.sort(arr2);
		     if(Arrays.equals(arr1, arr2))
		     {
		    	 System.out.println("Anigram ");
		     }
		     else
		     {
		    	 System.out.println("Not Anigram ");
		     }
		    	 
		 }
	}

}

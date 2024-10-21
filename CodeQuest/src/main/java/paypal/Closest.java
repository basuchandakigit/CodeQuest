package paypal;

import java.util.LinkedHashSet;

public class Closest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,2,8,-1,-2,-3,8,9};
     LinkedHashSet<String> hs=new LinkedHashSet<String>();
     
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length;j++)
    	 {
    		 if(arr[i]+arr[j]==0)
    		 {
    			 hs.add(String.valueOf(arr[i]+","+arr[j]));
    		 }
    	 }
     }
     System.out.println(hs);
	}

}

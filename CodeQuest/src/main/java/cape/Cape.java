package cape;

import java.util.ArrayList;

public class Cape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] ar1={1,2,3,4};
      int[] ar2={3,4,5,6};
      
      ArrayList<Integer> al1=new ArrayList<Integer>();
      ArrayList<Integer> al2=new ArrayList<Integer>();
      ArrayList<Integer> al3=new ArrayList<Integer>();
      for(int i:ar1)
      {
    	  al1.add(i);
      }
      for(int i:ar2)
      {
    	  al2.add(i);
      }
      for(int i:al1)
      {
    	  if(al2.contains(i)) {
    		  al3.add(i);
    	  }

      }
      
    System.out.println(al3);

	}

}

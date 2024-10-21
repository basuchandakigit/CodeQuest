import java.util.ArrayList;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {2,3,4,6,8,9,10};
      int[] arr2=null;
      ArrayList<Integer> al=new ArrayList<Integer>();
      ArrayList<Integer> al2=new ArrayList<Integer>();
      for(int i:arr)
      {
    	  al.add(i);
      }
      for(int i=0;i<arr.length-1;i++)
      {
    	  if(!(al.contains(i)))
    	  {
    		  al2.add(i);
    	  }
      }
      System.out.println(al2);
	}

}

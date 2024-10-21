package Testingg;

import java.util.ArrayList;
import java.util.TreeSet;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,5,9, 13};
     int input=4;
     ArrayList<Integer> al=new ArrayList<Integer>();
     TreeSet<Integer> al2=new TreeSet<Integer>();
     for(int i:arr)
     {
    	 al.add(i);
     }
     if(al.contains(input))
     {
    	 System.out.println(input);
     }
     else
     {
    	 for(int i:al)
    	 {
    	 }
    	
     }
     System.out.println(al2.getFirst());
     
	}

}

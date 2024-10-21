package Navie;

import java.util.ArrayList;
import java.util.Arrays;

public class Trye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        ArrayList<Integer> al1=new ArrayList<Integer>();
        for(int i:nums1)
        {
        	al1.add(i);
        }
        ArrayList<Integer> al2=new ArrayList<Integer>();
        for(int i:nums2)
        {
        	al2.add(i);
        }
        ArrayList<Integer> out1=new ArrayList<Integer>();
        ArrayList<Integer> out2=new ArrayList<Integer>();
        
        for(int i:al1)
        {
        	if(!al2.contains(i))
        	{
        		out1.add(i);
        	}
        }
        for(int i:al2)
        {
        	if(!al1.contains(i))
        	{
        		out2.add(i);
        	}
        }
        
        System.out.println(out1);
        System.out.println(out2);
	}

}

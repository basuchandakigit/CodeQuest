package interview;

import java.util.ArrayList;

public abstract class InterviewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3};
	      String s="";
	      for(int i:arr)
	      {
	        s=s+i;
	      } 
	      System.out.println(s);
	      ArrayList<String> arl=new ArrayList<String>();
	      for(int i=0;i<s.length();i++)
	      {
	       for(int j=1;j<s.length()-1;j++)
	       {
	         String sb=s.substring(i,j);
	       arl.add(sb);
	       }
	      }
	      for(String i:arl)
	      {
	        System.out.print(i);
	      }
	  }
	}



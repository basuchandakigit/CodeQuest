package Mavric;

import java.util.HashSet;

public class ComboOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="ABC";
      StringBuilder sb=new StringBuilder(s);
      HashSet<String> hs=new HashSet<String>();
      for(int i=0;i<s.length();i++)
      {
    	  for(int j=0;j<s.length();j++)
    	  {
    		 sb= (StringBuilder) s.subSequence(i, j);
    	  }
      }
      System.out.println(sb);
	}

}

package Counts;

import java.util.ArrayList;
import java.util.HashSet;

public class Ovals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // String str="interviewaaeeffsss";
     String str= "s1233455";
     
     HashSet<String> hs=new HashSet<String>();
     HashSet<String> hs2=new HashSet<String>();
     HashSet<String> hs3=new HashSet<String>();
     StringBuilder sb=new StringBuilder(str);
     
     int countVowels=0;
    		 
     int countConsonates=0;
     
     boolean b=false;
     
     for(int i=0;i<str.length();i++)
     {
    	 
    	 if((str.charAt(i))=='a'||(str.charAt(i))=='e'||(str.charAt(i))=='i'||(str.charAt(i))=='o'||(str.charAt(i))=='u')
    	 {
    		 hs.add(String.valueOf(str.charAt(i)));
    		 countVowels++;
    		 b=true;
    	 }
    	 else if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
    	 {
    		 hs3.add(String.valueOf(str.charAt(i)));
    		 b=true;
    	 }
    	 else if(!b)
    	 {
    		 hs2.add(String.valueOf(str.charAt(i)));
    	 }
     }
     System.out.println("countVowels:"+hs.size());
     System.out.println("countConsonates:"+hs2.size());
     System.out.println("Numbers:"+hs3.size());
     
     
    		  
	}

}

package capegemini.coll;

import java.util.ArrayList;
import java.util.HashSet;

public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> al=new ArrayList<String>();
     al.add("basu");
     al.add("basu");
     al.add("zerox");
     
     ArrayList arl=removeDubliX(al);
     System.out.println(arl);
     
     
	}
	
	public static ArrayList<String> removeDubliX(ArrayList<String> al)
	{
		   HashSet<String> hs=new HashSet<String>();
		   ArrayList<String> al2=new ArrayList<String>();
		     for(String a:al)
		     {
		    	if(!a.contains("x"))
		    	{
		    		hs.add(a) ;
		    	}
		     }
		     for(String s:hs)
		     {
		    	 al2.add(s);
		     }
		     return al2;
	}

}

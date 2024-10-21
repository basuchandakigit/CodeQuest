package HCL;

import java.util.HashMap;

public class Stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="abcdefab";
    int count=1;
    HashMap<String,Integer> hs=new HashMap<String,Integer>();
    
    for(int i=0;i<str.length();i++)
    {
    	if(hs.containsKey(String.valueOf(str.charAt(i))))
    	{
    		hs.put(String.valueOf(str.charAt(i)), hs.get(String.valueOf(str.charAt(i)))+1);
    	}
    	else
    	{
    		hs.put(String.valueOf(str.charAt(i)), count);
    	}
    }
    System.out.println(hs);
	}

}

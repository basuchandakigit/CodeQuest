package CoreImm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aaabccw";
		char[] ar=input.toCharArray();
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		int count=1;
		for(char a:ar)
		{
			if(hs.containsKey(String.valueOf(a)))
			{
				hs.put(String.valueOf(a), hs.get(String.valueOf(a))+1);
			}
			else
			{
				hs.put(String.valueOf(a), count);
			}
		}
	
		
		
	}

}

package HCL;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		hs.put("basu", 3000);
		hs.put("appu", 2000);
		hs.put("atha", 10000);
		hs.put("ravi", 7000);
		int max=0;
		
		HashMap<String,Integer> hs2=new HashMap<String,Integer>();
		
		for(Map.Entry<String, Integer> me:hs.entrySet())
		{
			 
			if(max<me.getValue())
			{
				max=me.getValue();
			}
		}
		System.out.println(max);
	}

}

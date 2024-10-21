package volks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Strr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my name is basavaraj";
		LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(String.valueOf(s.charAt(i))))
			{
				hm.put(String.valueOf(s.charAt(i)), hm.get(String.valueOf(s.charAt(i)))+1);
			}
			else
			{
				hm.put(String.valueOf(s.charAt(i)), count);
			}
		}
		Map.Entry<String, Integer> hmm= hm.entrySet().iterator().next();
		System.out.println(hmm.getKey());
	}

}

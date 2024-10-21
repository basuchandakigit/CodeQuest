package interview;

import java.util.HashMap;
import java.util.Map;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String input="aabbbccaaa";
     Map<String,Integer> hs=new HashMap<String,Integer>();
     String[] ar= {"a","a","b","b","b","c","c","a","a","a"};
     int count=1;
    // char[] ar=input.toCharArray();
     
     for(int i=0;i<ar.length;i++)
     {
    	 if(hs.containsKey(ar[i]))
    	 {
    		 hs.put(ar[i], (hs.get(ar[i])+1));
    	 }
    	 else
    	 {
    		 hs.put(ar[i],count);
    	 }
     }
}
     
	

}

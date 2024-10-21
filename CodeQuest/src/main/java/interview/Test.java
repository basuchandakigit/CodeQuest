package interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> myMap = new HashMap<>();

        // Add key-value pairs
        myMap.put("apple", 10);
        myMap.put("banana", 5);
        myMap.put("cherry", 8);
        
        for(Entry<String, Integer> em:myMap.entrySet())
        {
        	System.out.println(em.getKey()+":"+em.getValue());
        }
 
	}

}

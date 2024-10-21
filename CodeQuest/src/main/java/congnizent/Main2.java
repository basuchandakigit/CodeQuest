package congnizent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main2 {

    public static void main(String[] args) {
        int[] arr={3,3,3,2,2,1,0,8,7,6,2,1};
        ArrayList<Integer> al=new ArrayList<Integer>();
       for(int i:arr)
       {
           al.add(i);
       }
       int count=1;
       LinkedHashMap<Integer,Integer> hss=new LinkedHashMap<Integer,Integer>();
       for(int i:al)
       {
           if(hss.containsKey(i))
           {
               hss.put(i,hss.get(i)+1);
           }
           else
           {
               hss.put(i,count);
           }
       }
       System.out.println(hss);
       

    }

}
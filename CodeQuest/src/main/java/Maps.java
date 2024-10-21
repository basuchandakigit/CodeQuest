import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Object> al=new ArrayList<Object>();
     al.add("String");
     al.add(false);
     al.add(2);
     
     Map<Object,Object> hs=new HashMap<Object,Object>();
     for(Object o:al)
     {
    	 hs.put(o, o);
     }
     System.out.println(hs);
	}

}

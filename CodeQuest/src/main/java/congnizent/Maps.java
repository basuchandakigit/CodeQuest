package congnizent;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statics s=new Statics();
		s.setAge(100);
		
		Statics s1=new Statics();
		s1.setAge(s.getAge());
		
		System.out.println(s1.getAge());
	}

}

package Map;

import java.util.HashMap;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated me thod stub
    HashMap<Employee,Integer> mp=new HashMap<Employee,Integer>();
    Employee e1=new Employee();
    e1.setId(100);
    e1.setName("basu");
    e1.setSalary(2000);
    Employee e2=new Employee();
    e2.setId(100);
    e2.setName("basu");
    e2.setSalary(2000);
    
    mp.put(e1, 1);
    mp.put(e2, 2);
    System.out.println(mp.size());
	}

}

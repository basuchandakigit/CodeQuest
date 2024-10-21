package Testing;
import java.util.HashMap;


public class Tetsingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Employee e=new Employee(36,"basu");
		Employee e2=new Employee(36,"basu");
		HashMap<Employee,String> hs=new HashMap<Employee,String>();
		hs.put(e, "basu");
		hs.put(e2, "appu");
		
		System.out.println(hs);
		
	}

}

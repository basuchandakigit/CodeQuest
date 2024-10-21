package Programs;

import java.time.LocalDate;
import java.util.Date;

public class Trans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    User a=new User();
   
    a.setDob(LocalDate.of(1988, 7, 7));
  
    
    System.out.println(a.toString());
    System.out.println(a.getAge());
	}

}

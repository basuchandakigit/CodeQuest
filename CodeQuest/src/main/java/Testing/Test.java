package Testing;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = new String[]{"1","11","22","abc","a1","8c","666"};
		
		for(String ss:words)
		{
			if(ss.length()<=1)
			{
				System.out.println(ss);
			}
		}
		
	}

}

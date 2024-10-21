package cape;

public class Stringggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hibasavaraj";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+String.valueOf(s.charAt(i));
		}
		System.out.println(r);
	}

}

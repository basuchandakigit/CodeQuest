package Maps;

public class StringSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		String sb="";
		String sb2="";
		for(int i=0;i<str.length();i++)
		{
			sb=sb+str.substring(i);
			if(!sb.contains(String.valueOf(str.charAt(i))))
			{
				sb2=sb2.strip().substring(i);
			}
		}
		System.out.println(sb2);
	}

}

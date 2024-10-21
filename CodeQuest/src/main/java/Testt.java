import java.util.HashSet;
import java.util.LinkedHashSet;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="rabitt";
   String str2="";
   LinkedHashSet<String> hs=new  LinkedHashSet<String>();
   for(int i=0;i<str.length();i++)
   {
	   hs.add(String.valueOf(str.charAt(i)));
   }
   for(String s:hs)
   {
	   str2=str2+s;
   }
   System.out.println(str2);
	}

}

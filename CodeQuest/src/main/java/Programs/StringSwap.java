package Programs;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a="basu";
    String b="gill";
    System.out.println(a);
    System.out.println(b);
    System.out.println("after swap");
    a=a+b;
    b=a.substring(0, 4);
    a=a.substring(4, 8);
    System.out.println(a);
    System.out.println(b);
	}

}

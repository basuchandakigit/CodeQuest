package practice;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=10;
        int j=5;
		System.out.println("i="+i+","+"j="+j);
		i=i+j;
		j=i-j;
	    i=i-j;
		System.out.println("i="+i+","+"j="+j);
	}

}

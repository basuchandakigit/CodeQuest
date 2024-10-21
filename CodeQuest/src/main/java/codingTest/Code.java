package codingTest;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println((a = 2) * 3);
		
		String str = "Hello";
		System.out.println(str.substring(1, 4));

		
		int x = 7;
		int y = 3;
		System.out.println(x / y);
		System.out.println(x % y);

		
		boolean flag = true;
		System.out.println(flag && (5 > 3));
		System.out.println(flag || (5 < 3));

		int num = 10;
		System.out.println(num++);
		System.out.println(++num);

	}

}

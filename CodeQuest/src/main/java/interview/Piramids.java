package interview;

public class Piramids {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rows=5;
		for(int i=1;i<rows;i++)
		{
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package godigit;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,6,7,0,1,6,0};
		boolean swap=false;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					swap=true;
				}
				
			}
			
		}
		for(int i:a)
		{
			System.out.print(i);
		}
	}

}

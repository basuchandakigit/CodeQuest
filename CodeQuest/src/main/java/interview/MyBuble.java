package interview;

public class MyBuble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {5,4,3,2,1};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i);
		}
	}

}

package interview;

public class BubbleTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 2, 9, 1, 5, 6 }; boolean swapped;
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			 swapped = false;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
					for(int m:arr)
					{
						
						System.out.print(m);
					}
					System.out.println();
				}
			}
			 if (!swapped) {
	                break;
	            }
		}
		for(int i:arr)
		{
			System.out.print(i);
		}
	}

}

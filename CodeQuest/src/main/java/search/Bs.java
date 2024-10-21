package search;

public class Bs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 3,4,5,1,2 };
		 int searchNumber=2;
			int result=binarysearch(arr,searchNumber);
			System.out.println(arr.length-1);
			if(result==-1)
			{
				System.out.println("not found");
			}
			else
			{
				System.out.println("found at "+result);
			}
		}
	
	public static int  binarysearch(int arr[] , int searchNumber)
	{
		
		 int start=0;
		 int end=(arr.length)-1;
		 while(start<=end)
		 {
			 int mid=(start+end)/2;
			 if(searchNumber==arr[mid])
			 {
				 return mid;
			 }
			 if(searchNumber>arr[mid])
			 {
				start=mid+1;
				
			 }
			 else
			 {
				 end=mid-1;
			 }
		 }
		return -1;
	}


}

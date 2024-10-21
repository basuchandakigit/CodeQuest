package interview;

public class ArraysWithEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={3,4,7,2,5,1,9,0,8};
		 int[] odd = null;
		 int[] even = null;
		 
		 for(int i=0;i<ar.length;i++)
		 {
		  if((ar[i])%2==0)
		  {
		  even[i]=ar[i];
		  }
		  else
		  {		  		  
		  odd[i]=ar[i];
		  }
		 }
		  
		  int[] output={0,1};
		  for(int j=0;j<ar.length;j++)
		  {
		   output[j]=even[j]+odd[j];
		  }
		  for(int i=0;i<output.length;i++)
		  {
			  System.out.print(output[i]);
		  }
	}
	
}

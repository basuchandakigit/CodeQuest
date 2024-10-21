
public class EY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {-2, 1, 2 , 0 , -1};
     
     for(int i=0;i<arr.length;i++)
     {
    	 for(int j=0;j<arr.length;j++)
    	 {
    		if(arr[i]+arr[j]==-1)
    		{
    			System.out.println(arr[i]+":"+arr[j]);
    		}
    	 }
     }
	}

}

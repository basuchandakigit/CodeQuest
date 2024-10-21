package Testingg;

public class Closeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,5,8,9,12};
     int target=10;
     
     int mindeff=Math.abs(arr[0]-target);
     int closest=arr[0];
     for(int i=0;i<arr.length;i++)
     {
    	int  deff=Math.abs(arr[i]-target);
    	 if(deff<mindeff)
    	 {
    		 closest=arr[i];
    		 mindeff=deff;
    	 }
     }
     System.out.println(closest);
     
     
	}

}

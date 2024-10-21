package Navie;

public class Numbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3};
		int[] nums2 = {2,4,6};
		int[] out = {0,0,0};
		
		for(int i=0;i<nums1.length-1;i++)
			
		{
			for(int j=0;j<nums1.length-1;j++)
			{
				if(nums1[j]!=nums2[j])
				{
					int k=0;
					
					out[k]=nums1[j];
					k++;
				}
			}
		}
		for(int i:out)
		{
			System.out.print(i);
		}
		
	}

}

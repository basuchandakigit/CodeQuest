package godigit;

import java.lang.reflect.Array;

public class Arrray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a={2,3,6,7,0,1,6,0};
     for(int i=0;i<a.length-1;i++)
     {
    	 int len=a.length-1;
    	    	 if(a[i]==0)
    	 {
    		 a[len]=a[i];
    		 len--;
    		 System.out.println(a[i]);
    		 System.out.print(len);
    	 }
     }
     for(int i:a)
     {
    	// System.out.print(i);
     }
	}

}

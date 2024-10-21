package interview;

import java.util.ArrayList;

public class StartInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {13,7,8,19,25,18,32};
    ArrayList<Integer> arrlst=new ArrayList<Integer>();
    for(int i:arr)
    {
    	if(i>10&&i<20)
    	{
    		arrlst.add(i);
    	}
    }
    for(int i:arrlst)
    {
    	System.out.print(i+",");
    }
	}

}

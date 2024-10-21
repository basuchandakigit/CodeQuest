package Test;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer> inputList=new ArrayList<Integer>();
	inputList.add(1);
	inputList.add(0);
	inputList.add(1);
	inputList.add(0);
	inputList.add(1);
	
	List<Integer> outputList=new ArrayList<Integer>();
	for(int i:inputList)
	{
		if(i==1)
		{
			outputList.addFirst(i);	
		}
		else
		{
			outputList.addLast(i);
		}
	}
	for(int i:outputList)
	{
		System.out.print(i+",");
	}
		
		 
	}

}

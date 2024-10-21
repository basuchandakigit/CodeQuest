package ness;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RmDublicate {

	ArrayList<Integer> rmDubli(List<Integer> al)
	{

	HashSet<Integer> hs=new HashSet<Integer>();

	for(int i:al)
	{
	hs.add(i);
	}

	ArrayList<Integer> rml=new ArrayList<Integer>();
	for(int i:hs)
	{
		rml.add(i);
	}
	
    return rml;

	}

}

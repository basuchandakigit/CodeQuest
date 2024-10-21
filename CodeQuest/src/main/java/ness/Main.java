package ness;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RmDublicate rmd=new RmDublicate();
		List<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4);
		ArrayList<Integer> rml=new ArrayList<Integer>();
		rml=rmd.rmDubli(al);
		System.out.println(rml);
	}

}

package com.colection;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set{
	
	public static void main(String[] args) {
		
		Set<Object>  t=new TreeSet<Object>();
		t.add("E");
		t.add("D");
		t.add("C");
		t.add("B");
		t.add("A");
		t.add("Z");
		System.out.println(t);
		
		int size = t.size();
		System.out.println(size);

		//get Not Supported
		//set not Supported
		
		boolean remove = t.remove("Z");
		System.out.println(remove);
		System.out.println(t);
		

		//indexOf Not Supported
		//lastindexOf Not Supported
		
		boolean contains = t.contains("A");
		System.out.println(contains);
		System.out.println(t);
		
		//t.clear();
		//System.out.println(t);
		
		Set<Object>  t1=new TreeSet<Object>();
		t1.add("I");
		t1.add("J");
		t1.add("G");
		t1.add("H");
		t1.add("F");
		System.out.println(t1);
		
		boolean addAll = t.addAll(t1);
		System.out.println(addAll);
		System.out.println(t);
		
		boolean retainAll = t.retainAll(t1);
		System.out.println(retainAll);
		System.out.println(t);
		
		boolean removeAll = t.removeAll(t1);
		System.out.println(removeAll);
		System.out.println(t);
		
		
		
		
	}

}

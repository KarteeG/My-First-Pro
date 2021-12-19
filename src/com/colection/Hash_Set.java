package com.colection;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
	
	public static void main(String[] args) {
		
		Set <Object> h = new HashSet<Object>();
		h.add("Karthick");
		h.add(121);
		h.add("Ajith");
		h.add(200000);
		h.add("Harsh Ajith");
		System.out.println(h);
		
		int size = h.size();
		System.out.println(size);
		

		//get Not Supported
		//set not Supported
		
		boolean remove = h.remove("Ajith");
		System.out.println(remove);
		System.out.println(h);
		
		//indexOf Not Supported
		//lastindexOf Not Supported
		
		boolean contains = h.contains("Harsh Ajith");
		System.out.println(contains);
		System.out.println(h);
		
		//h.clear();
		//System.out.println(h);
		

		Set <Object> h1 = new HashSet<Object>();
		
		h1.add("Karthick");
		h1.add(12001);
		h1.add("Ajith Kumar");
		h1.add(1200000);
		h1.add("K.Harsh Ajith");
		System.out.println(h1);
		
		boolean addAll = h.addAll(h1);
		System.out.println(addAll);
		System.out.println(h);
		
		boolean retainAll = h.retainAll(h1);
		System.out.println(retainAll);
		System.out.println(h);
		
		boolean removeAll = h.removeAll(h1);
		System.out.println(removeAll);
		System.out.println(h);
		
	
		
		
	}

}

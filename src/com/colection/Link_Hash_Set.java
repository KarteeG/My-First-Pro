package com.colection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Link_Hash_Set {
	
	public static void main(String[] args) {
		
		Set <Object> l = new LinkedHashSet<Object>();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		//get Not Supported
		//set not Supported
		
		boolean remove = l.remove(5);
		System.out.println(remove);
		System.out.println(l);
		

		//indexOf Not Supported
		//lastindexOf Not Supported
		
		boolean contains = l.contains(3);
		System.out.println(contains);
		System.out.println(l);
		
		//l.clear();
		//System.out.println(l);
		
		Set <Object> l1 = new LinkedHashSet<Object>();
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		l1.add(11);
		System.out.println(l1);
		
		boolean addAll = l.addAll(l1);
		System.out.println(addAll);
		System.out.println(l);
		
		boolean retainAll = l.retainAll(l1);
		System.out.println(retainAll);
		System.out.println(l);
		
		boolean removeAll = l.removeAll(l1);
		System.out.println(removeAll);
		System.out.println(l);
	
		
	}

}

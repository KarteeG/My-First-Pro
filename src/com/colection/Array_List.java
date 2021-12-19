package com.colection;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	
	public static void main(String[] args) {
		List<Object> l=new ArrayList<Object>();
		l.add(878);
		l.add("java");
		l.add(687.9787f);
		l.add('m');
		l.add("selinium");
		l.add("java");
		System.out.println(l);
		
		//size(n+)
		int size = l.size();
		System.out.println(size);
		
		//get
		Object object = l.get(5);
		System.out.println(object);
		
		//set
		Object set = l.set(3, 'f');
		System.out.println(set);
		System.out.println(l);
		
		//remove
		Object remove = l.remove(3);
		System.out.println(remove);
		System.out.println(l);
		
		//indexOf
		int indexOf = l.indexOf("java");
		System.out.println(indexOf);
		
		//lastindexOf
		int lastIndexOf = l.lastIndexOf("java");
		System.out.println(lastIndexOf);
		
		//contains
		boolean contains = l.contains("selinium");
		System.out.println(contains);
		
//		//clear
//		l.clear();
//		System.out.println(l);
		
//		addAll
		List<Object> l1=new ArrayList<Object>();
		l1.add(878);
		l1.add("phython");
		l1.add(687.978f);
		l1.add('m');
		l1.add("selenium");
		l1.add("java");
		
		boolean addAll = l.addAll(l1);
		System.out.println(addAll);
		System.out.println(l);
		
		//retainAll
		boolean retainAll = l.retainAll(l1);
		System.out.println(retainAll);
		System.out.println(l);
		
		//removeaAl
		boolean removeAll = l.removeAll(l1);
		System.out.println(removeAll);
		System.out.println(l);
				
	}
}

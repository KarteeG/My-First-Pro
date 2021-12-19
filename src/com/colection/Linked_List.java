package com.colection;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	
	public static void main(String[] args) {
		
		List<Object> l = new LinkedList<Object>();
		List<Object> m = new LinkedList<Object>();
		l.add(1888);
		l.add(121);
		l.add(null);
		m.add("Karthick");
		m.add(1888);
		m.add(57454);
		
		int size = l.size();
		System.out.println(l);
		
		Object object = l.get(1);
		System.out.println(object);
		
		Object set = l.set(2,1);
		System.out.println(set);
		System.out.println(l);
		
		Object remove = l.remove(0);
		System.out.println(remove);
		System.out.println(l);
		
		int indexOf = l.indexOf(121);
		System.out.println(indexOf);
		System.out.println(l);
		
		boolean contains = l.contains(1);
		System.out.println(contains);
		
//		l.clear();
//		System.out.println(l);
		
		boolean addAll = l.addAll(m);
		System.out.println(l);
		
		boolean containsAll = l.containsAll(m);
		System.out.println(l);
		
		boolean retainAll = l.retainAll(m);
		System.out.println(l);
		
		boolean removeAll = l.removeAll(m);
		System.out.println(l);
		
		
		
		
		
		
	}

}


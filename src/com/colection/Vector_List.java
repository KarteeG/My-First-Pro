package com.colection;

import java.util.List;
import java.util.Vector;

public class Vector_List {
	public static void main(String[] args) {
		
		List<Object> l = new Vector<Object>();
		List<Object> k = new Vector<Object>();
		l.add(15);
		l.add(5);
		l.add(45);
		l.add(600);
		k.add(545);
		k.add(5);
		
		int size = k.size();
		System.out.println(size);
		
		Object object = k.get(0);
		System.out.println(object);
		
		Object set = l.set(2, 450);
		System.out.println(set);
		System.out.println(l);
		
		Object remove = l.remove(3);
		System.out.println(remove);
		System.out.println(l);
		
		boolean contains = l.contains(5);
		System.out.println(contains);
		
		int indexOf = l.indexOf(15);
		System.out.println(indexOf);
		
		//l.clear();
		//System.out.println(l);
		
		boolean addAll = l.addAll(k);
		System.out.println(addAll);
		System.out.println(l);
		
		boolean retainAll = l.retainAll(k);
		System.out.println(retainAll);
		System.out.println(l);
		
		boolean removeAll = l.removeAll(k);
		System.out.println(removeAll);
		System.out.println(l);
		
		
		
		
		
		
	}

}

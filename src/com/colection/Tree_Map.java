package com.colection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {
	
	public static void main(String[] args) {
		
		Map<Object, Object> m = new TreeMap<Object,Object>();
		m.put(0, 'Z');
		m.put(1, 'A');
		m.put(2, 'E');
		m.put(3, 'B');
		System.out.println(m);
		
		Object object = m.get(0);
		System.out.println(object);
		
		int size = m.size();
		System.out.println(size);
		
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		boolean containsKey = m.containsKey(2);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue('F');
		System.out.println(containsValue);
		
		Set<Entry<Object,Object>> entrySet = m.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

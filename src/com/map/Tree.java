package com.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Tree {
	
	public static void main(String[] args) {
		
		Map<Object, Object> m = new TreeMap<Object,Object>();
		m.put(5, 6);
		m.put(0, 1);
		m.put(2, 3);
		m.put(4, 5);
		m.put(1, 2);
		m.put(3, 4);
		System.out.println(m);
		
		Object object = m.get(1);
		System.out.println(object);
		
		int size = m.size();
		System.out.println(size);
		
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		boolean containsKey = m.containsKey(3);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(3l);
		System.out.println(containsValue);
		
		Set<Entry<Object,Object>> entrySet = m.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

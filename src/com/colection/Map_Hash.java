package com.colection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Hash {
	
	public static void main(String[] args) {
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		
		m.put(0, 121);
		m.put(1, 200);
		m.put(2, "Karthick");
		m.put(3, "G");
		System.out.println(m);
		
		Object object = m.get(2);
		System.out.println(object);
		
		int size = m.size();
		System.out.println(size);
		
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey(1);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(200);
		System.out.println(containsValue);
		
		Set<Entry<Object,Object>> entrySet = m.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
			
			
		}
		}
		
		
	}


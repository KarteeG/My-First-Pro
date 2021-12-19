package com.colection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHash_Map {
	
	public static void main(String[] args) {
		
		Map<Object, Object> m = new LinkedHashMap<Object, Object>();
		m.put(0, "Karthick");
		m.put(1, "Gopalakrishnan");
		
		int size = m.size();
		System.out.println(size);
		
		Object object = m.get(0);
		System.out.println(object);
		
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = m.values();
		System.out.println(values);
		
		boolean containsKey = m.containsKey(0);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("Gopalakrishnan");
		System.out.println(containsValue);
		
		Set<Entry<Object,Object>> entrySet = m.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
			
			
		}
		
		
		
		
		
		
		
		
		
				
	}

}

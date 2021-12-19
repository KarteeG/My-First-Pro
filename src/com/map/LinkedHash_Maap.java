package com.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHash_Maap {
	
	public static void main(String[] args) {
		
		Map<Object, Object> m = new LinkedHashMap<Object,Object>();
		//put
		m.put(0, "Welcome");
		m.put(1, null);
		m.put(2, "Java");
		m.put(null, "World");
		m.put(4, null);
		System.out.println(m);
		
		//get
		Object object = m.get(null);
		System.out.println(object);
		
		//size
		int size = m.size();
		System.out.println(size);
		
		//keySEt
		Set<Object> keySet = m.keySet();
			System.out.println(keySet);
			
		//values
		Collection<Object> values = m.values();
		System.out.println(values);
		
		//contaisKey
		boolean containsKey = m.containsKey(null);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue(null);
		System.out.println(containsValue);
		
		Set<Entry<Object,Object>> entrySet = m.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
			
			
		}
		
		
		
			
			
		
		
		
		
		
		
		
		
		
			}
	
	

}

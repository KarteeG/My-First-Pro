package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Map_Hashed {
	
	public static void main(String[] args) {
		
		Map<Object, Object> m = new HashMap<Object,Object>();
		//put
		m.put(1, "c");
		m.put(2, "Phython");
		m.put(null, null);
		m.put(null, "Java");
		m.put(3, null);
		System.out.println(m);
		
		//size
		int size = m.size();
		System.out.println(size);
		
		//get
		Object object = m.get(null);
		System.out.println(object);
		
		//keyset
		Set<Object> keySet = m.keySet();
		System.out.println(keySet);
		
		//values
		Collection<Object> values = m.values();
		System.out.println(values);
		
		//containsKey
		boolean containsKey = m.containsKey(null);
		System.out.println(containsKey);
		
		//containsValue
		boolean containsValue = m.containsValue("Java");
		System.out.println(containsValue);
		
		//entrySet
		Set<Entry<Object,Object>> entrySet = m.entrySet();
		for (Entry<Object, Object> entry : entrySet) {
			System.out.println(entry);
			
			
		}
			
		
		
		
		
		
	}

}

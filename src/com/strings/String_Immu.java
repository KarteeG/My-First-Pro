package com.strings;

public class String_Immu {
	
	public static void main(String[] args) {
		String a="Karthick";
		String b="Revathy";
		
		int identityHashCode = System.identityHashCode(a);
		System.out.println("Dupilicate Value:  "+identityHashCode);
		
		int identityHashCode2 = System.identityHashCode(b);
		System.out.println("Dupilicate Value:  "+identityHashCode2);
		
		String concat = a.concat(b);
		System.out.println(concat);
		
		int identityHashCode3 = System.identityHashCode(concat);
		System.out.println("Concat   "+identityHashCode3);
		
	}

}

package com.strings;

public class Muted_Builder {
	public static void main(String[] args) {
		StringBuilder a=new StringBuilder("Revathy");
		StringBuilder b=new StringBuilder("Karthick");
		
		int identityHashCode = System.identityHashCode(a);
		System.out.println("Dupilate Value  "+identityHashCode);
		
		int identityHashCode2 = System.identityHashCode(b);
		System.out.println("Dupilicate Value:  "+ identityHashCode2);
		
		StringBuilder append = a.append(b);
		System.out.println(append);
		
		int identityHashCode3 = System.identityHashCode(append);
		System.out.println("Append is :     "+ identityHashCode3);
		
	}

}

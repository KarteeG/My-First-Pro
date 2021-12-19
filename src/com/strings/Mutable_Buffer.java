package com.strings;

public class Mutable_Buffer {
	
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("Revathy");
		StringBuffer b=new StringBuffer("Karthick");
		
		int identityHashCode = System.identityHashCode(a);
		System.out.println("Dupilate Value  "+identityHashCode);
		
		int identityHashCode2 = System.identityHashCode(b);
		System.out.println("Dupilicate Value:  "+ identityHashCode2);
		
		StringBuffer append = a.append(b);
		System.out.println(append);
		
		int identityHashCode3 = System.identityHashCode(append);
		System.out.println("Append is :     "+ identityHashCode3);
		
	}

}

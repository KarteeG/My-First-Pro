package com.convrsions;

public class Int_To_String {
	
	

	public static void main(String[] args) {
		
		int a =20;
		
		String string = Integer.toString(a);
		
		System.out.println(string);
		
		String c = String.valueOf(a);
		
		System.out.println(c);
		
		String format = String.format("%d", a);
		
		System.out.println(format);
	}
	
}

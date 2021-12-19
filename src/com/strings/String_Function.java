package com.strings;



public class String_Function {
	
	public static void main(String[] args) {
		String s ="Java World";
		
		int length = s.length();
		System.out.println(length);
		
		boolean equals = s.equals("java World");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("java world");
		System.out.println(equalsIgnoreCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		boolean startsWith = s.startsWith("Java");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("World");
		System.out.println(endsWith);
		
		boolean contains = s.contains("J");
		System.out.println(contains);
		
		int indexOf = s.indexOf("o");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("d");
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(3);
		System.out.println(charAt);
		
		String replace = s.replace("World", "Welcome");
		System.out.println(replace);
		
		String substring = s.substring(0);
		System.out.println(substring);
		
		String a="";
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		String[] split = s.split(" ");
		for (String string : split) {
			System.out.println(string);
			
		String c="  Is  Karthick  ";
			String trim = c.trim();
			System.out.println(trim);
			
		String concat = s.concat(c);
		System.out.println(concat);
			
		
			
			
		}
		
		
		
		
		
		
	}

}

package com.exception;

public class Exception_Handling {
	
	public static void main(String[] args) {
		String s="Java";
		try {
			s.charAt(7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exceuted String");
		}
		
		int a =10;
		try {
			System.out.println(a/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Executed Arithimetic");
		}
		finally {
			System.out.println("Completed");
		}
		
		
		
	
		int b=12;
		int c=24,d;
		d=b+c;
		System.out.println("Sum of"  +d);
	}

}

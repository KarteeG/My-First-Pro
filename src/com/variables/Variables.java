package com.variables;

public class Variables {
	static String a="Karthick";
	static byte b=121;
	int c= 15400;
	short d = 5454;
	private void code() {
		float e=15.565f;
		System.out.println(e);
		
	}
	private void salary() {
		long f=250000;
		System.out.println(f);
	}
	private void pin() {
		System.out.println(c);
	}
	private void pass() {
		System.out.println(d);
	}
	public static void main(String[] args) {
		Variables s= new Variables();
		s.code();
		s.salary();
		s.pass();
		s.pin();
		System.out.println(a);
		System.out.println(b);
	}
	
}

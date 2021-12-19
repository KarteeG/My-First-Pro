package com.variables;

public class Local {
		
	private void name() {
		String a="Karthick";
		System.out.println(a);
		
	}
	private void code() {
		int b=151;
		System.out.println(b);
	}
	public static void main(String[] args) {
		Local a=new Local();
		a.name();
		a.code();
	}

}

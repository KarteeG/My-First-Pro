package com.contructor;

public class Cons {
	
	public Cons() {
		System.out.println("Karthick");
	}
	public Cons(float id) {
		this();
		System.out.println(id);
	}
	public Cons(long salary) {
		this(15.50f);
		System.out.println(salary);
	}
	public static void main(String[] args) throws Throwable {
		Cons a=new Cons(250000);
		a.finalize();
				
	}

}

package com.abstraction;

public class Abs_Child extends Abs_Parent{
	
	@Override
	public void salary() {
		System.out.println("250000");
	}
	public static void main(String[] args) {
		Abs_Child a=new Abs_Child();
		a.name();
		a.idno();
		a.salary();
	}

}

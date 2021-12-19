package com.polimorphism;

public class Override_Child extends Override_Parent {
	
	private void salary() {
		System.out.println(250000);
	}
	@Override
	public void employee(String name) {
		super.employee(name);
	}
	@Override
	public void employee(int code) {
		super.employee(code);
	}
	public static void main(String[] args) {
		Override_Child a=new Override_Child();
		a.employee("karthick");
		a.employee(21);
		a.salary();
	}

}

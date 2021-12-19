package com.abstraction;

public class Interface_Child2 implements Interface_Child1,Interface_Parent {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Karthick");
		
	}

	@Override
	public void cellno() {
		// TODO Auto-generated method stub
		System.out.println(926660256);
		
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
		System.out.println(121);
		
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println(2500000);
		
	}
	public static void main(String[] args) {
		Interface_Child2 a=new Interface_Child2();
		a.name();
		a.cellno();
		a.code();
		a.salary();
		
		
		
	}

}

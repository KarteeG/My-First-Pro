package com.inheritence;

public class Single_Child extends Single_Parent {
	
	private void Myname() {
		System.out.println("Karthick");
	}
	@Override
	public void Fathername() {
		// TODO Auto-generated method stub
		super.Fathername();
	}
	
	@Override
	public void Mothername() {
		// TODO Auto-generated method stub
		super.Mothername();
	}
	public static void main(String[] args) {
		Single_Child a=new Single_Child();
		a.Fathername();
		a.Mothername();
		a.Myname();
	}
	
}



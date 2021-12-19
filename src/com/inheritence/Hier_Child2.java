package com.inheritence;

public class Hier_Child2 extends Hier_Parent{
	
	private void Wife() {
		System.out.println("Revathy");
	}
	
	@Override
	public void Fathename() {
		// TODO Auto-generated method stub
		super.Fathename();
	}
	
	@Override
	public void Mothername() {
		// TODO Auto-generated method stub
		super.Mothername();
	}
		public static void main(String[] args) {
			Hier_Child1 a=new Hier_Child1();
			Hier_Child2 b=new Hier_Child2();
			a.Fathename();
			a.Mothername();
			a.son();
			b.Fathename();
			b.Mothername();
			b.Wife();
				
		}

}

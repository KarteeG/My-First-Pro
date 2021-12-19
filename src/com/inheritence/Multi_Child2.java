package com.inheritence;

public class Multi_Child2 extends Multi_Child1 {
	private void Sports() {
		System.out.println("Sports");
	}
	@Override
	public void Singing() {
		// TODO Auto-generated method stub
		super.Singing();
	}
	@Override
	public void Dance() {
		// TODO Auto-generated method stub
		super.Dance();
	}
	public static void main(String[] args) {
		Multi_Child2 a=new Multi_Child2();
		a.Singing();
		a.Dance();
		a.Sports();
	}

}

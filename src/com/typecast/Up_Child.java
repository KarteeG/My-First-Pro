package com.typecast;

public class Up_Child extends Up_Parent{
	
	private void Studentid() {
		System.out.println(2500);
	}
	@Override
	public void Student_Name() {
		// TODO Auto-generated method stub
		super.Student_Name();
	}
	public static void main(String[] args) {
		Up_Parent a=new Up_Child();
		a.Student_Name();
	}
}

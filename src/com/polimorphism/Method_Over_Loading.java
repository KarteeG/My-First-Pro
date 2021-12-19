package com.polimorphism;

public class Method_Over_Loading {
	
	private void Student(String name) {
		System.out.println("Student name :  " +  name);

	}
	private void Student(char sec) {
	System.out.println("Student Section:  "  +sec);
	}
	private void Student(int std) {
		System.out.println("Student Standard:  " +std);
	}
	public static void main(String[] args) {
		Method_Over_Loading a=new Method_Over_Loading();
		a.Student('A');
		a.Student(2);
		a.Student("Harsh Ajith");
	}

}

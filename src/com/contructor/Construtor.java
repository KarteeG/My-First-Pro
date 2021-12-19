package com.contructor;


public class Construtor {
	
	public Construtor() {
		System.out.println("Karthick");
	}
	public Construtor(int id) {
		System.out.println(id);
	}
	public Construtor(char sec) {
		System.out.println(sec);
	}
	public static void main(String[] args) {
		Construtor a=new Construtor();
		Construtor b=new Construtor(25);
		Construtor c=new Construtor('A');
		
	}

}

package com.exception;

public class ExceptionHand123  {

	
	private static void add() throws Exception   {
		int a = 10;
		System.out.println(a/0);
		throw new ArithmeticException();
		
		
	}
	private static void cellno() {
		System.out.println("986568");

	}
	
	public static void main(String[] args) throws Exception  {
		add();
		cellno();
		System.out.println("Completed");
		
	}

	}

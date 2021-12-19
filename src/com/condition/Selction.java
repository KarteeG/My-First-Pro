package com.condition;

import java.util.Scanner;

public class Selction {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Marks");
		 int i = s.nextInt();
		if (i>=50 && i<=100 ) {
			System.out.println("First");
		}
			else if (i>=40 && i<=49) {
				System.out.println("Second");
			}
			else {
				System.out.println("Just Pass");
			
		}
		
	}

}
